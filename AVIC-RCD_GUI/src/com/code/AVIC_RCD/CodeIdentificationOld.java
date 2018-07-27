package com.code.AVIC_RCD;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.border.EmptyBorder;


public class CodeIdentificationOld extends JFrame {

	// 主菜单定义
    public JPopupMenu jMainMenu;                                                //弹出菜单，点击左上jMenuLogoLabel弹出
    // Variables declaration - do not modify
    private javax.swing.JPanel      basePanel;
    private javax.swing.JScrollPane baseScroll;
    private javax.swing.JLabel[] jMenuBtnImgLabel  = new javax.swing.JLabel[8];
    private javax.swing.JLabel[] jMenuBtnLabel     = new javax.swing.JLabel[8];
    private javax.swing.JLabel[] jMenuBtnTextLabel = new javax.swing.JLabel[8];
    private javax.swing.JLabel      jMenuLabel;
    private javax.swing.JLabel      jMenuLogoLabel;
    private javax.swing.JPanel      jMenuPanel;
    private javax.swing.JPanel      jMiddlePanel;
    private javax.swing.JSplitPane  jSplitPane;
    private javax.swing.JLabel      jTipLabel;
    private javax.swing.JLabel      jTitleLabel;
    private javax.swing.JPanel      jTitlePanel;
    private javax.swing.JPanel      jVicePanel;
    private javax.swing.JLabel      jImgLabel;
    private javax.swing.JPanel      jMainPanel;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JPanel      jFramePanel;
    private javax.swing.JLabel      jViceBackgroundLabel;
    private javax.swing.JLabel      jViceBtnLabel;
    private javax.swing.JLabel      jViceBtnLabel1;
    private javax.swing.JLabel      jViceBtnLabel2;
    private javax.swing.JPanel      jViceMainPanel;
    private javax.swing.JLabel      jViceRightLabel;
    private javax.swing.JLabel      jViceShrinkLabel;
    private javax.swing.JLabel      jViceTitleLabel;
    private javax.swing.JPanel      jViceTitleLeftPanel;
    private javax.swing.JPanel      jViceTitlePanel;

    // End of variables declaration

    private javax.swing.JPanel   jViceTitleRightPanel;
    private int                  iMenuCurrent = -1;                             //用来记录的业务界面，取值对应数据库中读出的业务顺序，为-1表示处于系统主界面
    private ArrayList<ArrayList> liMenuList   = null;                           //从数据库中读出的登陆用户主菜单信息存放在此list中
    private ArrayList<ArrayList> liBtnList    = null;                           //从数据库中读出的登陆用户常用功能按钮信息存放在此list中
    private int iMenuCnt;

    //左中右框架相关定义
    private boolean            VicePanelOpen = true;                            //标识左侧副窗口是否打开，true为打开，false为收起
    private javax.swing.JPanel ViceAddPanel  = new BSSearchPanel();             //左侧副窗口需要加载的Panel
    private javax.swing.JLabel jViceShrinkPanelLabel;                           //左侧父窗口收起后所显示的画面
	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public CodeIdentificationOld() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		baseScroll = new javax.swing.JScrollPane();
        basePanel = new javax.swing.JPanel();
        jMenuPanel = new javax.swing.JPanel();
        jMenuLogoLabel = new javax.swing.JLabel();
        jMenuBtnImgLabel[0] = new javax.swing.JLabel();
        jMenuBtnTextLabel[0] = new javax.swing.JLabel();
        jMenuBtnLabel[0] = new javax.swing.JLabel();
        jMenuBtnImgLabel[1] = new javax.swing.JLabel();
        jMenuBtnTextLabel[1] = new javax.swing.JLabel();
        jMenuBtnLabel[1] = new javax.swing.JLabel();
        jMenuBtnImgLabel[2] = new javax.swing.JLabel();
        jMenuBtnTextLabel[2] = new javax.swing.JLabel();
        jMenuBtnLabel[2] = new javax.swing.JLabel();
        jMenuBtnImgLabel[3] = new javax.swing.JLabel();
        jMenuBtnTextLabel[3] = new javax.swing.JLabel();
        jMenuBtnLabel[3] = new javax.swing.JLabel();
        jMenuBtnImgLabel[4] = new javax.swing.JLabel();
        jMenuBtnTextLabel[4] = new javax.swing.JLabel();
        jMenuBtnLabel[4] = new javax.swing.JLabel();
        jMenuBtnImgLabel[5] = new javax.swing.JLabel();
        jMenuBtnTextLabel[5] = new javax.swing.JLabel();
        jMenuBtnLabel[5] = new javax.swing.JLabel();
        jMenuBtnImgLabel[6] = new javax.swing.JLabel();
        jMenuBtnTextLabel[6] = new javax.swing.JLabel();
        jMenuBtnLabel[6] = new javax.swing.JLabel();
        jMenuBtnImgLabel[7] = new javax.swing.JLabel();
        jMenuBtnTextLabel[7] = new javax.swing.JLabel();
        jMenuBtnLabel[7] = new javax.swing.JLabel();
        jMenuLabel = new javax.swing.JLabel();
        jMainMenu = new JPopupMenu();                                           //创建主菜单对象

