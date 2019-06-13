package autoSQL;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.LayoutManager;

import javax.swing.BorderFactory;
import javax.swing.DefaultCellEditor;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableModel;

public class SecondFrame {
	JTextField text1 = new JTextField(15);
	JTextField text2 = new JTextField(15);
	JTextField text3 = new JTextField(15);
	JTextField text4 = new JTextField(15);
	JTextField text5 = new JTextField(15);
	JTextField text6 = new JTextField(15);
	JLabel jl1 = new JLabel("起始编号");
	JLabel jl2 = new JLabel("编辑人");
	JLabel jl3 = new JLabel("表名");
	JLabel jl4 = new JLabel("表注释");
	JButton jb1 = new JButton("留痕SQL");
	JButton jb2 = new JButton("插入一行");
	JButton jb3 = new JButton("删除选中行");
	JButton jb4 = new JButton("生成SQL文件");

	public static void main(String[] args) {
		SecondFrame.setUIFont();
		SecondFrame sf = new SecondFrame();
		sf.init();
	}

	public void init() {
		JTable jt = this.getTable();
		
		JScrollPane jScrollPane1 = new JScrollPane();
		jScrollPane1.setSize(900, 300);
		jScrollPane1.setViewportView(jt);
		
		JFrame frame = new JFrame("SQL生成器");
		frame.setFont(new Font("微软雅黑", 0, 12));
		frame.setSize(900, 800);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.add(contrPanel());
		frame.add(infoPanel());
		frame.add(jScrollPane1);
		frame.setLayout(new FlowLayout(FlowLayout.CENTER));
		frame.setVisible(true);
	}

	private JPanel infoPanel() {
		JPanel panel = new JPanel(new GridLayout(4, 2, 10, 10));
		panel.setSize(150, 200);
		panel.add(jb1);
		panel.add(jb2);
		panel.add(jb3);
		panel.add(jb4);
		return panel;
	}

	private JPanel contrPanel() {
		JPanel panel = new JPanel(new GridLayout(4, 1, 10, 10));
		panel.setSize(80, 200);
		panel.add(jl1);
		panel.add(text1);
		panel.add(jl2);
		panel.add(text2);
		panel.add(jl3);
		panel.add(text3);
		panel.add(jl4);
		panel.add(text4);
		return panel;
	}

	private JTable getTable() {
		JTable table = new JTable(
				new Object[][] { { new Integer(1), "ID", "VARCHAR2(64)", "UUID", new Boolean(true) } },
				new String[] { "序号", "字段名称", "字段类型", "注释", "是否允许空" });
		table.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
		table.setRowHeight(26);
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.getTableHeader().setReorderingAllowed(false);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_SUBSEQUENT_COLUMNS);
		table.getColumnModel().getColumn(0).setPreferredWidth(5);
		table.getColumnModel().getColumn(2).setCellEditor(setTypeEditor());
		return table;

	}

	private TableCellEditor setTypeEditor() {
		JComboBox<String> jcb = new JComboBox<String>();
		jcb.addItem("VARCHAR2(64)");
		jcb.addItem("DATE");
		jcb.addItem("NUMBER");
		jcb.setEditable(true);
		TableCellEditor tce = new DefaultCellEditor(jcb);
		return tce;
	}

	private TableModel getModel() {
		TableModel tm = new DefaultTableModel();
		return tm;
	}

	public static void setUIFont() {
		Font f = new Font("微软雅黑", Font.PLAIN, 14);
		String names[] = { "Label", "CheckBox", "PopupMenu", "MenuItem", "CheckBoxMenuItem", "JRadioButtonMenuItem",
				"ComboBox", "Button", "Tree", "ScrollPane", "TabbedPane", "EditorPane", "TitledBorder", "Menu",
				"TextArea", "OptionPane", "MenuBar", "ToolBar", "ToggleButton", "ToolTip", "ProgressBar", "TableHeader",
				"Panel", "List", "ColorChooser", "PasswordField", "TextField", "Table", "Label", "Viewport",
				"RadioButtonMenuItem", "RadioButton", "DesktopPane", "InternalFrame" };
		for (String item : names) {
			UIManager.put(item + ".font", f);
		}
	}

}
