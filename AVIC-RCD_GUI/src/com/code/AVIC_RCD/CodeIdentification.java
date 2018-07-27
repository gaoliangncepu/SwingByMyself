package com.code.AVIC_RCD;

import java.awt.*;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import net.miginfocom.swing.MigLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.CardLayout;
import java.awt.event.KeyEvent;
import javax.swing.border.TitledBorder;


public class CodeIdentification extends JFrame {
	private JTextField textField;
	private JPasswordField passwordField;
	private JTable table;
	public CodeIdentification() {
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 672, 72);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JPopupMenu popupMenu = new JPopupMenu();
		addPopup(panel, popupMenu);
		popupMenu.setToolTipText("JPopupMenu");
		popupMenu.setLabel("JPopupMenu");
		popupMenu.setBounds(-10008, -10102, 55, 72);
		
		JMenuItem menuItem = new JMenuItem("1");
		popupMenu.add(menuItem);
		
		JMenuItem menuItem_1 = new JMenuItem("2");
		popupMenu.add(menuItem_1);
		
		JMenuItem menuItem_2 = new JMenuItem("3");
		popupMenu.add(menuItem_2);
		
		JRadioButtonMenuItem rdbtnmntmNewRadioItem = new JRadioButtonMenuItem("New radio item");
		popupMenu.add(rdbtnmntmNewRadioItem);
		
		JCheckBoxMenuItem chckbxmntmNewCheckItem = new JCheckBoxMenuItem("New check item");
		popupMenu.add(chckbxmntmNewCheckItem);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_3.setBounds(0, 0, 412, 34);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setToolTipText("123");
		menuBar.setBounds(32, 5, 348, 24);
		panel_3.add(menuBar);
		
		JMenuItem mntmFile = new JMenuItem("File");
		mntmFile.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_UNDEFINED, 0));
		mntmFile.setSelected(true);
		menuBar.add(mntmFile);
		
		JMenuItem mntmTools = new JMenuItem("tools");
		mntmTools.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_UNDEFINED, 0));
		menuBar.add(mntmTools);
		
		JMenuItem mntmWindow = new JMenuItem("window");
		menuBar.add(mntmWindow);
		
		JSlider slider = new JSlider();
		slider.setBounds(29, 44, 200, 23);
		panel.add(slider);
		
		JMenu mnNewMenu = new JMenu("New menu");
		mnNewMenu.setBounds(267, 44, 109, 22);
		panel.add(mnNewMenu);
		
		JCheckBoxMenuItem chckbxmntmNewCheckItem_1 = new JCheckBoxMenuItem("New check item");
		mnNewMenu.add(chckbxmntmNewCheckItem_1);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("New menu item");
		mnNewMenu.add(mntmNewMenuItem);
		
		JRadioButtonMenuItem rdbtnmntmNewRadioItem_1 = new JRadioButtonMenuItem("New radio item");
		mnNewMenu.add(rdbtnmntmNewRadioItem_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 72, 300, 355);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(0, 28, 69, 29);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblLabel = new JLabel("label");
		lblLabel.setBounds(79, 0, 79, 29);
		panel_1.add(lblLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(79, 28, 79, 29);
		panel_1.add(comboBox);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(0, 67, 93, 23);
		panel_1.add(btnNewButton);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("New check box");
		chckbxNewCheckBox.setBounds(0, 96, 103, 23);
		panel_1.add(chckbxNewCheckBox);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("New radio button");
		rdbtnNewRadioButton.setBounds(0, 121, 121, 23);
		panel_1.add(rdbtnNewRadioButton);
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("New toggle button");
		tglbtnNewToggleButton.setBounds(0, 150, 135, 23);
		panel_1.add(tglbtnNewToggleButton);
		
		JTextArea textArea = new JTextArea();
		textArea.setText("5465416213213213213213213213212132132");
		textArea.setBounds(0, 183, 135, 52);
		panel_1.add(textArea);
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		formattedTextField.setText("5446546546213546461635464616165165461");
		formattedTextField.setBounds(0, 245, 135, 23);
		panel_1.add(formattedTextField);
		
		passwordField = new JPasswordField();
		passwordField.setToolTipText("45465446546546546546465465465");
		passwordField.setBounds(0, 278, 135, 21);
		panel_1.add(passwordField);
		
		JTextPane textPane = new JTextPane();
		textPane.setText("132132132132132132132132132132");
		textPane.setBounds(0, 309, 135, 36);
		panel_1.add(textPane);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(129, 68, 29, 22);
		panel_1.add(spinner);
		
		JList list = new JList();
		list.setBounds(168, 28, 122, 100);
		panel_1.add(list);
		
		table = new JTable();
		table.setBounds(168, 150, 122, 52);
		panel_1.add(table);
		
		JTree tree = new JTree();
		tree.setBounds(168, 212, 78, 64);
		panel_1.add(tree);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setBounds(144, 286, 146, 14);
		panel_1.add(progressBar);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(273, 307, 17, 48);
		panel_1.add(scrollBar);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(154, 309, 49, 36);
		panel_1.add(separator);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(310, 72, 362, 355);
		getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 0, 342, 355);
		panel_2.add(scrollPane);
		
		JEditorPane dtrpnJeditor = new JEditorPane();
		dtrpnJeditor.setBounds(10, 420, 106, 21);
		getContentPane().add(dtrpnJeditor);
		dtrpnJeditor.setText("JEditor");
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CodeIdentification frame = new CodeIdentification();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
	}
}
