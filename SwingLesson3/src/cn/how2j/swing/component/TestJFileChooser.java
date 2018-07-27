package cn.how2j.swing.component;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;

/**
 * 文件选择窗口
 * @author Administrator
 *
 */
public class TestJFileChooser {
	public static void main(String[] args) {
		  
        JFrame f = new JFrame("LOL");
        f.setLayout(new FlowLayout());
        
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(250, 150);
        f.setLocationRelativeTo(null);
  
        f.setVisible(true);
        
        
        JButton bOpen = new JButton("打开文件");
        JButton bSave = new JButton("保存文件");
  
        f.add(bOpen);
        f.add(bSave);
        
        JFileChooser fc = new JFileChooser();
        fc.setFileFilter(new FileFilter() {
            @Override
            public String getDescription() {
                return ".txt";
            }
             
            @Override
            public boolean accept(File f) {
                return f.getName().toLowerCase().endsWith(".txt");
            }
        });
          
        bOpen.addActionListener(new ActionListener() {
              
            @Override
            public void actionPerformed(ActionEvent e) {
                 int returnVal =  fc.showOpenDialog(f);
                 File file = fc.getSelectedFile();
                 if (returnVal == JFileChooser.APPROVE_OPTION) {
                     JOptionPane.showMessageDialog(f, "计划打开文件:" + file.getAbsolutePath());
                 }
                  
            }
        });
        bSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int returnVal =  fc.showSaveDialog(f);
                File file = fc.getSelectedFile();
                if (returnVal == JFileChooser.APPROVE_OPTION) {
                    JOptionPane.showMessageDialog(f, "计划保存到文件:" + file.getAbsolutePath());
                }
            }
        });
  
    }
}
