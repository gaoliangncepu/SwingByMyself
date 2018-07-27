package cn.how2j.swing.shell;

import javax.swing.JButton;
import javax.swing.JDialog;

public class TestJDialog {
	public static void main(String[] args) {
		//普通的窗体，带最大和最小化按钮
	    JDialog d = new JDialog();
	    d.setVisible(true);

	    d.setTitle("LOL");
	    d.setSize(400, 300);
	    d.setLocation(200, 200);
	    
	    d.setLayout(null);
	    JButton b = new JButton("一键秒对方基地挂");
	    b.setBounds(50, 50, 280, 30);
	
	    d.add(b);
	}
}
