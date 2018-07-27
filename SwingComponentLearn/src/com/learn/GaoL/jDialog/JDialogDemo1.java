package com.learn.GaoL.jDialog;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

@SuppressWarnings("serial")
class JDialogDemo1 extends JFrame{//��������
	public static void main(String args[]){
	    new JDialogDemo1();//ʵ����MyJDialog�����
	}
	
	public JDialogDemo1(){
	    Container container=getContentPane();//����һ������
	    container.setLayout(null);
	    
	    JLabel jl=new JLabel("����һ��JFrame����");//�ڴ��������ñ�ǩ
	    jl.setHorizontalAlignment(SwingConstants.CENTER);
	    container.add(jl);
	
	    JButton b1=new JButton("�����Ի���");
	    b1.setBounds(10,10,100,21);
	    b1.addActionListener(new ActionListener(){//Ϊ��ť�����굥���¼�
	    
	    	public void actionPerformed(ActionEvent e){
	    		new MyJDialog(JDialogDemo1.this).setVisible(true);//����JDialog����󣬱����ֶ�����MyJDialog����ɼ�
	    	}
	    });
	
	    container.add(b1);
	    container.setBackground(Color.white);
	    
	    setSize(400,400);
	    setLocationRelativeTo(null);
	    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	    setVisible(true);
	}
}

class MyJDialog extends JDialog{
    public MyJDialog(JDialogDemo1 frame){
        super(frame,"��һ��JDialog����",true);//ʵ����һ��JDialog�����ָ���Ի���ĸ����塢���⡢����
        Container container=getContentPane();//����һ�������������������ͨ�����������
        container.add(new JLabel("����һ���Ի���"));
        setLocationRelativeTo(frame);
        setSize(new Dimension(150, 150));//������setSize()������setPrefersize()
//        setBounds(120,120,100,100);
    }
}
