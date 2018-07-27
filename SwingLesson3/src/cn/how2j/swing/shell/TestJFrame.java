package cn.how2j.swing.shell;

import javax.swing.JButton;
import javax.swing.JFrame;
 
public class TestJFrame {
    public static void main(String[] args) {
         
        //普通的窗体，带最大和最小化按钮
        JFrame f = new JFrame("LoL");
        f.setVisible(true);
        
        f.setSize(400, 300);
        f.setLocation(200, 200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(false);// 窗体大小不可变化
        
        f.setLayout(null);
        JButton b = new JButton("一键秒对方基地挂");
        b.setBounds(50, 50, 280, 30);
 
        f.add(b);
    }
}