        jScrollPane = new javax.swing.JScrollPane();
        jFramePanel = new javax.swing.JPanel();
        jSplitPane = new javax.swing.JSplitPane();
        jVicePanel = new javax.swing.JPanel();
        jMiddlePanel = new javax.swing.JPanel();
        jTitlePanel = new javax.swing.JPanel();
        jTipLabel = new javax.swing.JLabel();
        jImgLabel = new javax.swing.JLabel();
        jTitleLabel = new javax.swing.JLabel();
        jMainPanel = new javax.swing.JPanel();
        jViceTitlePanel = new javax.swing.JPanel();
        jViceTitleLeftPanel = new javax.swing.JPanel();
        jViceShrinkLabel = new javax.swing.JLabel();
        jViceTitleLabel = new javax.swing.JLabel();
        jViceBackgroundLabel = new javax.swing.JLabel();
        jViceTitleRightPanel = new javax.swing.JPanel();
        jViceBtnLabel = new javax.swing.JLabel();
        jViceBtnLabel1 = new javax.swing.JLabel();
        jViceBtnLabel2 = new javax.swing.JLabel();
        jViceRightLabel = new javax.swing.JLabel();
        jViceMainPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        //==============读取数据库，初始化主菜单===============    	

        //读取数据库-用户角色定制表-user_role_info

        String sql = "select role_menu_id,role_menu_root,role_menu_name,role_menu_place " +
                "from user_role_info where role_name = 'user' order by id";

