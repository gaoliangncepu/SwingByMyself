package cn.how2j.swing.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TestActionListener {
	public static void main(String[] args) {
		
        JFrame frame = new JFrame("LoL");
        frame.setSize(400, 300);
        frame.setLocation(580, 200);
        frame.setLayout(null);
  
        final JLabel label = new JLabel();
  
        // 设置标签的图标
        ImageIcon i = new ImageIcon("resources/shana.png");
        label.setIcon(i);
        label.setBounds(50, 50, i.getIconWidth(), i.getIconHeight());
  
        JButton b = new JButton("隐藏/显示图片");
        b.setBounds(150, 200, 100, 30);
        // 给按钮 增加 动作监听
        b.addActionListener(new ActionListener() {
            // 当按钮被点击时，就会触发 ActionEvent事件
            // actionPerformed 方法就会被执行
            public void actionPerformed(ActionEvent e) {
                label.setVisible(!label.isVisible());
            }
        });
  
        frame.add(label);
        frame.add(b);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
        frame.setVisible(true);
    }
}
