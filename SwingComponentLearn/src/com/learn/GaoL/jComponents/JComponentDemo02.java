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
		SwingUtilities.invokeLater(new Runnable() {// new Interface ���������ڲ���
			public void run() {
				JComponentDemo02 demo01 = new JComponentDemo02();
				demo01.setVisible(true);
				// *******************�����Ǵ����ɼ����ڵ�������Ч����******************
				
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
		
		JRadioButton radioButton1 = new JRadioButton("��");
		JRadioButton radioButton2 = new JRadioButton("Ů");
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
				System.out.println("��ǰ��ѡ�У�"+btn.getText());
			}
		}
	}

	private JCheckBox addCheckBox() {
		JCheckBox checkBox = new JCheckBox("��/�� ��ѡ��ť");
		checkBox.setBorder(BorderFactory.createLineBorder(Color.green, 3));
		checkBox.setCursor(new Cursor(Cursor.HAND_CURSOR));
		getContentPane().add(checkBox);
		
		checkBox.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				if (ItemEvent.SELECTED == e.getStateChange()) {
					System.out.println("ѡ��");
				} else {
					System.out.println("δѡ��");
				}
			}
		});
		
		return checkBox;
	}

	private JComboBox addComboBox() {
		JComboBox<String> comboBox = new JComboBox<>();
		comboBox.addItem("item1");// ����ѡ��
		comboBox.addItem("item2");
		comboBox.addItem("item3");
		comboBox.addItem("item4");
		getContentPane().add(comboBox);
		
		comboBox.setSelectedIndex(2);// ����ѡ��
//		comboBox.setSelectedItem("item2");
		comboBox.removeItemAt(3);// ɾ��ѡ��
		System.out.println(comboBox.getSelectedItem());// ��ȡѡ��
		System.out.println(comboBox.getSelectedIndex());
		comboBox.addItemListener(new ItemListener() {// ѡ��ʱ���������Ӧ
			@Override
			public void itemStateChanged(ItemEvent e) {
				System.out.println(e.getItem());//����ѡ��ʱ���Ⱥ󷵻���һ��ѡ��͵�ǰѡ��
			}
		});
		
		return comboBox;
	}

	// init properties of JFrame shell
	private void initFrameProps() {
		setTitle("����TestJFrameDemo01");
		setSize(new Dimension(400, 300));// ���ڳߴ�
		setLocationRelativeTo(null);// ���ô���λ����Ļ����
//		setLocation(500, 300);// ���ô���λ����Ļ�ľ���λ��
		setCursor(new Cursor(Cursor.TEXT_CURSOR));// ���ù����ʽ���Ƽ���ʽ��
		setIconImage(new BufferedImage(10, 10, BufferedImage.TYPE_INT_RGB));// ���ô���ͼ�꣨����������������
		setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);// ���õ�������ڵ�Ԫ�ػ��ı��ķ��� �� �� �� ��Ĭ�ϣ� �� �� �� ��
		setDefaultLookAndFeelDecorated(false);// �Ƿ���е�ǰ LookAndFeel Ϊ���ṩ�� Window װ��
		setDefaultCloseOperation(EXIT_ON_CLOSE);// ���ڹر�ʱ�Ķ���
		
		setPreferredSize(new Dimension(400, 300));//���Ƽ�ʹ��
		setBackground(Color.GREEN);//��Ч��
		setForeground(Color.RED);//��Ч��
		setFont(new Font("����", 1, 20));//��Ч��
	}


}