        try {
            liMenuList = DataBaseDao.getDCInstance().doQuery(sql);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(ViewInit.this,
                    "错误代码：0039\n主菜单加载失败，数据库查询操作错误", "数据库错误", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (liMenuList.size() < 1) {
            JOptionPane.showMessageDialog(ViewInit.this,
                    "你没有任何操作权限，请联系管理员申请权限。", "警告", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }

        //初始化主菜单包含设置主菜单的消息响应
        JMenu rootMenu;
        JMenuItem menuitem;

        //完成第一条菜单的增加
        rootMenu = new JMenu((String) liMenuList.get(0).get(1));                // 成品扫描
        menuitem = new JMenuItem((String) liMenuList.get(0).get(2));            // 条码检验

        menuitem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                int iCnt = Integer.parseInt(liMenuList.get(0).get(3).toString());
                if (iCnt != iMenuCurrent) {                                     // 如果当前页面不匹配
                    jMainPanel.removeAll();
                    try {
                        jMainPanel.add((JPanel) Class.forName((String) liMenuList.get(0).get(0)).newInstance());  // 【？这句话不太懂】
                    } catch (InstantiationException e) {
                        e.printStackTrace();
                        JOptionPane.showMessageDialog(ViewInit.this,
                                "InstantiationException", "动态加载业务类错误", JOptionPane.INFORMATION_MESSAGE);
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                        JOptionPane.showMessageDialog(ViewInit.this,
                                "IllegalAccessException", "动态加载业务类错误", JOptionPane.INFORMATION_MESSAGE);
                    } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                        JOptionPane.showMessageDialog(ViewInit.this,
                                "ClassNotFoundException", "动态加载业务类错误", JOptionPane.INFORMATION_MESSAGE);
                    }
                    //关联设置相应的快捷菜单按钮变化
                    jMenuBtnLabel[0].setIcon(null);
                    jMenuBtnLabel[1].setIcon(null);
                    jMenuBtnLabel[2].setIcon(null);
                    jMenuBtnLabel[3].setIcon(null);
                    jMenuBtnLabel[4].setIcon(null);
                    jMenuBtnLabel[5].setIcon(null);
                    jMenuBtnLabel[6].setIcon(null);
                    jMenuBtnLabel[7].setIcon(null);
                    if (iCnt < 8) {
                        jMenuBtnLabel[iCnt].setIcon(new javax.swing.ImageIcon(Constant.imgPath + "MenuBtnImg_click")); // NOI18N
                    }
                    jMainPanel.repaint();
                    SubstanceLookAndFeel.setSkin(new CremeSkin());
                    iMenuCurrent = iCnt;
                }
            }
        });
        rootMenu.add(menuitem);

        //完成第一个之后菜单的增加
        for (iMenuCnt = 1; iMenuCnt < liMenuList.size(); iMenuCnt++) {
            if (!liMenuList.get(iMenuCnt).get(1).equals(liMenuList.get(iMenuCnt - 1).get(1))) {
                jMainMenu.add(rootMenu);
                rootMenu = new JMenu((String) liMenuList.get(iMenuCnt).get(1));
            }
            menuitem = new JMenuItem((String) liMenuList.get(iMenuCnt).get(2));
            menuitem.addActionListener(new ActionListener() {
                int iCnt = Integer.parseInt(liMenuList.get(iMenuCnt).get(3).toString());
                int index = iMenuCnt;

                public void actionPerformed(ActionEvent arg0) {
                    if (iCnt != iMenuCurrent) {
                        jMainPanel.removeAll();
                        try {
                            jMainPanel.add((JPanel) Class.forName((String) liMenuList.get(index).get(0)).newInstance());
                        } catch (InstantiationException e) {
                            e.printStackTrace();
                            JOptionPane.showMessageDialog(ViewInit.this,
                                    "InstantiationException", "动态加载业务类错误", JOptionPane.INFORMATION_MESSAGE);
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                            JOptionPane.showMessageDialog(ViewInit.this,
                                    "IllegalAccessException", "动态加载业务类错误", JOptionPane.INFORMATION_MESSAGE);
                        } catch (ClassNotFoundException e) {
                            e.printStackTrace();
                            JOptionPane.showMessageDialog(ViewInit.this,
                                    "ClassNotFoundException", "动态加载业务类错误", JOptionPane.INFORMATION_MESSAGE);
                        }
                        //关联设置相应的快捷菜单按钮变化
                        jMenuBtnLabel[0].setIcon(null);
                        jMenuBtnLabel[1].setIcon(null);
                        jMenuBtnLabel[2].setIcon(null);
                        jMenuBtnLabel[3].setIcon(null);
                        jMenuBtnLabel[4].setIcon(null);
                        jMenuBtnLabel[5].setIcon(null);
                        jMenuBtnLabel[6].setIcon(null);
                        jMenuBtnLabel[7].setIcon(null);
                        if (iCnt < 8) {
                            jMenuBtnLabel[iCnt].setIcon(new javax.swing.ImageIcon("C://AVIC_RCD/src/img/MenuBtnImg_click")); // NOI18N
                        }
                        jMainPanel.repaint();
                        SubstanceLookAndFeel.setSkin(new CremeSkin());
                        iMenuCurrent = iCnt;
                    }
                }
            });
            rootMenu.add(menuitem);

            if ("条码识别".equals(menuitem.getText())) {
                menuitem = new JMenuItem("扫描枪设置");
                menuitem.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent arg0) {
                        ToolbarPopDlg dlg = new ToolbarPopDlg(6);
                        dlg.setLocationRelativeTo(CommonBean.getJf());
                        dlg.setVisible(true);
                    }
                });
                rootMenu.add(menuitem);
            }
        }
        jMainMenu.add(rootMenu);

