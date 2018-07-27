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
		SwingUtilities.invokeLater(new Runnable() {// new Interface ���������ڲ���
			public void run() {
				JFrameDemo01 demo01 = new JFrameDemo01();
				demo01.setVisible(true);
				// *******************�����Ǵ����ɼ����ڵ�������Ч����******************
				
				demo01.setFrameProps();
			}
		});
	}

	protected void setFrameProps() {
		initFrameProps();
		
		// set properties of contentPane
		getContentPane().setLayout(new BorderLayout());
		getContentPane().setBackground(Color.ORANGE);
		getContentPane().setForeground(Color.BLUE);//��Ч��
		getContentPane().setFont(new Font("����", 1, 20));//��Ч��

		// �����ͳһ���� ���������������Ĵ��������֮ǰ
		UIManager.put("Button.font", new Font("����", 1, 20));
		UIManager.put("Label.font", new Font("����", 1, 20));
		
		JButton button = addButton();
		
		addLabel(button);
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

	// add JLabel
	private JLabel addLabel(JButton button) {
		JLabel label = new JLabel();
		
		label.setText("Size of ���ڣ�width-" + getWidth() + ";Height-" + getHeight());
		label.setFont(new Font("����", Font.ITALIC, 15));//style(��ͨ-PLAIN���Ӵ�-BOLD��б��-ITALIC)
		label.setBackground(Color.GREEN);
		label.setForeground(Color.BLUE);
		label.setHorizontalAlignment(SwingConstants.CENTER); //ˮƽ����������ʾ�ڴ��ڵ�����
		label.setVerticalAlignment(SwingConstants.CENTER); //��ֱ����������ʾ�ڴ��ڵ�����
		label.setIcon(new ImageIcon("resource/trophy.png")); //���ñ�ǩ��ͼƬ
		label.setCursor(new Cursor(Cursor.HAND_CURSOR));
		label.setDisplayedMnemonic(1); //???
		label.setLabelFor(button); //???

		getContentPane().add(label, BorderLayout.NORTH);
		
		return label;
	}

	// add JButton
	private JButton addButton() {
		JButton button = new JButton("Button��ť");
		button.setSize(130, 20);
		button.setHorizontalAlignment(SwingConstants.CENTER); //ˮƽ����������ʾ�ڴ��ڵ�����
		button.setVerticalAlignment(SwingConstants.BOTTOM); //��ֱ����������ʾ�ڴ��ڵ�����
		button.setIcon(new ImageIcon("resource/tree.png"));// ��ʼ����ʾ
		button.setPressedIcon(new ImageIcon("resource/vector.png"));// ���°�ť��ʾ
		button.setRolloverIcon(new ImageIcon("resource/info.png"));// ���밴ť������ʾ
		button.setIconTextGap(10);
		button.setBackground(Color.CYAN);
		button.setForeground(Color.red);
		button.setCursor(new Cursor(Cursor.MOVE_CURSOR));
		button.setDisplayedMnemonicIndex(0);//???
		button.setDoubleBuffered(true);//������
		getContentPane().add(button, BorderLayout.SOUTH);
		return button;
	}

}
