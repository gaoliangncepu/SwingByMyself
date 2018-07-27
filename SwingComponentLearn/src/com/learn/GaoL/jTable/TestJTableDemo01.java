package com.learn.GaoL.jTable;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JTable;

/**
 * ������
 * ��ʾһ��Table��Ҫ��������
 * 	1. һά���飺 String[] columnNames ��ʾ���ı���
 * 	2. ��ά���飺 String[][] heros ����е�����
 * Ĭ������£����ı����ǲ�����ʾ�����ˣ�����ʹ����JScrollPane
 *
 */
public class TestJTableDemo01 {
	public static void main(String[] args) {
		 
        JFrame f = new JFrame("LoL");
        f.setSize(400, 300);
        f.setLocation(200, 200);
        f.setLayout(new BorderLayout());
 
        // ����ϵ�title
        String[] columnNames = new String[] { "id", "name", "hp", "damage" };
        
        // ����е����ݣ���һ����ά����
        String[][] heros = new String[][] { 
        	{ "1", "����", "616", "100" },
        	{ "2", "��Ī", "512", "102" }, 
        	{ "3", "����", "832", "200" } };
        	
        JTable t = new JTable(heros, columnNames);
        f.add(t, BorderLayout.CENTER);
 
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        f.setVisible(true);
    }
}