//		jMainMenu.addSeparator();					                    		//添加一个分隔符

        rootMenu = new JMenu("系统功能");                                        // 最外层菜单是jMainMenu，其上建立rootMenu,其上建立menuitem
        menuitem = new JMenuItem("代码数据更新");
        menuitem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                ToolbarPopDlg dlg = new ToolbarPopDlg(5);
                dlg.setLocationRelativeTo(CommonBean.getJf());
                dlg.setVisible(true);
            }
        });
        rootMenu.add(menuitem);

        menuitem = new JMenuItem("构型数据更新");
        menuitem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                ToolbarPopDlg dlg = new ToolbarPopDlg(9);
                dlg.setLocationRelativeTo(CommonBean.getJf());
                dlg.setVisible(true);
            }
        });
        rootMenu.add(menuitem);

        menuitem = new JMenuItem("登录口令设置");
        menuitem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                ToolbarPopDlg dlg = new ToolbarPopDlg(7);
                dlg.setLocationRelativeTo(CommonBean.getJf());
                dlg.setVisible(true);
            }
        });
        rootMenu.add(menuitem);

        menuitem = new JMenuItem("数据密级设置");
        menuitem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                if (1 != JOptionPane.showOptionDialog(null, "<html>本软件所处理的型号物品数据可能涉密，<br>请按照您单位具体数据涉密情况进行标密。</html>",
                        "数据密级设置", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
                        null, new String[]{"内部", "秘密"}, null)) {
                    CommonBean.setSecret("0");
                } else {
                    CommonBean.setSecret("1");
                }
                String sql = "update system_info set secret = '" + CommonBean.getSecret() + "'";
                try {
                    DataBaseDao.getDCInstance().doExcute(sql);
                } catch (SQLException e1) {
                    JOptionPane.showMessageDialog(null,
                            "错误代码：ViewInit-0001\n数据库更新失败，请联系开发人员\n" + e1.getMessage(), "数据库错误", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                setTitle(DataCApp.TITLE + "-" + DataCApp.VERSION + "——中航工业编码中心" +
                        CommonBean.getSecretStr() + "  欢迎：" + CommonBean.getEntCode());
            }
        });
        rootMenu.add(menuitem);

        jMainMenu.add(rootMenu);

        rootMenu = new JMenu("帮助信息");
        menuitem = new JMenuItem("帮助文档");
        menuitem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                File helpfile = new File(Constant.HelpPath);

                try {
                    Desktop.getDesktop().open(helpfile);
                } catch (IOException e1) {
                    log.error(e1.getMessage(), e1);
                }
            }
        });
        rootMenu.add(menuitem);

