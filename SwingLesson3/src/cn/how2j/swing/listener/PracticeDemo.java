package cn.how2j.swing.listener;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class PracticeDemo {
	public static void main(String[] args) {
		
        final JFrame f = new JFrame("LoL");
        f.setSize(800, 600);
        f.setLocationRelativeTo(null);
        f.setLayout(null);
  
        final JLabel l = new JLabel("");
  
        ImageIcon i = new ImageIcon("resources/shana_heiheihei.png");
        l.setIcon(i);
        l.setBounds(350, 150, i.getIconWidth(), i.getIconHeight());
        l.setVisible(false);
        f.add(l);
        
        final JButton b = new JButton("显示图片");
        b.setBounds(350, 400, 100, 30);
        f.add(b);
  
        // MouseAdapter 适配器，只需要重写用到的方法，没有用到的就不用写了(适配器已经实现了Listener接口，并提供了所有方法的空实现)
        b.addMouseListener(new MouseAdapter() {
            // 只有mouseClicked用到了
            public void mousePressed(MouseEvent e) {
        		if (b.getText().equals("显示图片")) {
					b.setText("隐藏图片");
					l.setVisible(true);
				} else if (b.getText().equals("隐藏图片")) {
					b.setText("显示图片");
					l.setVisible(false);
				}
            }
        });
  
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
        f.setVisible(true);
    }
}
