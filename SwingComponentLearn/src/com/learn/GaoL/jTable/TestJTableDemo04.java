package com.learn.GaoL.jTable;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 * JScrollPane: ����������Panel
 * ��table�Ž�ȥ�Ϳ��Կ���table��ColumnNames
 * ͬ���İ�textarea�Ž�ȥ������textarea���ݹ����Ļ����ͻῴ�������� 
 *
 */
public class TestJTableDemo04 {
	public static void main(String[] args) {
		 
        JFrame f = new JFrame("LoL");
        f.setSize(400, 300);
        f.setLocation(200, 200);
        f.setLayout(new BorderLayout());
 
        String[] columnNames = new String[] { "id", "name", "hp", "damage" };
        String[][] heros = new String[][] { 
        	{ "1", "����", "616", "100" },
        	{ "2", "��Ī", "512", "102" }, 
        	{ "3", "����", "832", "200" } };
        JTable t = new JTable(heros, columnNames);
        
        // �����п��
        t.getColumnModel().getColumn(0).setPreferredWidth(10);
 
        // ����t���� JScrollPane
        JScrollPane sp = new JScrollPane(t);
 
        //���򴴽�һ���յ�JScrollPane����ͨ��setViewportView��table����JScrollPane��
        // JScrollPane sp = new JScrollPane();
        // sp.setViewportView(t);
 
        // ��sp����JTable���뵽JFrame�ϣ�
        f.add(sp, BorderLayout.CENTER);
 
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        f.setVisible(true);
    }
}
