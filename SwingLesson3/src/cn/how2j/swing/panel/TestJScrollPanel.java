package cn.how2j.swing.panel;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 * 使用带滚动条的面板有两种方式
 * 1. 在创建JScrollPane，把组件作为参数传进去
 * 2. 希望带滚动条的面板显示其他组件的时候，调用setViewportView(JComponent)
 *
 * setPreferredSize(); 放在JScrollPane中指定实际大小
 */
public class TestJScrollPanel {
	public static void main(String[] args) {
		 
        JFrame f = new JFrame("LoL");
        f.setSize(400, 300);
        f.setLocation(200, 200);
        f.setLayout(null);
        
        //准备一个文本域，在里面放很多数据
        JTextArea ta = new JTextArea();
        ta.setPreferredSize(new Dimension(400, 2000));// 放在JScrollPane中指定实际大小
        for (int i = 0; i < 1000; i++) {
            ta.append(String.valueOf(i));
        }
        ta.setLineWrap(true);//自动换行
        
        JScrollPane sp = new JScrollPane(ta);
 
        f.setContentPane(sp);
 
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        f.setVisible(true);
    }
}
