package cn.how2j.swing.listener;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TestKeyListener {
	public static void main(String[] args) {
		
        JFrame f = new JFrame("LoL");
        f.setSize(400, 300);
        f.setLocation(580, 200);
        f.setLayout(null);
  
        final JLabel l = new JLabel();
  
        ImageIcon i = new ImageIcon("resources/shana.png");
        l.setIcon(i);
        l.setBounds(50, 50, i.getIconWidth(), i.getIconHeight());
  
        // 增加键盘监听
        f.addKeyListener(new KeyListener() {
        	
            // 键被弹起(按下时 不会连续响应)
            public void keyReleased(KeyEvent e) {
                // 39代表按下了 “右键”
                if (e.getKeyCode() == 39 || e.getKeyChar() == KeyEvent.VK_D) {
                    // 图片向右移动 （y坐标不变，x坐标增加）
                    l.setLocation(l.getX() + 10, l.getY());
                }
            }
  
            //键被按下(按下时 连续响应)
            public void keyPressed(KeyEvent e) {
            	// VK_LEFT 表示按下“A”
            	if (e.getKeyChar() == KeyEvent.VK_A) {
            		l.setLocation(l.getX() - 10, l.getY());
				}
            }
  
            // 一个按下弹起的组合动作(按下时 连续响应)
            public void keyTyped(KeyEvent e) {
            	// VK_LEFT 表示按下“S”
            	if (e.getKeyChar() == KeyEvent.VK_S) {
            		l.setLocation(l.getX(), l.getY() + 10);
				}
            }
        });
  
        f.add(l);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
        f.setVisible(true);
    }
}
