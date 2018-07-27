package com.learn.GaoL.jMenu;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class TestJMenuDemo03 {
	public static void main(String[] args) {
		 
        JFrame f = new JFrame("�ޱ���-���±�");
        f.setSize(400, 300);
        f.setLocation(200, 200);
 
        // �˵���
        JMenuBar mb = new JMenuBar();
 
        // �˵�
        JMenu mFile = new JMenu("�ļ�");
        JMenu mEdit = new JMenu("�༭");
        JMenu mFormat = new JMenu("��ʽ");
        JMenu mLook = new JMenu("�鿴");
        JMenu mHelp = new JMenu("����");
 
        // �Ѳ˵����뵽�˵���
        mb.add(mFile);
        mb.add(mEdit);
        mb.add(mFormat);
        mb.add(mLook);
        mb.add(mHelp);
        
        // �˵���
        JMenuItem iNew = new JMenuItem("�½�(N)         Ctrl+N");
        JMenuItem iOpen = new JMenuItem("��(O)...      Ctrl+O");
        JMenuItem iSave = new JMenuItem("����(S)         Ctrl+S");
        JMenuItem iResave = new JMenuItem("���Ϊ(A)...");
        JMenuItem iSet = new JMenuItem("ҳ������(U)...");
        JMenuItem iPrint = new JMenuItem("��ӡ(P)...      Ctrl+P");
        JMenuItem iExit = new JMenuItem("�˳�(X)");
        
        // ��Ӳ˵���
        mFile.add(iNew);
        mFile.add(iOpen);
        mFile.add(iSave);
        mFile.add(iResave);
        
        mFile.addSeparator();
        mFile.add(iSet);
        mFile.add(iPrint);
        
        mFile.addSeparator();
        mFile.add(iExit);
 
        f.setJMenuBar(mb);
 
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        f.setVisible(true);
    }
}
