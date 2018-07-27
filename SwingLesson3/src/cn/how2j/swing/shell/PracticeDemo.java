package cn.how2j.swing.shell;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;

public class PracticeDemo {
	public static void main(String[] args) {
		JFrame frame = new JFrame("LOL");
		frame.setVisible(true);
		frame.setSize(new Dimension(400, 300));
		frame.setLocationRelativeTo(null);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		final JDialog dialog = new JDialog(frame);
		dialog.setTitle("这是一个模态窗口");
		dialog.setSize(300, 200);
		dialog.setResizable(false);
		dialog.setLocationRelativeTo(frame);
		dialog.setLayout(new BorderLayout());
		
		JButton buttonOuter = new JButton("打开一个模态窗口");
		buttonOuter.setBounds(100, 20, 200, 30);
		frame.getContentPane().add(buttonOuter);
		JButton buttonInner = new JButton("解锁大小");
		dialog.getContentPane().add(buttonInner, BorderLayout.CENTER);
		
		buttonOuter.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dialog.setVisible(true);
			}
		});
		
		buttonInner.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				dialog.setResizable(!dialog.isResizable());
			}
		});
	}
}
