package com.learn.GaoL.showWindows;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameDemo01 {
	public static void main(String[] args) {
		//Frame �Ǵ��б���ͱ߽�Ķ��㴰��
		Frame myFrame = new Frame("Hello");
		myFrame.setSize(300,400);
		myFrame.setLocation(250, 150);
		myFrame.setVisible(true);
		//eclipse ������ʹ��show()����
		//myFrame.show();
		//���ô��岼�֣�BorderLayout���������������ָ�������֮���ˮƽ��๹��һ���߽粼�֡�
		//BorderLayoutΪJAVA�е�Ĭ�ϴ��岼��
		//myFrame.setLayout(new BorderLayout(10,20));
		//���ô��岼��ΪFlowLayout�����뷽ʽ�������
		//myFrame.setLayout(new FlowLayout(FlowLayout.LEFT));
		//���ô��岼��ΪGridLayout���������Ϊ6�飬3��2��
		//myFrame.setLayout(new GridLayout(3,2));

		Button myButton1=new Button("east");
		Button myButton2=new Button("south");
		Button myButton3=new Button("west");
		Button myButton4=new Button("north");
		Button myButton5=new Button("center");

		//���ַ��������ԣ�����Ҫע���Сд
		//myFrame.add(myButton1,BorderLayout.EAST);
		myFrame.add(myButton1,"East");
		myFrame.add(myButton2,BorderLayout.SOUTH);
		myFrame.add(myButton3,BorderLayout.WEST);
		myFrame.add(myButton4,BorderLayout.NORTH);
		myFrame.add(myButton5,BorderLayout.CENTER);
		
		/*
		 * ע������� Java���õ���ί��ģ�ͣ������ִ򿪣��رյȲ���ʱ��Java���Զ�����һ��WindowEvent����
		 * ���¼������ݸ�ÿһ��ʹ�ô��ڵ�addWindowListener ����ע���Խ��������¼��� WindowListener
		 * ��  WindowAdapter ���󡣣�WindowAdapter ����ʵ�� WindowListener �ӿڡ��������¼�ʱ��
		 * ���д������������󶼽���ô� WindowEvent�� Ȼ���ٽ���ƥ�䣬�����ַ����ʺ�
		*/
		//ʹ�������ڲ���ķ���ʵ�ּ������Ĺ���,ֻ�к������������¼��ſ���ʹ�ô˷���
		//myFrame.addWindowListener(new yourWindowListener());
		//myFrame.addWindowListener(new myWindowListener());
		
		//ʹ���������ķ���ʵ�ּ���������
		myFrame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
		
	}
	/*
	//�����ⲿ��ķ���ʵ�ִ��ڼ������������ⲿ�࣬����������������ȡ
	class myWindowListener implements WindowListener {
		public void windowOpened(WindowEvent e){
		}
		public void windowClosing(WindowEvent e){
			//�û���ͼ�Ӵ��ڵ�ϵͳ�˵��йرմ���ʱ����
			System.exit(0);
			//0��ʾ�ɹ��رգ���������Ϊ�Ƿ��ر�
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
	//ʹ��WindowAdapter����������ʵ�ּ�����
	class yourWindowListener extends WindowAdapter{
		public void windowClosing(WindowEvent e){
			System.exit(0);
		}
	}*/
}
