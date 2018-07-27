package com.code.AVIC_RCD;
/*
 * 创建 高亮 2016-09-29 17:55
 */

import com.code.epoch.shell.mvc.AbstractView;
import com.jgoodies.binding.adapter.Bindings;
import org.jdesktop.swingx.JXTable;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.*;

/**
 * <p>
 */
public class V0501Receive extends JFrame {

    private javax.swing.JButton             jReadBtn;
    private javax.swing.JButton             jRmvBtn;
    private javax.swing.JButton             jInportBtn;
    private JXTable                         jTable;
    private javax.swing.JTree               jTree;
    private javax.swing.JProgressBar        jProgressBar;
    
    public V0501Receive() throws HeadlessException {
    	
    	initBindings();
    	initComponents();
    }

//    @Override
    protected void initBindings() {

        jReadBtn = new JButton();
        jRmvBtn = new JButton();
        jInportBtn = new JButton();

        jTable = new JXTable();
//        jTable.setModel(new DataSubTableModel(
//                controller.getSelectionInList("dataSubList")));
//        Bindings.bind(jTable, controller.getSelectionInList("dataSubList"));
        jTable.setModel(new DefaultTableModel(
    			new Object[][] {
    				{null, null, null, null, null},
    				{null, null, null, null, null},
    				{null, null, null, null, null},
    				{null, null, null, null, null},
    				{null, null, null, null, null},
    				{null, null, null, null, null},
    				{null, null, null, null, null},
    			},
    			new String[] {
    				"New column", "New column", "New column", "New column", "New column"
    			}
    		));

        jTree = new JTree();
        
        jProgressBar = new JProgressBar();
    }

//    @Override
    protected void initActions() {

    }

//    @Override
    protected void initEventHandling() {
        
    }

//    @Override
    protected void initComponents() {

    	Dimension dm;
		Toolkit tk = Toolkit.getDefaultToolkit();
		
		getContentPane().setPreferredSize(new Dimension(750, 500));
		getContentPane().setLayout(new BorderLayout());
//        getContentPane().setBorder(BorderFactory.createEmptyBorder(8, 8, 0, 0)); // 添加controller后取消注释
		
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(new Dimension(800, 550));
		dm = tk.getScreenSize();
		frame.setLocation(dm.width/2-frame.getWidth()/2,dm.height/2-frame.getHeight()/2);
        frame.add(getContentPane());
        frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        JPanel jBorderPanel1 = new JPanel();
//        jBorderPanel1.setBorder(BorderFactory.createMatteBorder(0,
//                0, 1, 0, ImageUtilsEx.getIcon("busi/border.png")));// 中间的分割虚线；用图片构成分割线
        jBorderPanel1.setPreferredSize(new Dimension(700, 80));
        jBorderPanel1.setLayout(null);

        JLabel jTitleLabel = new JLabel();
        jTitleLabel.setFont(new Font("宋体", Font.BOLD, 14));
        jTitleLabel.setForeground(new Color(51, 255, 204));
        jTitleLabel.setText("请点击【读取文件】按钮选择数据导入文件");
        jTitleLabel.setPreferredSize(new Dimension(300, 22));
        jBorderPanel1.add(jTitleLabel);
        jTitleLabel.setBounds(30, 10, 500, 22);

        jReadBtn.setIcon(new javax.swing.ImageIcon("F:\\IDEAworkspace\\PIS-RCD\\PIS-RCD\\images\\busi\\disk_read.png")); // NOI18N
        jReadBtn.setText("读取文件");
        jReadBtn.setIconTextGap(10);
//        CommonUtils.setDefButtonStyle(jReadBtn, "读取文件", "busi/disk_read.png");
        jReadBtn.setBounds(30, 40, 120, 22);
        jBorderPanel1.add(jReadBtn);

        jBorderPanel1.add(jProgressBar);
        jProgressBar.setBounds(160, 43, 300, 14);

        // 前面加图标
//        JLabel jTitleImgLabel = new JLabel();
//        jTitleImgLabel.setHorizontalAlignment(SwingConstants.RIGHT);
//        jTitleImgLabel.setIcon(ImageUtilsEx.getIcon("busi/dataIO.png")); // NOI18N
//        jTitleImgLabel.setVerticalAlignment(SwingConstants.TOP);
//        jTitleImgLabel.setPreferredSize(new Dimension(80, 60));
//        jBorderPanel1.add(jTitleImgLabel);
//        jTitleImgLabel.setBounds(5, 9, 65, 70);

        getContentPane().add(jBorderPanel1, BorderLayout.NORTH);

        JPanel jBorderPanel2 = new JPanel();
        jBorderPanel2.setLayout(new BorderLayout());
        jBorderPanel2.setBorder(BorderFactory.createEmptyBorder(8, 8, 0, 0));

        JPanel jBtnPanel = new JPanel();
        jBtnPanel.setPreferredSize(new Dimension(0, 35));
        jBtnPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 90, 3));

        jRmvBtn.setIcon(new javax.swing.ImageIcon("F:\\IDEAworkspace\\PIS-RCD\\PIS-RCD\\images\\busi\\search_delete.png")); // NOI18N
        jRmvBtn.setText("移除所选");
        jRmvBtn.setIconTextGap(10);
//        CommonUtils.setDefButtonStyle(jRmvBtn, "移除所选", "busi/search_delete.png");
        jBtnPanel.add(jRmvBtn);

        jInportBtn.setIcon(new javax.swing.ImageIcon("F:\\IDEAworkspace\\PIS-RCD\\PIS-RCD\\images\\busi\\document-import.png")); // NOI18N
        jInportBtn.setText("列表导入");
        jInportBtn.setIconTextGap(10);
//        CommonUtils.setDefButtonStyle(jInportBtn, "列表导入", "busi/document-import.png");
        jBtnPanel.add(jInportBtn);

        jBorderPanel2.add(jBtnPanel, BorderLayout.SOUTH);

        JSplitPane jboderPanel = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, true);
        jboderPanel.setDividerSize(6);
        
        JScrollPane jInfoScrollPane = new JScrollPane();
        jInfoScrollPane.setPreferredSize(new Dimension(210, 21));
        jInfoScrollPane.setBackground(new Color(255, 255, 255));
        jInfoScrollPane.setBorder(BorderFactory
        		.createEtchedBorder());
        
        jInfoScrollPane.setViewportView(jTree);
        
        jboderPanel.add(jInfoScrollPane, JSplitPane.RIGHT);

        JScrollPane jBSScrollPane = new JScrollPane();
        jBSScrollPane.setPreferredSize(new Dimension(490, 0));
        jBSScrollPane.setBackground(new Color(255, 255, 255));
        jBSScrollPane.setBorder(BorderFactory
        		.createEtchedBorder());

        jBSScrollPane.setViewportView(jTable);

        jboderPanel.add(jBSScrollPane, JSplitPane.LEFT);

        jBorderPanel2.add(jboderPanel, BorderLayout.CENTER);

        getContentPane().add(jBorderPanel2, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
    	V0501Receive demo = new V0501Receive();
//    	System.out.println(demo.toString());
    }

}
