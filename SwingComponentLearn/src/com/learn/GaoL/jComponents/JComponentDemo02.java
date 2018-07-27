package com.learn.GaoL.jComponents;

import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.image.BufferedImage;
import java.util.Enumeration;

import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.SwingUtilities;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

@SuppressWarnings("serial")
public class JComponentDemo02 extends JFrame{

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {// new Interface 创建匿名内部类
			public void run() {
				JComponentDemo02 demo01 = new JComponentDemo02();
				demo01.setVisible(true);
				// *******************以上是创建可见窗口的最少有效代码******************
				
				demo01.setFrameProps();
			}
		});
	}

	protected void setFrameProps() {
		initFrameProps();
		
		// set properties of contentPane
		getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER));
		
		JComboBox<String> comboBox = addComboBox();
		
		JCheckBox checkBox = addCheckBox();
		
		JRadioButton radioButton1 = new JRadioButton("男");
		JRadioButton radioButton2 = new JRadioButton("女");
		ButtonGroup group = new ButtonGroup();
		group.add(radioButton1);
		group.add(radioButton2);
		group.setSelected(radioButton1.getModel(), true);
		getContentPane().add(radioButton1);
		getContentPane().add(radioButton2);
		
		Enumeration<AbstractButton> enumeration = group.getElements();
		while (enumeration.hasMoreElements()) {
			JRadioButton btn = (JRadioButton) enumeration.nextElement();
			if (btn.isSelected()) {
				System.out.println("当前被选中："+btn.getText());
			}
		}
	}

	private JCheckBox addCheckBox() {
		JCheckBox checkBox = new JCheckBox("是/否 单选按钮");
		checkBox.setBorder(BorderFactory.createLineBorder(Color.green, 3));
		checkBox.setCursor(new Cursor(Cursor.HAND_CURSOR));
		getContentPane().add(checkBox);
		
		checkBox.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				if (ItemEvent.SELECTED == e.getStateChange()) {
					System.out.println("选中");
				} else {
					System.out.println("未选中");
				}
			}
		});
		
		return checkBox;
	}

	private JComboBox addComboBox() {
		JComboBox<String> comboBox = new JComboBox<>();
		comboBox.addItem("item1");// 新增选项
		comboBox.addItem("item2");
		comboBox.addItem("item3");
		comboBox.addItem("item4");
		getContentPane().add(comboBox);
		
		comboBox.setSelectedIndex(2);// 设置选中
//		comboBox.setSelectedItem("item2");
		comboBox.removeItemAt(3);// 删除选项
		System.out.println(comboBox.getSelectedItem());// 获取选中
		System.out.println(comboBox.getSelectedIndex());
		comboBox.addItemListener(new ItemListener() {// 选中时间监听与相应
			@Override
			public void itemStateChanged(ItemEvent e) {
				System.out.println(e.getItem());//更新选项时，先后返回上一个选项和当前选项
			}
		});
		
		return comboBox;
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


}
