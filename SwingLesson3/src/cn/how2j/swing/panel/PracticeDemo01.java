package cn.how2j.swing.panel;

import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class PracticeDemo01 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("PIS-PrivateTools");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(new Dimension(800, 600));
		frame.setLocationRelativeTo(null);
		
		JPanel addAuthorization = new JPanel();
		JPanel extendAuthorization = new JPanel();
		JPanel initAuthorization = new JPanel();
		JPanel deviceAuthorization = new JPanel();
		JPanel convertToolkits = new JPanel();
		JPanel encryptToolkits = new JPanel();
		JPanel messageToolkits = new JPanel();
		
		JTabbedPane mainPane = new JTabbedPane();
		mainPane.add(addAuthorization);
		mainPane.add(extendAuthorization);
		mainPane.add(initAuthorization);
		mainPane.add(deviceAuthorization);
		mainPane.add(convertToolkits);
		mainPane.add(encryptToolkits);
		mainPane.add(messageToolkits);
		// 设置标签标题
		mainPane.setTitleAt(0, "初次授权");
		mainPane.setTitleAt(1, "延期授权");
		mainPane.setTitleAt(2, "初始化授权");
		mainPane.setTitleAt(3, "硬件授权");
		mainPane.setTitleAt(4, "文件转化工具");
		mainPane.setTitleAt(5, "加解密工具");
		mainPane.setTitleAt(6, "硬件信息获取工具");
		
		ImageIcon icon = new ImageIcon("resources/j.png");
		mainPane.setIconAt(0, icon);
		mainPane.setIconAt(1, icon);
		mainPane.setIconAt(2, icon);
		mainPane.setIconAt(3, icon);
		mainPane.setIconAt(4, icon);
		mainPane.setIconAt(5, icon);
		mainPane.setIconAt(6, icon);
		
		frame.getContentPane().add(mainPane);
		frame.setVisible(true);// 一般建议放在最后，如果放在前面，且界面组件太多时，会出现窗体内容为空的刷新异常
	}
}
