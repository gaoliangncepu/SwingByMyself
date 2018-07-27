package com.learn.GaoL.showWindows;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

@SuppressWarnings("serial")
public class JFrameDemo01 extends JFrame{

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {// new Interface 创建匿名内部类
			public void run() {
				JFrameDemo01 demo01 = new JFrameDemo01();
				demo01.setVisible(true);
				// *******************以上是创建可见窗口的最少有效代码******************
				
				demo01.setFrameProps();
			}
		});
	}

	protected void setFrameProps() {
		initFrameProps();
		
		// set properties of contentPane
		getContentPane().setLayout(new BorderLayout());
		getContentPane().setBackground(Color.ORANGE);
		getContentPane().setForeground(Color.BLUE);//无效果
		getContentPane().setFont(new Font("黑体", 1, 20));//无效果

		// 字体的统一设置 必须放在相关主键的创建和添加之前
		UIManager.put("Button.font", new Font("隶书", 1, 20));
		UIManager.put("Label.font", new Font("楷书", 1, 20));
		
		JButton button = addButton();
		
		addLabel(button);
	}

	// init properties of JFrame shell
	private void initFrameProps() {
		setTitle("标题TestJFrameDemo01");
		setSize(new Dimension(400, 300));// 窗口尺寸
		setLocationRelativeTo(null);// 设置窗体位于屏幕中央
//		setLocation(500, 300);// 设置窗体位于屏幕的绝对位置
		setCursor(new Cursor(Cursor.TEXT_CURSOR));// 设置光标样式（推荐方式）
		setIconImage(new BufferedImage(10, 10, BufferedImage.TYPE_INT_RGB));// 设置窗口图标（标题栏、任务栏）
		setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);// 设置单个组件内的元素或文本的方向 左 → 右 （默认） 或 左 ← 右
		setDefaultLookAndFeelDecorated(false);// 是否具有当前 LookAndFeel 为其提供的 Window 装饰
		setDefaultCloseOperation(EXIT_ON_CLOSE);// 窗口关闭时的动作
		
		setPreferredSize(new Dimension(400, 300));//不推荐使用
		setBackground(Color.GREEN);//无效果
		setForeground(Color.RED);//无效果
		setFont(new Font("隶书", 1, 20));//无效果
	}

	// add JLabel
	private JLabel addLabel(JButton button) {
		JLabel label = new JLabel();
		
		label.setText("Size of 窗口：width-" + getWidth() + ";Height-" + getHeight());
		label.setFont(new Font("行书", Font.ITALIC, 15));//style(普通-PLAIN、加粗-BOLD、斜体-ITALIC)
		label.setBackground(Color.GREEN);
		label.setForeground(Color.BLUE);
		label.setHorizontalAlignment(SwingConstants.CENTER); //水平方向：内容显示在窗口的中央
		label.setVerticalAlignment(SwingConstants.CENTER); //竖直方向：内容显示在窗口的中央
		label.setIcon(new ImageIcon("resource/trophy.png")); //设置标签的图片
		label.setCursor(new Cursor(Cursor.HAND_CURSOR));
		label.setDisplayedMnemonic(1); //???
		label.setLabelFor(button); //???

		getContentPane().add(label, BorderLayout.NORTH);
		
		return label;
	}

	// add JButton
	private JButton addButton() {
		JButton button = new JButton("Button按钮");
		button.setSize(130, 20);
		button.setHorizontalAlignment(SwingConstants.CENTER); //水平方向：内容显示在窗口的中央
		button.setVerticalAlignment(SwingConstants.BOTTOM); //竖直方向：内容显示在窗口的中央
		button.setIcon(new ImageIcon("resource/tree.png"));// 初始化显示
		button.setPressedIcon(new ImageIcon("resource/vector.png"));// 按下按钮显示
		button.setRolloverIcon(new ImageIcon("resource/info.png"));// 进入按钮区域显示
		button.setIconTextGap(10);
		button.setBackground(Color.CYAN);
		button.setForeground(Color.red);
		button.setCursor(new Cursor(Cursor.MOVE_CURSOR));
		button.setDisplayedMnemonicIndex(0);//???
		button.setDoubleBuffered(true);//？？？
		getContentPane().add(button, BorderLayout.SOUTH);
		return button;
	}

}
