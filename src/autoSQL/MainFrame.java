package autoSQL;

import javax.swing.table.DefaultTableModel;

public class MainFrame extends javax.swing.JFrame {

	private static final long serialVersionUID = 621549132742507169L;

	public MainFrame() {
		initComponents();
	}


	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jScrollPane1 = new javax.swing.JScrollPane();
		jTable1 = new javax.swing.JTable();
		addButton = new javax.swing.JButton();
		delButton = new javax.swing.JButton();
		jButton1 = new javax.swing.JButton();
		jTextField1 = new javax.swing.JTextField();
		jTextField2 = new javax.swing.JTextField();
		jTextField3 = new javax.swing.JTextField();
		jCheckBox1 = new javax.swing.JCheckBox();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jTable1.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] { { new Integer(1), "ID", "VARCHAR2(64)", "UUID", new Boolean(true) } },
				new String[] { "序号", "字段名称", "字段类型", "注释", "是否允许空" }) {
			Class[] types = new Class[] { java.lang.Integer.class, java.lang.String.class, java.lang.String.class,
					java.lang.String.class, java.lang.Boolean.class };
			boolean[] canEdit = new boolean[] { false, true, true, true, true };

			public Class getColumnClass(int columnIndex) {
				return types[columnIndex];
			}

			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return canEdit[columnIndex];
			}
		});
		jTable1.setColumnSelectionAllowed(true);
		jScrollPane1.setViewportView(jTable1);
		if (jTable1.getColumnModel().getColumnCount() > 0) {
			jTable1.getColumnModel().getColumn(0).setResizable(false);
			jTable1.getColumnModel().getColumn(0).setPreferredWidth(5);
		}

		addButton.setText("添加一行");
		addButton.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				addButtonMouseClicked(evt);
			}
		});

		delButton.setText("删除该行");
		delButton.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				delButtonMouseClicked(evt);
			}
		});

		jButton1.setText("生成SQL");
		jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jButton1MouseClicked(evt);
			}
		});

		jCheckBox1.setText("是否生成留痕SQL");

		jLabel1.setText("起始号");

		jLabel2.setText("编辑人");

		jLabel3.setText("表名");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING,
						javax.swing.GroupLayout.DEFAULT_SIZE, 986, Short.MAX_VALUE)
				.addGroup(layout.createSequentialGroup().addGap(70, 70, 70).addGroup(layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
						.addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
						.addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
								.addComponent(jTextField2).addComponent(jTextField1))
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
								.createSequentialGroup()
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
										.addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(addButton, javax.swing.GroupLayout.DEFAULT_SIZE, 114,
												Short.MAX_VALUE))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(delButton, javax.swing.GroupLayout.PREFERRED_SIZE, 124,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap())
								.addGroup(layout.createSequentialGroup().addGap(50, 50, 50)
										.addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 127,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addContainerGap()
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jCheckBox1).addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE,
										23, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(layout.createSequentialGroup()
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(18, 18, 18)
										.addGroup(layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
												.addComponent(addButton, javax.swing.GroupLayout.DEFAULT_SIZE, 34,
														Short.MAX_VALUE)
												.addComponent(delButton, javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
								.addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jScrollPane1,
								javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)));

		pack();
	}// </editor-fold>

	private void addButtonMouseClicked(java.awt.event.MouseEvent evt) {
		DefaultTableModel tm = (DefaultTableModel) jTable1.getModel();
		int index = (int) tm.getValueAt(tm.getRowCount() - 1, 0);
		index = index + 1;
		tm.addRow(new Object[] { index, "", "VARCHAR2(64)", "", new Boolean(true) });
		jTable1.setModel(tm);
	}

	private void delButtonMouseClicked(java.awt.event.MouseEvent evt) {
		DefaultTableModel tm = (DefaultTableModel) jTable1.getModel();
		tm.removeRow(jTable1.getSelectedRow());
	}

	private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {
		// TODO add your handling code here:
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
		// (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
		 * look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new MainFrame().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify
	private javax.swing.JButton addButton;
	private javax.swing.JButton delButton;
	private javax.swing.JButton jButton1;
	private javax.swing.JCheckBox jCheckBox1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTable jTable1;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField2;
	private javax.swing.JTextField jTextField3;
	// End of variables declaration
}