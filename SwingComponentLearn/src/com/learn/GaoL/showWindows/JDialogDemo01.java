package com.learn.GaoL.showWindows;

import java.awt.Color;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

@SuppressWarnings("serial")
public class JDialogDemo01 extends JDialog{
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				JDialogDemo01 demo01 = new JDialogDemo01();
				demo01.setVisible(true);
				demo01.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
// *******************�����Ǵ����ɼ����ڵ�������Ч����******************
				
				demo01.setFrameProps();
			}
		});
	}

	protected void setFrameProps() {
		setTitle("TestJDialogDemo01");
		setLocationRelativeTo(null);
		setSize(300, 200);
		
		getContentPane().setBackground(Color.BLUE);
		getContentPane().add(new JLabel("�÷���JFrame����һ��"));
	}
}
