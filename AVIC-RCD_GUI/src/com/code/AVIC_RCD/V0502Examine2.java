package com.code.AVIC_RCD;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.ListSelectionModel;
import javax.swing.JCheckBox;
import javax.swing.JList;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.UIManager;
import javax.swing.AbstractListModel;
import javax.swing.JTree;
import javax.swing.JComboBox;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JToolBar;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import com.jgoodies.forms.layout.CellConstraints;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.builder.PanelBuilder;
import com.jgoodies.forms.factories.Borders;
import com.jgoodies.forms.factories.FormFactory;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

public class V0502Examine2 extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					V0502Examine2 frame = new V0502Examine2();
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
	public V0502Examine2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 213, 405, 108);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setFillsViewportHeight(true);
		table.setToolTipText("");
		table.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		table.setBackground(Color.LIGHT_GRAY);
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
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
		tree.setBounds(41, 72, 167, 142);
		panel.add(tree);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(0, 0, 79, 21);
		panel.add(comboBox);
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
		panel_2.setBounds(10, 10, 664, 190);
		contentPane.add(panel_2);
		FormLayout layout = new FormLayout("4dlu, fill:pref:grow",
                "pref, 5dlu, pref, 5dlu, "
                + "pref, 5dlu, fill:pref:grow(0.5), 7dlu, 25dlu");
		panel_2.setLayout(layout);
		CellConstraints cc = new CellConstraints();
	}
}
