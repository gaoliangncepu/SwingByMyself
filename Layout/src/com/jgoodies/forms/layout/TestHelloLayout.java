package com.jgoodies.forms.layout;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.jgoodies.forms.layout.CellConstraints;
import com.jgoodies.forms.layout.FormLayout;

public class TestHelloLayout {
public static void main(String[] args) {
	JFrame jFrame = new JFrame("HelloWorld");
	
	FormLayout layout = new FormLayout("pref, 4dlu, 50dlu, 4dlu, min", // columns
			"pref, 2dlu, pref, 2dlu, pref");// rows
	layout.setRowGroups(new int[][] { { 1, 3, 5 } });
	
	Container contentPane = jFrame.getContentPane();
	contentPane.setLayout(layout);
	
	CellConstraints cc = new CellConstraints();
	contentPane.add(new JLabel("Label1"), cc.xy(1, 1));
	contentPane.add(new JTextField(), cc.xyw(3, 1, 3));
	contentPane.add(new JLabel("Label2"), cc.xy(1, 3));
	contentPane.add(new JTextField(), cc.xy(3, 3));
	contentPane.add(new JLabel("Label3"), cc.xy(1, 5));
	contentPane.add(new JTextField(), cc.xy(3, 5));
	contentPane.add(new JTextField(), cc.xy(5, 5));
	
	jFrame.setVisible(true);
	jFrame.setSize(200, 200);
	}
}
