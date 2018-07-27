package com.code.AVIC_RCD;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractListModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JToolBar;
import javax.swing.JTree;
import javax.swing.ListSelectionModel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import org.eclipse.wb.swing.FocusTraversalOnArray;

import com.jgoodies.forms.factories.FormFactory;
import com.jgoodies.forms.layout.CellConstraints;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.RowSpec;

public class V0502Examine extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					V0502Examine frame = new V0502Examine();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public V0502Examine() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 213, 405, 108);
		contentPane.add(scrollPane);
		
		// Table
		table = new JTable();
		table.setForeground(Color.RED);
		table.setCellSelectionEnabled(true);
		table.setFillsViewportHeight(true);
		table.setToolTipText("This is a tabel.");
		table.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		table.setBackground(Color.LIGHT_GRAY);
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		table.getTableHeader().setReorderingAllowed(false);
		table.getTableHeader().setResizingAllowed(false);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column"
			}
		));
		scrollPane.setViewportView(table);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setViewportBorder(new LineBorder(Color.RED));
		scrollPane_1.setBounds(425, 213, 249, 239);
		contentPane.add(scrollPane_1);
		
		JPanel panel = new JPanel();
		panel.setToolTipText("");
		scrollPane_1.setViewportView(panel);
		panel.setLayout(null);
		
		JTree tree = new JTree();
		tree.setBounds(20, 31, 215, 76);
		panel.add(tree);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(0, 0, 79, 21);
		panel.add(comboBox);
		
		JList list = new JList();
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"1快速机动爱神的箭", "将发送旅客", "2法师打发士大夫", "了发生的发生", "3飞洒地方撒旦法", "   3.1打发沙发沙发"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.setBounds(20, 117, 215, 108);
		panel.add(list);
		panel.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{comboBox, tree}));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 331, 405, 121);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JSplitPane splitPane = new JSplitPane();
		splitPane.setContinuousLayout(true);
		splitPane.setBounds(10, 43, 196, 34);
		panel_1.add(splitPane);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("New check box");
		splitPane.setLeftComponent(chckbxNewCheckBox_1);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("New radio button");
		splitPane.setRightComponent(rdbtnNewRadioButton_1);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
		tabbedPane.setBounds(216, 10, 126, 72);
		panel_1.add(tabbedPane);
		
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_1.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
		tabbedPane.addTab("New tab", null, tabbedPane_1, null);
		
		JTabbedPane tabbedPane_2 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_2.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
		tabbedPane.addTab("New tab", null, tabbedPane_2, null);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBackground(Color.YELLOW);
		toolBar.setBounds(0, 94, 365, 17);
		panel_1.add(toolBar);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("New check box");
		toolBar.add(chckbxNewCheckBox);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBackground(Color.MAGENTA);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		toolBar.add(btnNewButton);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("New radio button");
		toolBar.add(rdbtnNewRadioButton);
		
		// FormLayout布局的面板
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBackground(Color.PINK);
		panel_2.setBounds(10, 10, 664, 190);
		contentPane.add(panel_2);
		String packageLayout1 = "left:50dlu, 7dlu, fill:0dlu:grow(0.5), 7dlu, 50dlu, 16dlu,"
            + "left:50dlu, 7dlu, fill:0dlu:grow(0.5), 7dlu, 50dlu";
		String packageLayout2 = "left:50dlu, 7dlu, fill:0dlu:grow(0.5), 16dlu,"
			+ "left:50dlu, 7dlu, fill:0dlu:grow(0.5)";
		
		FormLayout layout7 = new FormLayout("fill:pref:grow(0.5), pref, 20dlu, pref, right:pref:grow(0.5)", "5dlu,pref,5dlu");
		FormLayout layout6 = new FormLayout("left:58dlu, 7dlu, fill:0dlu:grow(0.5), 7dlu, 50dlu, 16dlu,"
                + "left:50dlu, 7dlu, fill:0dlu:grow(0.5), 7dlu, 50dlu", "7dlu, 50dlu");
		FormLayout layout5 = new FormLayout("40dlu, fill:pref:grow, 30dlu, fill:pref:grow, 60dlu, fill:pref:grow, 40dlu",
                "pref");
		FormLayout layout4 = new FormLayout("50dlu, fill:pref:grow, fill:pref:grow, 50dlu",
				"5dlu, fill:pref:grow(0.5), 5dlu, fill:pref:grow(0.5), 7dlu, 25dlu");
		FormLayout layout3 = new FormLayout(packageLayout2,"50dlu");
		FormLayout layout2 = new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("left:50dlu"),
				FormFactory.UNRELATED_GAP_COLSPEC,
				ColumnSpec.decode("0dlu:grow(0.5)"),
				FormFactory.UNRELATED_GAP_COLSPEC,
				ColumnSpec.decode("50dlu"),
				ColumnSpec.decode("16dlu"),
				ColumnSpec.decode("left:50dlu"),
				FormFactory.UNRELATED_GAP_COLSPEC,
				ColumnSpec.decode("0dlu:grow(0.5)"),
				FormFactory.UNRELATED_GAP_COLSPEC,
				ColumnSpec.decode("50dlu"),},
			new RowSpec[] {RowSpec.decode("5dlu"),});
		FormLayout layout = new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("10dlu"),
				ColumnSpec.decode("pref:grow"),
				FormFactory.LABEL_COMPONENT_GAP_COLSPEC,
				ColumnSpec.decode("10dlu"),},
			new RowSpec[] {
				RowSpec.decode("5dlu"),
				FormFactory.PREF_ROWSPEC,
				RowSpec.decode("5dlu"),
				RowSpec.decode("fill:max(54dlu;pref):grow(0.5)"),
				FormFactory.UNRELATED_GAP_ROWSPEC,
				RowSpec.decode("25dlu"),});
		panel_2.setLayout(layout7);
		CellConstraints cc = new CellConstraints();
	}
}
