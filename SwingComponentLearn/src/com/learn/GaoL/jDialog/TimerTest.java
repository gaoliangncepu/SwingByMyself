package com.learn.GaoL.jDialog;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TimerTest extends JFrame {
	private static final long serialVersionUID = 1L;
    private static JButton button;
    private static TimerTest TimerTest;

    public static void main(String[] args) {
        TimerTest = new TimerTest();
        button = new JButton("����");
        button.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
               TimeDialog d = new TimeDialog();
               int result = d.showDialog(TimerTest, "�Է���Ҫ���������Ƿ����?", 10);// TimerTest�ǳ����������࣬�����ĶԻ���10�����ʧ
                System.out.println("===result: "+result);
            }
        });
        
        button.setBounds(2, 5, 80,20);
        TimerTest.getContentPane().setLayout(null);
        TimerTest.getContentPane().add(button);
        
        TimerTest.setSize(new Dimension(400,200));
        TimerTest.setLocation(500,200);
        TimerTest.setVisible(true);
        TimerTest.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
