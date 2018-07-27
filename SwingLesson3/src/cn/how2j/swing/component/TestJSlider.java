package cn.how2j.swing.component;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JSlider;

/**
 * 滑动条
 *
 */
public class TestJSlider {
	
	public static void main(String[] args) {
		 
		JFrame f = new JFrame("LoL");
        f.setSize(400, 300);
        f.setLocation(200, 200);
        f.setLayout(new BorderLayout());
 
        JSlider sl = new JSlider();
        sl.setOrientation(JSlider.HORIZONTAL);
        sl.setMaximum(50);
        sl.setMinimum(0);
        sl.setMinorTickSpacing(1);
        sl.setPaintLabels(true);//是否在滑块上绘制刻度值（刻度值显示必要条件）
        sl.setPaintTicks(true);//是否在滑块上绘制刻线
        sl.setPaintTrack(true);//有无滑道条
        sl.setMajorTickSpacing(10);//刻度值分辨率（刻度值显示必要条件）
        sl.setMinorTickSpacing(1);//最小分辨率
        sl.setValue(2);
        sl.setForeground(new Color(26, 127, 203));
        sl.setPreferredSize(new Dimension(450, 30));
 
        f.add(sl);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true); 
    }
}
