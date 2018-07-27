package cn.how2j.swing.practices;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.junit.Before;
import org.junit.Test;

@SuppressWarnings("serial")
public class PractiseDemo01 extends JFrame{
	
	public static void main(String[] args) {
		PractiseDemo01 demo = new PractiseDemo01();
		demo.setTitle("组件综合练习");
		demo.setSize(new Dimension(400, 300));
		demo.setLocationRelativeTo(null);
		demo.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		demo.testStep1(demo);
		demo.setVisible(true);
	}

	public void testStep1(JFrame frame) {
		JPanel contentPanel = new JPanel();
		
		JTextField textField = new JTextField();
//		textField.setSize(100, 30);//无效果
		textField.setPreferredSize(new Dimension(100, 30));// 有实效
		
		JButton button = new JButton("检测");
		button.setSize(80, 30);
		
		contentPanel.add(textField);
		contentPanel.add(button);
		
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
//				JOptionPane.showMessageDialog(frame, 
//						textField.getText().length() == 0 ? "文本内容为空" : "已输入" + textField.getText());
				
				String regex = "^[0-9]*$";
				Pattern pattern = Pattern.compile(regex);
				Matcher matcher = pattern.matcher(textField.getText());
				if (matcher.matches()) {
					JOptionPane.showMessageDialog(frame, 
							"输入内容格式正确");
				} else {
					JOptionPane.showMessageDialog(frame, 
							"输入的不是整数");
				}
			}
		});
		
		frame.add(contentPanel);
	}
}

