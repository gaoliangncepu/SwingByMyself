package com.learn.GaoL.jMenu;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;

public class TestJMenuDemo01 {
	public static void main(String[] args) {
		 
        JFrame f = new JFrame("LoL");
        f.setSize(400, 300);
        f.setLocation(200, 200);
 
        // �˵���
        JMenuBar mb = new JMenuBar();
 
        // �˵�
        JMenu mHero = new JMenu("Ӣ��");
        JMenu mItem = new JMenu("����");
        JMenu mWord = new JMenu("����");
        JMenu mSummon = new JMenu("�ٻ�ʦ");
        JMenu mTalent = new JMenu("�츳��");
 
        // �Ѳ˵����뵽�˵���
        mb.add(mHero);
        mb.add(mItem);
        mb.add(mWord);
        mb.add(mSummon);
        mb.add(mTalent);
 
        // �Ѳ˵������뵽frame�������õ���set����add
        f.setJMenuBar(mb);
//        f.add(mb);
 
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        f.setVisible(true);
    }
}
