package cn.how2j.swing.practices;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class PractiseDemo02 extends JFrame{
	
	public static void main(String[] args) {
		PractiseDemo02 demo = new PractiseDemo02();
		demo.setTitle("组件综合练习");
		demo.setSize(new Dimension(400, 300));
		demo.setLocationRelativeTo(null);
		demo.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		demo.testStep5(demo);
		demo.setVisible(true);
	}

	public void testStep5(JFrame frame) {
		Map<String, String> info = new HashMap<>();
		info.put("user1", "131301");
		
		JPanel contentPanel = new JPanel();
		
		JLabel label1 = new JLabel("账号：");
		JLabel label2 = new JLabel("密码：");
		
		JTextField textField = new JTextField();
		textField.setPreferredSize(new Dimension(100, 30));// 有实效
		
		JPasswordField pwdField = new JPasswordField();
		pwdField.setPreferredSize(new Dimension(100, 30));
		
		JButton button = new JButton("登录");
		button.setSize(80, 30);
		
		contentPanel.add(label1);
		contentPanel.add(textField);
		contentPanel.add(label2);
		contentPanel.add(pwdField);
		contentPanel.add(button);
		
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (0 == pwdField.getPassword().length || null == textField.getText()) {
					return;
				}
				
				boolean flag = false;
				for (String key : info.keySet()) {
					if(key.equals(textField.getText())) 
						flag = true;
				}
				
				if (flag) {
					if ((info.get(textField.getText())).equals(new String(pwdField.getPassword()))) {
						JOptionPane.showMessageDialog(frame, 
								"登陆成功");
					} else {
						JOptionPane.showMessageDialog(frame, 
								"密码错误");
					}
				} else {
					JOptionPane.showMessageDialog(frame, 
							"用户名错误");
				}
			}
		});
		
		frame.add(contentPanel);
	}
}

