package com.jgoodies.forms.layout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

/**
 * ����ǰ�β��ԵĽ���Ļ�����ܣ����������ڼ̳�
 * @author Administrator
 *
 */
public abstract class BaseJFrame {
	private JFrame jFrame;
	
	// Constructor
	public BaseJFrame(String name, int width, int height) {
		// Create a new JFrame.
		jFrame = new JFrame(name);

        // Display the frame.
        jFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        jFrame.setSize(width, height);
        jFrame.setVisible(true);
	}

	public JFrame getjFrame() {
		return jFrame;
	}

	public void setjFrame(JFrame jFrame) {
		this.jFrame = jFrame;
	}
}
