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
 * SwingWorker 开启后台计算线程
 * SwingWorker 被设计为只执行一次。多次执行 SwingWorker 将不会调用两次 doInBackground()方法。 doInBackground()方法完成后，执行 done()方法。
 * 		doInBackground():执行后台运算
 * 		done():开启事件指派线程，刷新前端界面
 * 		get():返回doInBackground()的执行结果状态；
 *
 * 在专用线程中执行长时间 GUI交互任务的抽象类。 
 *
	使用 Swing 编写多线程应用程序时，要记住两个约束条件： 
		1).不应该在 事件指派线程(Swing的前端界面线程)上运行耗时任务。否则应用程序将无响应。 
		2).只能在事件指派线程上访问 Swing组件。 

	这些约束意味着需要时间密集计算操作的 GUI应用程序至少需要以下两个线程：
		1).执行长时间任务的线程——SwingWorker的价值； 
		2).所有 GUI相关活动的事件指派线程（EDT）这涉及到难以实现的线程间通信。 

	SwingWorker 设计用于需要在后台线程中运行长时间运行任务的情况，并可在完成后或者在处理过程中向 UI提供更新。
	SwingWorker 的子类必须实现 doInBackground()方法，以执行后台计算。
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
                        System.out.println(i + "号数为：" + numArrary[i]);
                    }
                    Arrays.sort(numArrary);
                    System.out.println("生成的最大随机数为："
                            + numArrary[numArrary.length - 1]);
                    lable.setText("生成的最大随机数为："
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
        
        usedSwingWoker.setLable(new Label("点击按钮生成随机数组"));
        usedSwingWoker.setButton(new Button("开始生成"));
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
