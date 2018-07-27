package com.learn.GaoL.jTable;

import java.util.List;

import javax.swing.table.AbstractTableModel;

/**
 * TableModel�����˼��:
 * 	��TableModel Demo ����PIS���õ���TableModel
 *
 */
@SuppressWarnings("serial")
public class HeroTableModelNew extends AbstractTableModel{
	String[] columnNames = new String[] { "id", "name", "hp", "damage" };
	 
    // ʹ�ô�DAO���ص�List��ΪTableModel������
    public List<Hero> heros = new HeroDAO().list();
 
    // heros.size����һ���ж�����
    public int getRowCount() {
        // TODO Auto-generated method stub
        return heros.size();
    }
 
    public int getColumnCount() {
        // TODO Auto-generated method stub
        return columnNames.length;
    }
 
    public String getColumnName(int columnIndex) {
        // TODO Auto-generated method stub
        return columnNames[columnIndex];
    }
 
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }
 
    // ��ͨ��heros.get(rowIndex)��ȡ�ж�Ӧ��Hero����
    // Ȼ�����columnIndex���ض�Ӧ������
    public Object getValueAt(int rowIndex, int columnIndex) {
        Hero h = heros.get(rowIndex);
        if (0 == columnIndex)
            return h.id;
        if (1 == columnIndex)
            return h.name;
        if (2 == columnIndex)
            return h.hp;
        if (3 == columnIndex)
            return h.damage;
        return null;
    }
}