//		menuitem = new JMenuItem("软件地图");
//    	iMenuCnt = 12;
//		menuitem.addActionListener(new ActionListener(){
//			int iCnt = iMenuCnt;
//			@Override
//			public void actionPerformed(ActionEvent arg0) {
//				if (iCnt != iMenuCurrent) {
//					jMainPanel.removeAll();
//					setTitle("tip", "软件地图：概览本软件各业务功能及流程关系，可点击功能名称进入相应功能");
//					HomePage homepage = new HomePage();
//					jMainPanel.add(homepage);
//					//关联设置相应的快捷菜单按钮变化
//					jMenuBtnLabel[0].setIcon(null);
//					jMenuBtnLabel[1].setIcon(null);
//					jMenuBtnLabel[2].setIcon(null);
//					jMenuBtnLabel[3].setIcon(null);
//					jMenuBtnLabel[4].setIcon(null);
//					jMenuBtnLabel[5].setIcon(null);
//					jMenuBtnLabel[6].setIcon(null);
//					jMenuBtnLabel[7].setIcon(null);
//					jMainPanel.repaint();
//					SubstanceLookAndFeel.setSkin(new CremeSkin());
//					iMenuCurrent = iCnt;
//				}
//			}
//		});
//		rootMenu.add(menuitem);

        menuitem = new JMenuItem("软件信息");
        menuitem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                ToolbarPopDlg dlg = new ToolbarPopDlg(8);
                dlg.setLocationRelativeTo(CommonBean.getJf());
                dlg.setVisible(true);
            }
        });
        rootMenu.add(menuitem);

        jMainMenu.add(rootMenu);

        //==============读取数据库，初始化常用功能区===============    	

        //读取数据库-用户角色定制表-user_role_info

        sql = "select role_menu_id,role_menu_name from user_role_info " +
                "where role_name = 'user' order by ROLE_MENU_PLACE";
        try {
            liBtnList = DataBaseDao.getDCInstance().doQuery(sql);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(ViewInit.this,
                    "错误代码：1039\n主功能加载失败，数据库查询操作错误", "数据库错误", JOptionPane.ERROR_MESSAGE);
            return;
        }

        for (iMenuCnt = 0; iMenuCnt < liBtnList.size(); iMenuCnt++) {
            if (iMenuCnt < 8) {                                                 // 只有8个常用菜单
                jMenuBtnImgLabel[iMenuCnt].setIcon(new javax.swing.ImageIcon(Constant.imgPath + liBtnList.get(iMenuCnt).get(0).toString())); // NOI18N
                jMenuBtnTextLabel[iMenuCnt].setText((String) liBtnList.get(iMenuCnt).get(1));
                jMenuBtnLabel[iMenuCnt].addMouseListener(new MouseListener() {
                    int iCnt = iMenuCnt;

                    @Override
                    public void mouseClicked(MouseEvent e) {
                    }

                    @Override
                    public void mouseEntered(MouseEvent e) {
                        if (iCnt != iMenuCurrent) {
                            jMenuBtnLabel[iCnt].setIcon(new javax.swing.ImageIcon(Constant.imgPath + "MenuBtnImg_hover")); // NOI18N
                        }
                    }

                    @Override
                    public void mouseExited(MouseEvent e) {
                        if (iCnt != iMenuCurrent) {
                            jMenuBtnLabel[iCnt].setIcon(null);
                        }
                    }

                    @Override
                    public void mousePressed(MouseEvent e) {
                        if (iCnt != iMenuCurrent) {
                            jMenuBtnLabel[0].setIcon(null);
                            jMenuBtnLabel[1].setIcon(null);
                            jMenuBtnLabel[2].setIcon(null);
                            jMenuBtnLabel[3].setIcon(null);
                            jMenuBtnLabel[4].setIcon(null);
                            jMenuBtnLabel[5].setIcon(null);
                            jMenuBtnLabel[6].setIcon(null);
                            jMenuBtnLabel[7].setIcon(null);
                            jMenuBtnLabel[iCnt].setIcon(new javax.swing.ImageIcon(Constant.imgPath + "MenuBtnImg_click")); // NOI18N
                            jMainPanel.removeAll();
                            try {
                                jMainPanel.add((JPanel) Class.forName((String) liBtnList.get(iCnt).get(0)).newInstance());
                            } catch (InstantiationException e1) {
                                e1.printStackTrace();
                                JOptionPane.showMessageDialog(ViewInit.this,
                                        "InstantiationException", "动态加载业务类错误", JOptionPane.INFORMATION_MESSAGE);
                            } catch (IllegalAccessException e1) {
                                e1.printStackTrace();
                                JOptionPane.showMessageDialog(ViewInit.this,
                                        "IllegalAccessException", "动态加载业务类错误", JOptionPane.INFORMATION_MESSAGE);
                            } catch (ClassNotFoundException e1) {
                                e1.printStackTrace();
                                JOptionPane.showMessageDialog(ViewInit.this,
                                        "ClassNotFoundException", "动态加载业务类错误", JOptionPane.INFORMATION_MESSAGE);
                            }
                            jMainPanel.repaint();
                            SubstanceLookAndFeel.setSkin(new CremeSkin());
                            iMenuCurrent = iCnt;
                        }
                    }

                    @Override
                    public void mouseReleased(MouseEvent e) {
                    }
                });
            }
        }

        //========================从此处开始为NetBeans中生成的界面代码==============================
        baseScroll.setName("baseScroll"); // NOI18N
        baseScroll.setPreferredSize(new java.awt.Dimension(1200, 865));

        basePanel.setName("basePanel"); // NOI18N
        basePanel.setPreferredSize(new java.awt.Dimension(998, 645));
        basePanel.setLayout(new java.awt.BorderLayout());

        jMenuPanel.setName("jMenuPanel"); // NOI18N
        jMenuPanel.setPreferredSize(new java.awt.Dimension(1000, 100));
        jMenuPanel.setRequestFocusEnabled(false);                               // 提供一个关于此 JComponent 是否应该获得焦点的提示。
        jMenuPanel.setLayout(null);

        jMenuLogoLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuLogoLabel.setName("jMenuLogoLabel"); // NOI18N
        jMenuPanel.add(jMenuLogoLabel);
        jMenuLogoLabel.setBounds(23, 20, 60, 61);

        for (int i = 0; i < 8; i++) {                                           // for循环添加常用功能组件及其显示特点
            jMenuPanel.add(jMenuBtnImgLabel[i]);
            jMenuBtnImgLabel[i].setBounds(255 + 94 * i, 12, 60, 60);

            jMenuBtnTextLabel[i].setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jMenuBtnTextLabel[i].setPreferredSize(new java.awt.Dimension(90, 15));
            jMenuPanel.add(jMenuBtnTextLabel[i]);
            jMenuBtnTextLabel[i].setBounds(240 + 94 * i, 75, 90, 15);

            jMenuPanel.add(jMenuBtnLabel[i]);
            jMenuBtnLabel[i].setBounds(240 + 94 * i, 7, 90, 90);
        }

        // 主页常用功能栏一整行
        jMenuLabel.setIcon(new javax.swing.ImageIcon("C://AVIC_RCD/src/img/imagesMenuPanel")); // NOI18N
        jMenuLabel.setName("jMenuLabel"); // NOI18N
        jMenuLabel.setOpaque(true);                                                    // 如果为 true，则该组件绘制其边界内的所有像素。
        jMenuLabel.setPreferredSize(new java.awt.Dimension(1600, 100));
        jMenuPanel.add(jMenuLabel);
        jMenuLabel.setBounds(0, 0, 1600, 100);

        basePanel.add(jMenuPanel, java.awt.BorderLayout.PAGE_START);

        jFramePanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)); // 设置此组件的边框。
        jFramePanel.setName("jFramePanel"); // NOI18N
        jFramePanel.setLayout(new java.awt.BorderLayout());

        jSplitPane.setBackground(new java.awt.Color(204, 204, 204));
        jSplitPane.setBorder(null);
        jSplitPane.setDividerLocation(200);
        jSplitPane.setDividerSize(5);
        jSplitPane.setContinuousLayout(true);
        jSplitPane.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jSplitPane.setName("jSplitPane"); // NOI18N

        jVicePanel.setName("jVicePanel"); // NOI18N
        jVicePanel.setLayout(new java.awt.BorderLayout());

        jViceTitlePanel.setMinimumSize(new java.awt.Dimension(0, 1200));
        jViceTitlePanel.setName("jViceTitlePanel"); // NOI18N
        jViceTitlePanel.setPreferredSize(new java.awt.Dimension(10, 30));
        jViceTitlePanel.setLayout(new java.awt.BorderLayout());

        jViceTitleLeftPanel.setMinimumSize(new java.awt.Dimension(0, 1200));
        jViceTitleLeftPanel.setName("jViceTitleLeftPanel"); // NOI18N
        jViceTitleLeftPanel.setLayout(null);

        jViceShrinkLabel.setIcon(new javax.swing.ImageIcon("C://AVIC_RCD/src/img/images\\shrink_handler_left")); // NOI18N
        jViceShrinkLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jViceShrinkLabel.setMinimumSize(new java.awt.Dimension(0, 1200));
        jViceShrinkLabel.setName("jViceShrinkLabel"); // NOI18N
        jViceShrinkLabel.setPreferredSize(new java.awt.Dimension(40, 10));
        jViceTitleLeftPanel.add(jViceShrinkLabel);
        jViceShrinkLabel.setBounds(2, 8, 14, 14);

        jViceTitleLabel.setIcon(new javax.swing.ImageIcon("C://AVIC_RCD/src/img/images\\BSSearchTitle_Left")); // NOI18N
        jViceTitleLabel.setMinimumSize(new java.awt.Dimension(0, 1200));
        jViceTitleLabel.setName("jViceTitleLabel"); // NOI18N
        jViceTitleLeftPanel.add(jViceTitleLabel);
        jViceTitleLabel.setBounds(0, 0, 90, 30);

        jViceBackgroundLabel.setIcon(CommonUtill.getNewSizeImg("C://AVIC_RCD/src/img/images\\BSSearchTitle_Middle", 1400, 30)); // NOI18N
        jViceBackgroundLabel.setMinimumSize(new java.awt.Dimension(0, 1200));
        jViceBackgroundLabel.setName("jViceBackgroundLabel"); // NOI18N
        jViceTitleLeftPanel.add(jViceBackgroundLabel);
        jViceBackgroundLabel.setBounds(90, 0, 1400, 30);

        jViceTitlePanel.add(jViceTitleLeftPanel, java.awt.BorderLayout.CENTER);

        jViceTitleRightPanel.setMinimumSize(new java.awt.Dimension(0, 1200));
        jViceTitleRightPanel.setName("jViceTitleRightPanel"); // NOI18N
        jViceTitleRightPanel.setPreferredSize(new java.awt.Dimension(80, 30));
        jViceTitleRightPanel.setLayout(null);

        jViceBtnLabel.setIcon(new javax.swing.ImageIcon(Constant.imgPath + "images\\zoom")); // NOI18N
        jViceBtnLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jViceBtnLabel.setMinimumSize(new java.awt.Dimension(0, 1200));
        jViceBtnLabel.setName("jViceBtnLabel"); // NOI18N
        jViceTitleRightPanel.add(jViceBtnLabel);
        jViceBtnLabel.setBounds(50, 5, 20, 20);

        jViceBtnLabel1.setIcon(new javax.swing.ImageIcon(Constant.imgPath + "images\\search_add")); // NOI18N
        jViceBtnLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jViceBtnLabel1.setMinimumSize(new java.awt.Dimension(0, 1200));
        jViceBtnLabel1.setName("jViceBtnLabel1"); // NOI18N
        jViceTitleRightPanel.add(jViceBtnLabel1);
        jViceBtnLabel1.setBounds(25, 5, 20, 20);

        jViceBtnLabel2.setIcon(new javax.swing.ImageIcon(Constant.imgPath + "images\\search_set")); // NOI18N
        jViceBtnLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jViceBtnLabel2.setMinimumSize(new java.awt.Dimension(0, 1200));
        jViceBtnLabel2.setName("jViceBtnLabel2"); // NOI18N
        jViceTitleRightPanel.add(jViceBtnLabel2);
        jViceBtnLabel2.setBounds(0, 5, 20, 20);

        jViceRightLabel.setIcon(new javax.swing.ImageIcon(Constant.imgPath + "images\\BSSearchTitle_Right")); // NOI18N
        jViceRightLabel.setMaximumSize(new java.awt.Dimension(0, 15));
        jViceRightLabel.setMinimumSize(new java.awt.Dimension(0, 1200));
        jViceRightLabel.setName("jViceRightLabel"); // NOI18N
        jViceRightLabel.setPreferredSize(new java.awt.Dimension(34, 15));
        jViceTitleRightPanel.add(jViceRightLabel);
        jViceRightLabel.setBounds(0, 0, 80, 30);

        jViceTitlePanel.add(jViceTitleRightPanel, java.awt.BorderLayout.EAST);

        jVicePanel.add(jViceTitlePanel, java.awt.BorderLayout.PAGE_START);

        jViceMainPanel.setName("jViceMainPanel"); // NOI18N
        jViceMainPanel.setLayout(new java.awt.BorderLayout());

        jVicePanel.add(jViceMainPanel, java.awt.BorderLayout.CENTER);

        jSplitPane.setLeftComponent(jVicePanel);

        jMiddlePanel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 0, new java.awt.Color(153, 153, 153)));
        jMiddlePanel.setMinimumSize(new java.awt.Dimension(1, 0));
        jMiddlePanel.setName("jMiddlePanel"); // NOI18N
        jMiddlePanel.setLayout(new java.awt.BorderLayout());

        jTitlePanel.setName("jTitlePanel"); // NOI18N
        jTitlePanel.setPreferredSize(new java.awt.Dimension(10, 30));
        jTitlePanel.setLayout(null);

        jTipLabel.setText("用户查询");
        jTipLabel.setMinimumSize(new java.awt.Dimension(0, 0));
        jTipLabel.setName("jTipLabel"); // NOI18N
        jTitlePanel.add(jTipLabel);
        jTipLabel.setBounds(50, 5, 800, 20);

        jImgLabel.setIcon(new javax.swing.ImageIcon(Constant.imgPath + "images\\tip")); // NOI18N
        jImgLabel.setMaximumSize(new java.awt.Dimension(30, 30));
        jImgLabel.setMinimumSize(new java.awt.Dimension(0, 0));
        jImgLabel.setName("jImgLabel"); // NOI18N
        jImgLabel.setPreferredSize(new java.awt.Dimension(20, 20));
        jTitlePanel.add(jImgLabel);
        jImgLabel.setBounds(15, 5, 20, 20);

        jTitleLabel.setIcon(new javax.swing.ImageIcon(Constant.imgPath + "images\\title")); // NOI18N
        jTitleLabel.setText("jLabel4");
        jTitleLabel.setMinimumSize(new java.awt.Dimension(0, 0));
        jTitleLabel.setName("jTitleLabel"); // NOI18N
        jTitlePanel.add(jTitleLabel);
        jTitleLabel.setBounds(0, 0, 1600, 30);

        jMiddlePanel.add(jTitlePanel, java.awt.BorderLayout.PAGE_START);

        jScrollPane.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        jScrollPane.setMinimumSize(new java.awt.Dimension(0, 0));
        jScrollPane.setName("jScrollPane"); // NOI18N

        jMainPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 0, new java.awt.Color(153, 153, 153)));
        jMainPanel.setMinimumSize(new java.awt.Dimension(0, 0));
        jMainPanel.setName("jMainPanel"); // NOI18N
        jMainPanel.setLayout(new java.awt.BorderLayout());
        jScrollPane.setViewportView(jMainPanel);

        jMiddlePanel.add(jScrollPane, java.awt.BorderLayout.CENTER);

        jSplitPane.setRightComponent(jMiddlePanel);

        jFramePanel.add(jSplitPane, java.awt.BorderLayout.CENTER);

        basePanel.add(jFramePanel, java.awt.BorderLayout.CENTER);

        baseScroll.setViewportView(basePanel);                                  // 创建一个视口（如果有必要）并设置其视图。

        getContentPane().add(baseScroll, BorderLayout.SOUTH);

        pack();                                                                 // 调整此窗口的大小，以适合其子组件的首选大小和布局。

        //jViceShrinkPanelLabel
        jViceShrinkPanelLabel = new javax.swing.JLabel();
        jViceShrinkPanelLabel.setIcon(new javax.swing.ImageIcon(Constant.imgPath + "images\\BSSearchPanel")); // NOI18N
        jViceShrinkPanelLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jViceShrinkPanelLabel.setMaximumSize(new java.awt.Dimension(15, 1200));
        jViceShrinkPanelLabel.setMinimumSize(new java.awt.Dimension(0, 1200));
        jViceShrinkPanelLabel.setName("jLabel1"); // NOI18N
        jViceShrinkPanelLabel.setPreferredSize(new java.awt.Dimension(15, 1200));
        jViceShrinkPanelLabel.setVerifyInputWhenFocusTarget(false);
        jViceShrinkPanelLabel.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

    }// </editor-fold>
	
	
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CodeIdentificationOld frame = new CodeIdentificationOld();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
