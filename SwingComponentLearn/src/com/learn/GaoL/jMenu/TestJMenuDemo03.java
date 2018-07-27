package com.learn.GaoL.jMenu;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class TestJMenuDemo03 {
	public static void main(String[] args) {
		 
        JFrame f = new JFrame("无标题-记事本");
        f.setSize(400, 300);
        f.setLocation(200, 200);
 
        // 菜单栏
        JMenuBar mb = new JMenuBar();
 
        // 菜单
        JMenu mFile = new JMenu("文件");
        JMenu mEdit = new JMenu("编辑");
        JMenu mFormat = new JMenu("格式");
        JMenu mLook = new JMenu("查看");
        JMenu mHelp = new JMenu("帮助");
 
        // 把菜单加入到菜单栏
        mb.add(mFile);
        mb.add(mEdit);
        mb.add(mFormat);
        mb.add(mLook);
        mb.add(mHelp);
        
        // 菜单项
        JMenuItem iNew = new JMenuItem("新建(N)         Ctrl+N");
        JMenuItem iOpen = new JMenuItem("打开(O)...      Ctrl+O");
        JMenuItem iSave = new JMenuItem("保存(S)         Ctrl+S");
        JMenuItem iResave = new JMenuItem("另存为(A)...");
        JMenuItem iSet = new JMenuItem("页面设置(U)...");
        JMenuItem iPrint = new JMenuItem("打印(P)...      Ctrl+P");
        JMenuItem iExit = new JMenuItem("退出(X)");
        
        // 添加菜单项
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
