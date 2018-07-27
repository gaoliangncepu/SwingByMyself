package cn.how2j.swing.shell;

import java.awt.Dialog;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;

/**
 * JDialog 设置为模态，通过常量指定“阻塞范围”；
 * Dialog.ModalityType.APPLICATION_MODAL 对话框阻塞同一 Java 应用程序中的所有顶层窗口（它自己的子层次结构中的顶层窗口除外）。 
 * Dialog.ModalityType.DOCUMENT_MODAL 对话框阻塞对同一文档中所有顶层窗口的输入（它自己的子层次结构中的顶层窗口除外）。 
 * Dialog.ModalityType.MODELESS 对话框不阻塞任何顶层窗口。 
 * Dialog.ModalityType.TOOLKIT_MODAL 对话框阻塞从同一工具包运行所有顶层窗口（它自己的子层次结构中的顶层窗口除外）。 
 *
 */
public class TestModalJDialog {
	public static void main(String[] args) {
        JFrame f = new JFrame("外部窗体");
        f.setSize(800, 600);
        f.setLocation(100, 100);
 
        // 根据外部窗体实例化JDialog
        JDialog d = new JDialog(f);
//        d.setModalityType(Dialog.DEFAULT_MODALITY_TYPE);// 等效于setModal(true)已过时
//        d.setModalityType(Dialog.ModalityType.APPLICATION_MODAL);// 不阻塞任何顶层窗口
        d.setModalityType(Dialog.ModalityType.MODELESS);// 不阻塞任何顶层窗口
 
        d.setTitle("模态的对话框");
        d.setSize(400, 300);
        d.setLocation(200, 200);
        
        d.setLayout(null);
        JButton b = new JButton("一键秒对方基地挂");
        b.setBounds(50, 50, 280, 30);
        d.add(b);
 
        f.setVisible(true);
        d.setVisible(true);
    }
}
