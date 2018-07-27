package com.code.AVIC_RCD;
/*
 * 创建 高亮 2016-09-30 8:59
 */

import com.code.epoch.swing.common.ImageUtilsEx;
import org.jdesktop.swingx.JXTable;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

/**
 * 【扫描查询】替代旧版本【扫描纪录】
 */
public class V0404Record extends JFrame{
    private javax.swing.JComboBox           jProjectCob;
    private javax.swing.JComboBox           jCheckResultCob;

    private javax.swing.JLabel              jCheckResultLabel;
    private javax.swing.JLabel              jReceiveTimeLabel;
    private javax.swing.JLabel              jMakeEntCodeLabel;
    private javax.swing.JLabel              jProCodeLabel;
    private javax.swing.JLabel              jPartNumLabel;
    private javax.swing.JLabel              jSeqNumLabel;
    private javax.swing.JLabel              jPageJumpLabel;
    private javax.swing.JLabel              jPageNumLabel;
    private javax.swing.JLabel              jRowNumLabel;
    private javax.swing.JLabel              jTitleLabel;// 提示语预留Label

    private javax.swing.JTextField          jReceiveTimeTxf;
    private javax.swing.JTextField          jMakeEntCodeTxf;
    private javax.swing.JTextField          jProCodeTxf;
    private javax.swing.JTextField          jPartNumTxf;
    private javax.swing.JTextField          jSeqNumTxf;
    private javax.swing.JTextField          jPageJumpTxf;
    private javax.swing.JTextField          jPageNumTxf;// 换成了jPageNumLabel
    private javax.swing.JTextField          jRowNumTxf;

    private javax.swing.JButton             jClearBtn;
    private javax.swing.JButton             jSearchBtn;
    private javax.swing.JButton             jPageUpBtn;
    private javax.swing.JButton             jPageDownBtn;
    private javax.swing.JButton             jExportBtn;

    private JXTable                         jTable;
    private javax.swing.JList               jList;
    
