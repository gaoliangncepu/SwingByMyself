package com.learn.GaoL.showWindows;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameDemo01 {
	public static void main(String[] args) {
		//Frame 是带有标题和边界的顶层窗口
		Frame myFrame = new Frame("Hello");
		myFrame.setSize(300,400);
		myFrame.setLocation(250, 150);
		myFrame.setVisible(true);
		//eclipse 不建议使用show()方法
		//myFrame.show();
		//设置窗体布局，BorderLayout里面的两个参数用指定的组件之间的水平间距构造一个边界布局。
		//BorderLayout为JAVA中的默认窗体布局
		//myFrame.setLayout(new BorderLayout(10,20));
		//设置窗体布局为FlowLayout，对齐方式居左对齐
		//myFrame.setLayout(new FlowLayout(FlowLayout.LEFT));
		//设置窗体布局为GridLayout，将窗体分为6块，3行2列
		//myFrame.setLayout(new GridLayout(3,2));

		Button myButton1=new Button("east");
		Button myButton2=new Button("south");
		Button myButton3=new Button("west");
		Button myButton4=new Button("north");
		Button myButton5=new Button("center");

		//两种方法都可以，但是要注意大小写
		//myFrame.add(myButton1,BorderLayout.EAST);
		myFrame.add(myButton1,"East");
		myFrame.add(myButton2,BorderLayout.SOUTH);
		myFrame.add(myButton3,BorderLayout.WEST);
		myFrame.add(myButton4,BorderLayout.NORTH);
		myFrame.add(myButton5,BorderLayout.CENTER);
		
		/*
		 * 注册监听器 Java采用的是委托模型，当出现打开，关闭等操作时，Java会自动产生一个WindowEvent对象，
		 * 该事件被传递给每一个使用窗口的addWindowListener 方法注册以接收这种事件的 WindowListener
		 * 或  WindowAdapter 对象。（WindowAdapter 对象实现 WindowListener 接口。）发生事件时，
		 * 所有此类侦听器对象都将获得此 WindowEvent。 然后再进行匹配，看那种方法适合
		*/
		//使用匿名内部类的方法实现监听器的功能,只有含有适配器的事件才可以使用此方法
		//myFrame.addWindowListener(new yourWindowListener());
		//myFrame.addWindowListener(new myWindowListener());
		
		//使用适配器的方法实现监听器作用
		myFrame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
		
	}
	/*
	//采用外部类的方法实现窗口监听，由于是外部类，所以类名可以任意取
	class myWindowListener implements WindowListener {
		public void windowOpened(WindowEvent e){
		}
		public void windowClosing(WindowEvent e){
			//用户试图从窗口的系统菜单中关闭窗口时调用
			System.exit(0);
			//0表示成功关闭，其他数字为非法关闭
		}
		public void windowClosed(WindowEvent e){
		}
		public void windowIconified(WindowEvent e){
		}
		public void windowDeiconified(WindowEvent e){
		}
		public void windowActivated(WindowEvent e){
		}
		public void windowDeactivated(WindowEvent e){
		}
	}*/
	
	/*
	//使用WindowAdapter适配器类来实现监听器
	class yourWindowListener extends WindowAdapter{
		public void windowClosing(WindowEvent e){
			System.exit(0);
		}
	}*/
}
