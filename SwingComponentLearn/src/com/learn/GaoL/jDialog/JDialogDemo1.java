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
class JDialogDemo1 extends JFrame{//创建新类
	public static void main(String args[]){
	    new JDialogDemo1();//实例化MyJDialog类对象
	}
	
	public JDialogDemo1(){
	    Container container=getContentPane();//创建一个容器
	    container.setLayout(null);
	    
	    JLabel jl=new JLabel("这是一个JFrame窗体");//在窗体中设置标签
	    jl.setHorizontalAlignment(SwingConstants.CENTER);
	    container.add(jl);
	
	    JButton b1=new JButton("弹出对话框");
	    b1.setBounds(10,10,100,21);
	    b1.addActionListener(new ActionListener(){//为按钮添加鼠标单击事件
	    
	    	public void actionPerformed(ActionEvent e){
	    		new MyJDialog(JDialogDemo1.this).setVisible(true);//创建JDialog对象后，必须手动设置MyJDialog窗体可见
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
        super(frame,"第一个JDialog窗体",true);//实例化一个JDialog类对象，指定对话框的父窗体、标题、类型
        Container container=getContentPane();//创建一个容器，所有组件必须通过容器来添加
        container.add(new JLabel("这是一个对话框"));
        setLocationRelativeTo(frame);
        setSize(new Dimension(150, 150));//必须用setSize()不能用setPrefersize()
//        setBounds(120,120,100,100);
    }
}