    public V0404Record() throws HeadlessException {
	
    	initBindings();
    	initComponents();
    }

//    @Override
    protected void initBindings() {

        jProjectCob        = new JComboBox();
        jCheckResultCob    = new JComboBox();

        jCheckResultLabel  = new JLabel();
        jReceiveTimeLabel  = new JLabel();
        jMakeEntCodeLabel  = new JLabel();
        jProCodeLabel      = new JLabel();
        jPartNumLabel      = new JLabel();
        jSeqNumLabel       = new JLabel();
        jPageJumpLabel     = new JLabel();
        jPageNumLabel      = new JLabel("1");
        jRowNumLabel       = new JLabel();
        jTitleLabel        = new JLabel();// 提示语预留Labe

        jReceiveTimeTxf    = new JTextField();
        jMakeEntCodeTxf    = new JTextField();
        jProCodeTxf        = new JTextField();
        jPartNumTxf        = new JTextField();
        jSeqNumTxf         = new JTextField();
        jPageJumpTxf       = new JTextField();
        jRowNumTxf         = new JTextField();

        jClearBtn          = new JButton();
        jSearchBtn         = new JButton();
        jPageUpBtn         = new JButton();
        jPageDownBtn       = new JButton();
        jExportBtn         = new JButton();

        jTable =new JXTable();
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
        jTable.setEditable(false);

        jList = new JList();
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
        jBorderPanel1.setBorder(BorderFactory.createMatteBorder(1,
        		1, 2, 1, new javax.swing.ImageIcon("F:\\IDEAworkspace\\PIS-RCD\\PIS-RCD\\images\\busi\\border.png")));// 中间的分割虚线；用纯色/图片构成分割线
//        	 	0, 1, 0, ImageUtilsEx.getIcon("busi/border.png")));// 中间的分割虚线；用图片构成分割线
//              0, 1, 0, new Color(51, 155, 204)));// 中间的分割虚线；用纯色/图片构成分割线
        jBorderPanel1.setPreferredSize(new Dimension(700, 150));
        jBorderPanel1.setLayout(new FlowLayout(FlowLayout.CENTER));
        jBorderPanel1.setBorder(BorderFactory.createEmptyBorder(8, 8, 0, 0));


        JPanel jSearchPanel = new JPanel();
        jSearchPanel.setPreferredSize(new Dimension(600, 150));
        jSearchPanel.setLayout(new BorderLayout());
        jSearchPanel.setBorder(BorderFactory.createMatteBorder(1,
                1, 1, 1, new Color(51, 155, 204)));// CS

        JPanel jTitlePanel = new JPanel();
        jTitlePanel.setPreferredSize(new Dimension(300, 28));
//        jTitlePanel.setSize(350, 28);
        jTitlePanel.setLayout(null);
        jTitlePanel.setBorder(BorderFactory.createMatteBorder(1,
//              0, 1, 0, new javax.swing.ImageIcon("F:\\IDEAworkspace\\PIS-RCD\\PIS-RCD\\images\\busi\\border.png")));// 第一条分割实线
//        		1, 1, 1, new Color(180, 180, 180)));// CS
                1, 1, 1, new Color(180, 180, 180)));// CS

        jTitleLabel.setFont(new Font("宋体", Font.BOLD, 14));
        jTitleLabel.setForeground(new Color(51, 255, 204));
        jTitleLabel.setText("检验扫描纪录——查询条件");
        jTitlePanel.add(jTitleLabel);
        jTitleLabel.setBounds(0, 3, 200, 22);

        jProjectCob.setName("jProjectCob");
        jTitlePanel.add(jProjectCob);
//        jProjectCob.setBounds(0, 3, 200, 22);
        jProjectCob.setBounds(255, 3, 190, 22);

        jSearchPanel.add(jTitlePanel, BorderLayout.NORTH);

        JPanel jSearchConditionPanel = new JPanel();
        jSearchConditionPanel.setPreferredSize(new Dimension(700, 72));
        jSearchConditionPanel.setLayout(null);

        jCheckResultLabel.setText("审查结果");
        jCheckResultLabel.setName("jCheckResultLabel");
        jSearchConditionPanel.add(jCheckResultLabel);
        jCheckResultLabel.setBounds(0, 10, 60, 22);

        jCheckResultCob.setName("jCheckResultCob");
        jSearchConditionPanel.add(jCheckResultCob);
        jCheckResultCob.setBounds(90, 10, 110, 22);

        jReceiveTimeLabel.setText("接收时间");
        jReceiveTimeLabel.setName("jReceiveTimeLabel");
        jSearchConditionPanel.add(jReceiveTimeLabel);
        jReceiveTimeLabel.setBounds(255, 10, 60, 22);

        jReceiveTimeTxf.setName("jReceiveTimeTxf");
        jSearchConditionPanel.add(jReceiveTimeTxf);
        jReceiveTimeTxf.setBounds(335, 10, 110, 22);

        jMakeEntCodeLabel.setText("承制单位代码");
        jMakeEntCodeLabel.setName("jMakeEntCodeLabel");
        jSearchConditionPanel.add(jMakeEntCodeLabel);
        jMakeEntCodeLabel.setBounds(0, 45, 85, 22);

        jMakeEntCodeTxf.setName("jMakeEntCodeTxf");
        jSearchConditionPanel.add(jMakeEntCodeTxf);
        jMakeEntCodeTxf.setBounds(90, 45, 110, 22);

        jProCodeLabel.setText("物品码");
        jProCodeLabel.setName("jProCodeLabel");
        jSearchConditionPanel.add(jProCodeLabel);
        jProCodeLabel.setBounds(255, 45, 45, 22);

        jProCodeTxf.setName("jProCodeTField");
        jSearchConditionPanel.add(jProCodeTxf);
        jProCodeTxf.setBounds(335, 45, 110, 22);

        jPartNumLabel.setText("零组件号");
        jPartNumLabel.setName("jPartNumLabel");
        jSearchConditionPanel.add(jPartNumLabel);
        jPartNumLabel.setBounds(0, 80, 60, 22);

        jPartNumTxf.setName("jPartNumTxf");
        jSearchConditionPanel.add(jPartNumTxf);
        jPartNumTxf.setBounds(90, 80, 110, 22);

        jSeqNumLabel.setText("序号");
        jSeqNumLabel.setName("jSeqNumLabel");
        jSearchConditionPanel.add(jSeqNumLabel);
        jSeqNumLabel.setBounds(255, 80, 30, 22);

        jSeqNumTxf.setName("jSeqNumTxf");
        jSearchConditionPanel.add(jSeqNumTxf);
        jSeqNumTxf.setBounds(335, 80, 110, 22);

        jSearchBtn.setIcon(new javax.swing.ImageIcon("C:\\AVIC_RCD\\src\\img\\images\\search")); // NOI18N
        jSearchBtn.setText("查 询");
        jSearchBtn.setIconTextGap(10);
//        CommonUtils.setDefButtonStyle(jSearchBtn, "查 询", "busi/search.png");
        jSearchConditionPanel.add(jSearchBtn);
        jSearchBtn.setBounds(500, 26, 100, 22);

        jClearBtn.setIcon(new javax.swing.ImageIcon("C:\\AVIC_RCD\\src\\img\\images\\edit_clear")); // NOI18N
        jClearBtn.setText("清 空");
        jClearBtn.setIconTextGap(10);
//        CommonUtils.setDefButtonStyle(jSearchBtn, "清 空", "busi/rescan.png");
        jSearchConditionPanel.add(jClearBtn);
        jClearBtn.setBounds(500, 64, 100, 22);

        jSearchPanel.add(jSearchConditionPanel, BorderLayout.CENTER);
        jBorderPanel1.add(jSearchPanel);

        JPanel jBorderPanel2 = new JPanel();
        jBorderPanel2.setPreferredSize(new Dimension(700, 300));
        jBorderPanel2.setLayout(new BorderLayout());
        jBorderPanel2.setBorder(BorderFactory.createEmptyBorder(8, 8, 0, 0));

        JSplitPane jSearchResultPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, true);
        jSearchResultPane.setDividerSize(6);

