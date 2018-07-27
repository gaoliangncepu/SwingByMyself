package com.learn.GaoL.thread;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.SwingWorker;

/**
 * SwingWorker ������̨�����߳�
 * SwingWorker �����Ϊִֻ��һ�Ρ����ִ�� SwingWorker ������������� doInBackground()������ doInBackground()������ɺ�ִ�� done()������
 * 		doInBackground():ִ�к�̨����
 * 		done():�����¼�ָ���̣߳�ˢ��ǰ�˽���
 * 		get():����doInBackground()��ִ�н��״̬��
 *
 * ��ר���߳���ִ�г�ʱ�� GUI��������ĳ����ࡣ 
 *
	ʹ�� Swing ��д���߳�Ӧ�ó���ʱ��Ҫ��ס����Լ�������� 
		1).��Ӧ���� �¼�ָ���߳�(Swing��ǰ�˽����߳�)�����к�ʱ���񡣷���Ӧ�ó�������Ӧ�� 
		2).ֻ�����¼�ָ���߳��Ϸ��� Swing����� 

	��ЩԼ����ζ����Ҫʱ���ܼ���������� GUIӦ�ó���������Ҫ���������̣߳�
		1).ִ�г�ʱ��������̡߳���SwingWorker�ļ�ֵ�� 
		2).���� GUI��ػ���¼�ָ���̣߳�EDT�����漰������ʵ�ֵ��̼߳�ͨ�š� 

	SwingWorker ���������Ҫ�ں�̨�߳������г�ʱ������������������������ɺ�����ڴ���������� UI�ṩ���¡�
	SwingWorker ���������ʵ�� doInBackground()��������ִ�к�̨���㡣
 *
 */
@SuppressWarnings("serial")
public class SwingWokerThread extends JFrame {
    private Label lable;
    private Button button;

    public Label getLable() {
        return lable;
    }

    public void setLable(Label lable) {
        this.lable = lable;
    }

    public Button getButton() {
        return button;
    }

    public void setButton(Button button) {
        this.button = button;
    }

    private class NumberArrary extends SwingWorker<Void, Integer> {

        @Override
        protected Void doInBackground() throws Exception {
            button.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    int[] numArrary = new int[100];
                    for (int i = 0; i < numArrary.length; i++) {
                        numArrary[i] = new Random().nextInt();
                        System.out.println(i + "����Ϊ��" + numArrary[i]);
                    }
                    Arrays.sort(numArrary);
                    System.out.println("���ɵ���������Ϊ��"
                            + numArrary[numArrary.length - 1]);
                    lable.setText("���ɵ���������Ϊ��"
                            + numArrary[numArrary.length - 1]);
                }
            });
            return null;
        }

    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        SwingWokerThread usedSwingWoker = new SwingWokerThread();

        usedSwingWoker.setVisible(true);
        usedSwingWoker.setSize(new Dimension(400, 300));
        usedSwingWoker.setLocationRelativeTo(null);
        usedSwingWoker.setLayout(new BorderLayout());
        usedSwingWoker.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        usedSwingWoker.setLable(new Label("�����ť�����������"));
        usedSwingWoker.setButton(new Button("��ʼ����"));
        usedSwingWoker.getContentPane().add(usedSwingWoker.getLable(), BorderLayout.CENTER);
        usedSwingWoker.getContentPane().add(usedSwingWoker.getButton(), BorderLayout.SOUTH);

        NumberArrary arrarys = usedSwingWoker.new NumberArrary();
        try {
            arrarys.doInBackground();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
