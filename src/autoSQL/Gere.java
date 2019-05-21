package autoSQL;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.LinkedHashMap;

import javax.swing.table.DefaultTableModel;

public class Gere {
	public static void gere(String startNo, String editor, String tableName, String tableComm, DefaultTableModel tm) {
		LinkedHashMap<String, String> typeMap = Gere.getTypeData(tm);
		LinkedHashMap<String, String> commonMap = Gere.getCommonData(tm);
		LinkedHashMap<String, Boolean> nullMap = Gere.getNullData(tm);
		int startNum = Integer.valueOf(startNo);
		String no = String.valueOf(startNum);
		while (no.length() < 3) {
			no = "0" + no;
		}
		try {
			File file = new File(no + "_ommdata_ddl_create_" + tableName + "_" + editor + ".sql");
			FileOutputStream out = new FileOutputStream(file, false);
			StringBuffer sb = new StringBuffer();
			sb.append("create table " + tableName + " \r\n");
			sb.append("( \r\n");
			for (String filed : typeMap.keySet()) {
				sb.append("  " + filed + "     " + typeMap.get(filed) + Gere.getNull(filed, nullMap) + ", \r\n");
			}
			sb.deleteCharAt(sb.lastIndexOf(","));
			sb.append("); \r\n");
			sb.append("comment on table " + tableName + " is '" + tableComm + "'; \r\n");
			for (String filed : commonMap.keySet()) {
				sb.append("comment on column " + tableName + "." + filed + " is '" + commonMap.get(filed) + "'; \r\n");
			}
			out.write(sb.toString().getBytes("utf-8"));
			out.flush();
			out.close();

			startNum = startNum + 1;
			no = String.valueOf(startNum);
			while (no.length() < 3) {
				no = "0" + no;
			}
			file = new File(no + "_ommdata_ddl_syn_" + tableName + "_" + editor + ".sql");
			out = new FileOutputStream(file, false);
			sb = new StringBuffer();
			sb.append("create public synonym " + tableName + " for OMMDATA." + tableName + "; \r\n");
			out.write(sb.toString().getBytes("utf-8"));
			out.flush();
			out.close();

			startNum = startNum + 1;
			no = String.valueOf(startNum);
			while (no.length() < 3) {
				no = "0" + no;
			}
			file = new File(no + "_ommdata_ddl_grt_" + tableName + "_" + editor + ".sql");
			out = new FileOutputStream(file, false);
			sb = new StringBuffer();
			sb.append("grant select, insert, update, delete on OMMDATA." + tableName + " to OMMOPR;");
			sb.append("grant select on OMMDATA." + tableName + " to devsup01;");
			out.write(sb.toString().getBytes("utf-8"));
			out.flush();
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static LinkedHashMap<String, String> getTypeData(DefaultTableModel tm) {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		for (int i = 0; i < tm.getRowCount(); i++) {
			map.put((String) tm.getValueAt(i, 1), (String) tm.getValueAt(i, 2));
		}
		return map;
	}

	private static LinkedHashMap<String, String> getCommonData(DefaultTableModel tm) {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		for (int i = 0; i < tm.getRowCount(); i++) {
			map.put((String) tm.getValueAt(i, 1), (String) tm.getValueAt(i, 3));
		}
		return map;
	}

	private static LinkedHashMap<String, Boolean> getNullData(DefaultTableModel tm) {
		LinkedHashMap<String, Boolean> map = new LinkedHashMap<String, Boolean>();
		for (int i = 0; i < tm.getRowCount(); i++) {
			map.put((String) tm.getValueAt(i, 1), (Boolean) tm.getValueAt(i, 4));
		}
		return map;
	}

	private static String getNull(String filed, LinkedHashMap<String, Boolean> map) {
		return map.get(filed) ? "" : " not null ";
	}
}