        JScrollPane jBSScrollPane = new JScrollPane();
        jBSScrollPane.setPreferredSize(new Dimension(500, 300));
        jBSScrollPane.setBackground(new java.awt.Color(255, 255, 255));
        jBSScrollPane.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jBSScrollPane.setViewportView(jTable);
        jSearchResultPane.add(jBSScrollPane, JSplitPane.LEFT);

        JScrollPane jInfoScrollPane = new JScrollPane();
        jInfoScrollPane.setPreferredSize(new Dimension(200, 300));
        jInfoScrollPane.setBackground(new java.awt.Color(255, 255, 255));
        jInfoScrollPane.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jInfoScrollPane.setViewportView(jList);
        jSearchResultPane.add(jInfoScrollPane, JSplitPane.RIGHT);

        jBorderPanel2.add(jSearchResultPane, BorderLayout.CENTER);

        JPanel jControlBtnPanel = new JPanel();
        jControlBtnPanel.setPreferredSize(new Dimension(10, 40));
        jControlBtnPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 0));
//        jControlBtnPanel.setLayout(null);
//        jControlBtnPanel.setBackground(new Color(123,132,132));//CS

        JPanel jCtrlPanel = new JPanel();
        jCtrlPanel.setPreferredSize(new Dimension(500, 40));
        jCtrlPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 60, 3));
//        jCtrlPanel.setBackground(new Color(190,132,132));//CS

        JPanel jctrlPnl1 = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        JPanel jctrlPnl2 = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 0));
        JPanel jctrlPnl3 = new JPanel(new FlowLayout(FlowLayout.RIGHT, 0, 0));

        jPageJumpLabel.setText("跳到页");
        jPageJumpLabel.setName("jPageJumpLabel");
        jPageJumpLabel.setPreferredSize(new java.awt.Dimension(40, 30));
        jctrlPnl1.add(jPageJumpLabel);

        jPageJumpTxf.setText("1");
        jPageJumpTxf.setName("jPageJumpTxf");
        jPageJumpTxf.setPreferredSize(new java.awt.Dimension(30, 22));
        jPageJumpTxf.setHorizontalAlignment(SwingConstants.CENTER);
        jctrlPnl1.add(jPageJumpTxf);

        jPageUpBtn.setIcon(new javax.swing.ImageIcon("C:\\AVIC_RCD\\src\\img\\pre"));
        jPageUpBtn.setName("jPageUpBtn");
        jPageUpBtn.setPreferredSize(new java.awt.Dimension(40, 22));
        jctrlPnl2.add(jPageUpBtn);

        jPageNumLabel.setName("jPageNumLabel");
        jPageNumLabel.setPreferredSize(new java.awt.Dimension(20, 30));
        jPageNumLabel.setHorizontalAlignment(SwingConstants.CENTER);
        jctrlPnl2.add(jPageNumLabel);

        jPageDownBtn.setIcon(new javax.swing.ImageIcon("C:\\AVIC_RCD\\src\\img\\next"));
        jPageDownBtn.setName("jPageDownBtn");
        jPageDownBtn.setPreferredSize(new java.awt.Dimension(40, 22));
        jctrlPnl2.add(jPageDownBtn);

        jRowNumLabel.setText("行数");
        jRowNumLabel.setName("jRowNumLabel");
        jRowNumLabel.setPreferredSize(new java.awt.Dimension(40, 30));
        jctrlPnl3.add(jRowNumLabel);

        jRowNumTxf.setText("10");
        jRowNumTxf.setName("jRowNumTxf");
        jRowNumTxf.setPreferredSize(new java.awt.Dimension(30, 22));
        jRowNumTxf.setHorizontalAlignment(SwingConstants.CENTER);
        jctrlPnl3.add(jRowNumTxf);

        jCtrlPanel.add(jctrlPnl1);
        jCtrlPanel.add(jctrlPnl2);
        jCtrlPanel.add(jctrlPnl3);

        JPanel jExportBtnPanel = new JPanel();
        jExportBtnPanel.setPreferredSize(new Dimension(200, 40));
        jExportBtnPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
//        jExportBtnPanel.setBackground(new Color(123,232,132));//CS

        jExportBtn.setName("jExportBtn");
        jExportBtn.setPreferredSize(new java.awt.Dimension(190, 30));
        jExportBtn.setText("导出全部扫描检验数据纪录");
        jExportBtnPanel.add(jExportBtn);

        jControlBtnPanel.add(jCtrlPanel);
//        jCtrlPanel.setLocation(30, 3);
        jControlBtnPanel.add(jExportBtnPanel);
//        jExportBtnPanel.setLocation(500,3);

        jBorderPanel2.add(jControlBtnPanel, BorderLayout.SOUTH);

        getContentPane().add(jBorderPanel1, BorderLayout.NORTH);
        getContentPane().add(jBorderPanel2, BorderLayout.CENTER);
        
        
    }
	public static void main(String[] args) {
        V0404Record demo = new V0404Record();
//    	System.out.println(demo.toString());
    }
}
