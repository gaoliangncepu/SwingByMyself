package com.learn.GaoL.jTable;

import javax.swing.table.AbstractTableModel;

/**
 * TableModel�����˼��:
 * 	��Model����˼���ָ���£����ݺ���ʾ���뿪���ˡ�
 *  �������JTable���ԣ������ݲ��֣�Ҳ����ʾ����(�����п����Ϣ)�� 
 *  ���ݲ��֣�ר����һ���࣬����TableModel�������ڴ��Ҫ��ʾ�����ݡ�
 *  
 *  ʹ��TableModel�ķ�ʽ���Table��Ҫ��ʾ������
 *  	HeroTableModel �̳�AbstractTableModel ������ʵ���˽ӿ�TableModel����HeroTableModel ���ṩһ��table��ʾ��Ҫ��������Ϣ
 *  		1. getRowCount ����һ���ж�����
 *  		2. getColumnCount ����һ���ж�����
 *  		3. getColumnName ÿһ�е�����
 *  		4. isCellEditable ��Ԫ���Ƿ�����޸�
 *  		5. getValueAt ÿһ����Ԫ�����ֵ
 *  
 *  ��ͼ�ν�����Ҫ��Ⱦ��һ����Ԫ������ݵ�ʱ�򣬾ͻ���÷���TabelModel��getValueAt(0,0) ���ѷ���ֵ�õ�����ʾ.
 *
 */
@SuppressWarnings("serial")
public class HeroTableModel extends AbstractTableModel{
	String[] columnNames = new String[] { "id", "name", "hp", "damage" };
    String[][] heros = new String[][] { { "1", "����", "616", "100" },
            { "2", "��Ī", "512", "102" }, { "3", "����", "832", "200" } };
 
    // ����һ���ж�����
    public int getRowCount() {
        // TODO Auto-generated method stub
        return heros.length;
    }
 
    // ����һ���ж�����
    public int getColumnCount() {
        // TODO Auto-generated method stub
        return columnNames.length;
    }
 
    // ��ȡÿһ�е�����
    public String getColumnName(int columnIndex) {
        // TODO Auto-generated method stub
        return columnNames[columnIndex];
    }
 
    // ��Ԫ���Ƿ�����޸�
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }
 
    // ÿһ����Ԫ�����ֵ
    public Object getValueAt(int rowIndex, int columnIndex) {
        // TODO Auto-generated method stub
        return heros[rowIndex][columnIndex];
    }
}
