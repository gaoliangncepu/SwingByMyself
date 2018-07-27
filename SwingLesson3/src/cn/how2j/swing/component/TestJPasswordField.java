package cn.how2j.swing.component;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * JOptionPane 用于弹出对话框
 * 
 * JOptionPane.showConfirmDialog(f, "是否 使用外挂 ？");
 * 表示询问，第一个参数是该对话框以哪个组件对齐
 * JOptionPane.showInputDialog(f, "请输入yes，表明使用外挂后果自负");
 * 接受用户的输入
 * JOptionPane.showMessageDialog(f, "你使用外挂被抓住！ 罚拣肥皂3次！");
 * 显示消息 
 */
public class TestJPasswordField {
	
	public static void main(String[] args) {
		 
		JFrame f = new JFrame("LoL");
        f.setSize(400, 300);
        f.setLocation(200, 200);
 
        f.setLayout(new FlowLayout());
 
        JLabel lName = new JLabel("账号：");
        // 输入框
        JTextField tfName = new JTextField("");
        tfName.setText("请输入账号");
        tfName.setPreferredSize(new Dimension(80, 30));
 
        JLabel lPassword = new JLabel("密码：");
        // 输入框
        JTextField tfPassword = new JTextField("");
        tfPassword.setText("请输入密码");
        tfPassword.setPreferredSize(new Dimension(80, 30));
 
        f.add(lName);
        f.add(tfName);
        f.add(lPassword);
        f.add(tfPassword);
 
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        f.setVisible(true);
        tfPassword.grabFocus();//表示让密码输入框获取输入焦点 
    }
}
