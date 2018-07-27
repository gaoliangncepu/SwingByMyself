package cn.how2j.swing.practices;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.SwingWorker;

import com.sun.jndi.url.corbaname.corbanameURLContextFactory;

@SuppressWarnings("serial")
public class PractiseDemo03 extends JFrame{
	
	public static void main(String[] args) {
		PractiseDemo03 demo = new PractiseDemo03();
		demo.setTitle("组件综合练习");
		demo.setSize(new Dimension(400, 300));
		demo.setLocationRelativeTo(null);
		demo.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		demo.testStep11(demo);
		demo.setVisible(true);
	}

	public void testStep11(JFrame frame) {
		JPanel contentPanel = new JPanel();
		contentPanel.setLayout(null);
		
		JLabel label1 = new JLabel("源文件地址：");
		label1.setBounds(20, 20, 80, 30);
		JLabel label2 = new JLabel("复制到：");
		label2.setBounds(210, 20, 60, 30);
		JLabel label3 = new JLabel("文件复制进度：");
		label3.setBounds(130, 60, 100, 30);
		
		JTextArea area = new JTextArea();
		area.setBounds(20, 100, 360, 150);
		
		JTextField textField1 = new JTextField();
		textField1.setBounds(100, 20, 100, 30);
		JTextField textField2 = new JTextField();
		textField2.setBounds(270, 20, 100, 30);
		
		JPasswordField pwdField = new JPasswordField();
		pwdField.setPreferredSize(new Dimension(100, 30));
		
		JButton button = new JButton("开始复制");
		button.setBounds(20, 60, 100, 30);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setBounds(230, 65, 140, 20);
		
		contentPanel.add(label1);
		contentPanel.add(textField1);
		contentPanel.add(label2);
		contentPanel.add(textField2);
		contentPanel.add(button);
		contentPanel.add(label3);
		contentPanel.add(progressBar);
		contentPanel.add(area);
		
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				BackupThread backupThread = new BackupThread(area);
				backupThread.addPropertyChangeListener(evt -> {
	                if ("progress".equals(evt.getPropertyName())) {
	                    if (null == evt.getNewValue()) {
	                        return;
	                    }
	                    progressBar.setValue((Integer) evt.getNewValue());
	                }
	            });
				backupThread.execute();
			}
		});
		
		frame.add(contentPanel);
	}
}

class BackupThread extends SwingWorker<Integer, Object> {
	private JTextArea area;
	
	public BackupThread(JTextArea area) {
		this.area = area;
	}
	
	@Override
	protected Integer doInBackground() throws Exception {
		setProgress(0);
		for (int i = 0; i < 100; i++) {
			try {
				Thread.sleep(10);
				setProgress(i);
			} catch (InterruptedException e2) {
				e2.printStackTrace();
			}
		}
		setProgress(100);
		return 100;
	}
	
	@Override
	protected void done() {
        area.setText("复制完成！");
	}
}

