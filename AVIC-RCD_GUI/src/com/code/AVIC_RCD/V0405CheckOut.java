package com.code.AVIC_RCD;
import com.code.epoch.shell.mvc.AbstractView;
import com.code.epoch.shell.support.HintAssistSupport;
import com.code.epoch.swing.common.ImageUtilsEx;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;

public class V0405CheckOut extends JFrame {

    private JComboBox   jProjectCob;
    private JCheckBox   jisHangTag;

    private JTextArea   packBarCodeTxa;
    private JTextArea   logBookBarCodeTxa;
    private JTextArea   partBarCodeTxa;
    private JTextArea   complianceResultTxa;
    private JTextArea   consistanceResultTxa;

    private JButton     setDefaultButton;
    private JButton     rescanButton;
    private JButton     jUnreadBtn;
    private JButton     jUserFillBtn;
    private JButton     jFinishBtn;

    private JLabel      complianceLabel;
    private JLabel      consistanceIconLabel;

/*    public static Icon ICON_CODECHECK
            = ImageUtilsEx.getIcon("busi/CodeCheck.png");
    public static Icon ICON_CHECK
            = ImageUtilsEx.getIcon("busi/Check.png");
    public static Icon ICON_CHECKDISACCORD
            = ImageUtilsEx.getIcon("busi/CheckDisaccord.png");
    public static Icon ICON_CHECKUNKNOWN
            = ImageUtilsEx.getIcon("busi/CheckUnknown.png");
    public static Icon ICON_CHECKCORRECT
            = ImageUtilsEx.getIcon("busi/CheckCorrect.png");
    public static Icon ICON_CHECKHALF
            = ImageUtilsEx.getIcon("busi/CheckHalf.png");*/

//    @Override
    protected void initBindings() {

        // 型号项目
        jProjectCob = new JComboBox();
        AutoCompleteDecorator.decorate(jProjectCob);
        // 设置当前选择为默认型号(尚未添加)
//        setDefaultButton = createButton("defaultButton");
        // 外包装uid二维码
        packBarCodeTxa = new JTextArea();
        // 外包装存储二维码
//        storeBarCodeTxf = createTextField(C040Barcode.STR_STOREBARCODE);
        // 履历本uid二维码
        logBookBarCodeTxa = new JTextArea();
        // 产品uid二维码
        partBarCodeTxa = new JTextArea();
        // 条码符合性检验结果
        complianceResultTxa = new JTextArea();
        // 条码一致性检验结果
        consistanceResultTxa = new JTextArea();
        // 是否挂签
//        jisHangTag = createCheckBox("是否挂签", "ishangtag");

        initTxtResult();

        setDefaultButton = new JButton("设置当前选择为默认型号");
        rescanButton     = new JButton();
        jUnreadBtn       = new JButton();
        jUserFillBtn     = new JButton();
        jFinishBtn       = new JButton();
        jisHangTag       = new JCheckBox("是否挂签");
    }

//    @Override
    private void initTxtResult() {

//    	consistanceIconLabel.setText("測試");
//        consistanceIconLabel.setIcon(new javax.swing.ImageIcon(
//        		"F:\\IDEAworkspace\\PIS-RCD\\PIS-RCD\\images\\busi\\Check.png"));// 图片需要修改

        packBarCodeTxa.setText(null);
        logBookBarCodeTxa.setText(null);
        partBarCodeTxa.setText(null);

        // 条码符合性结果
        complianceResultTxa.setColumns(20);
        complianceResultTxa.setEditable(false);
        complianceResultTxa.setForeground(new Color(153, 153, 153));
        complianceResultTxa.setLineWrap(true);
        complianceResultTxa.setRows(1);
        complianceResultTxa.setMargin(new Insets(3, 8, 3, 8));

        // 条码一致性结果
        consistanceResultTxa.setColumns(20);
        consistanceResultTxa.setEditable(false);
        consistanceResultTxa.setForeground(new Color(153, 153, 153));
        consistanceResultTxa.setLineWrap(true);
        consistanceResultTxa.setRows(1);
        consistanceResultTxa.setMargin(new Insets(3, 8, 3, 8));
    }

//    @Override
    protected void initComponents() {

        Dimension dm;
        Toolkit tk = Toolkit.getDefaultToolkit();

        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(new Dimension(800, 550));
        dm = tk.getScreenSize();
        frame.setLocation(dm.width/2-frame.getWidth()/2,dm.height/2-frame.getHeight()/2);
        frame.add(getContentPane());
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        JPanel barCodeCheckPanel = new JPanel();

        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(barCodeCheckPanel, BorderLayout.CENTER);
//        getContentPane().setBorder(BorderFactory.createEmptyBorder(0, 8, 0, 0));

        barCodeCheckPanel.setLayout(
                new BoxLayout(barCodeCheckPanel, BoxLayout.PAGE_AXIS));
        barCodeCheckPanel.setSize(750, 500);

        // 选择项目型号 面板
        JPanel selectPanel = new JPanel();
        selectPanel.setPreferredSize(new Dimension(700, 30));
        selectPanel.setLayout(null);
        barCodeCheckPanel.add(selectPanel);

        selectPanel.add(jProjectCob);
        jProjectCob.setBounds(80, 3, 190, 24);

        selectPanel.add(setDefaultButton);
        jProjectCob.setBounds(280, 3, 190, 24);

        // 条码符合性检验面板
        JPanel checkPanel = new JPanel();
        barCodeCheckPanel.add(checkPanel);

        checkPanel.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0,
                ImageUtilsEx.getIcon("busi/border.png")));
        checkPanel.setPreferredSize(new Dimension(700, 300));
        checkPanel.setLayout(null);

        complianceLabel = new JLabel();
        complianceLabel.setFont(new Font("宋体", Font.BOLD, 14));
        complianceLabel.setForeground(new Color(51, 255, 204));
        complianceLabel.setText("条码符合性检验结果");
        complianceLabel.setBounds(80, 5, 160, 20);
        checkPanel.add(complianceLabel);

        JLabel packLabel = new JLabel();
        packLabel.setText("外包装（含用于存储的条码扫描）");
        packLabel.setBounds(80, 30, 300, 20);
        checkPanel.add(packLabel);

        JLabel logBookLabel = new JLabel();
        logBookLabel.setText("履历本");
        logBookLabel.setBounds(80, 135, 150, 20);
        checkPanel.add(logBookLabel);

        JLabel partLabel = new JLabel();
        partLabel.setText("产品表面");
        partLabel.setBounds(80, 240, 60, 20);
        checkPanel.add(partLabel);

        jisHangTag.setBounds(80, 240, 70, 20);
        checkPanel.add(jisHangTag);

        // 包装二维码扫描结果
        packBarCodeTxa.setEditable(false);
        packBarCodeTxa.setBounds(80, 50, 320, 80);
        checkPanel.add(packBarCodeTxa);

        // 履历本二维码扫描结果
        logBookBarCodeTxa.setEditable(false);
        logBookBarCodeTxa.setBounds(80, 155, 320, 80);
        checkPanel.add(logBookBarCodeTxa);

        // 产品表面二维码扫描结果
        partBarCodeTxa.setEditable(false);
        partBarCodeTxa.setBounds(80, 190, 320, 80);
        checkPanel.add(partBarCodeTxa);

        // 图标
        JLabel packIconLabel = new JLabel();
        packIconLabel.setIcon(ImageUtilsEx.getIcon("busi/Box.png"));
        packIconLabel.setBounds(5, 75, 30, 30);
        checkPanel.add(packIconLabel);

        JLabel logBookIconLabel = new JLabel();
        logBookIconLabel.setIcon(ImageUtilsEx.getIcon("busi/Notepad.png"));
        logBookIconLabel.setBounds(5, 180, 30, 30);
        checkPanel.add(logBookIconLabel);

        JLabel partIconLabel = new JLabel();
        partIconLabel.setIcon(ImageUtilsEx.getIcon("busi/lingjian.png"));
        partIconLabel.setBounds(5, 215, 30, 30);
        checkPanel.add(partIconLabel);

        // 三角指示标签
        JLabel packBarCodeIndex = new JLabel();
        packBarCodeIndex.setIcon(ImageUtilsEx.getIcon("busi/gray_triangle.png"));
        packBarCodeIndex.setBounds(290, 75, 30, 30);
        checkPanel.add(packBarCodeIndex);

        JLabel logBookBarCodeIndex = new JLabel();
        logBookBarCodeIndex.setIcon(ImageUtilsEx.getIcon("busi/gray_triangle.png"));
        logBookBarCodeIndex.setBounds(290, 180, 30, 30);
        checkPanel.add(logBookBarCodeIndex);

        JLabel partBarCodeIndex = new JLabel();
        partBarCodeIndex.setIcon(ImageUtilsEx.getIcon("busi/gray_triangle.png"));
        partBarCodeIndex.setBounds(290, 215, 30, 30);
        checkPanel.add(partBarCodeIndex);

        // 条码符合性检验结果面板
        JScrollPane complianceScrollPanel = new JScrollPane();
        complianceScrollPanel.setPreferredSize(new Dimension(300, 300));
        complianceScrollPanel.setBounds(350, 50, 300, 300);

        complianceScrollPanel.setViewportView(complianceResultTxa);
        checkPanel.add(complianceScrollPanel);

        // 条码一致性检验面板
        JPanel checkResultPanel = new JPanel();
        barCodeCheckPanel.add(checkResultPanel);

        barCodeCheckPanel.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0,
                ImageUtilsEx.getIcon("busi/border.png")));
        barCodeCheckPanel.setPreferredSize(new Dimension(700, 150));
        barCodeCheckPanel.setLayout(null);

        JLabel consistanceLabel = new JLabel();
        consistanceLabel.setFont(new Font("宋体", Font.BOLD, 14));
        consistanceLabel.setForeground(new Color(51, 255, 204));
        consistanceLabel.setText("条码一致性检验结果");
        consistanceLabel.setPreferredSize(new Dimension(90, 19));
        consistanceLabel.setBounds(80, 5, 150, 20);
        checkResultPanel.add(consistanceLabel);

        consistanceIconLabel = new JLabel();
        consistanceIconLabel.setBackground(new Color(255, 255, 255));
        consistanceIconLabel.setIcon(ImageUtilsEx.getIcon("busi/Check.png"));
        consistanceIconLabel.setBounds(5, 45, 30, 30);
        checkResultPanel.add(consistanceIconLabel);

        JScrollPane consistanceScrollPanel = new JScrollPane();
        consistanceScrollPanel.setPreferredSize(
                new Dimension(450, 80));
        consistanceScrollPanel.setBounds(80, 140, 620, 80);
        checkResultPanel.add(consistanceScrollPanel);

        consistanceScrollPanel.setViewportView(consistanceResultTxa);

        rescanButton.setIcon(ImageUtilsEx.getIcon("busi/rescan.png"));
        rescanButton.setText("重新开始");
        rescanButton.setIconTextGap(8);
        rescanButton.setMargin(new Insets(2, 2, 2, 2));
        rescanButton.setBounds(80, 232, 125, 30);

        checkResultPanel.add(rescanButton);

        jUnreadBtn.setIcon(ImageUtilsEx.getIcon("busi/no_unread.png"));
        jUnreadBtn.setText("无法识别");
        jUnreadBtn.setIconTextGap(8);
        jUnreadBtn.setMargin(new Insets(2, 2, 2, 2));
        jUnreadBtn.setBounds(240, 232, 125, 30);

        checkResultPanel.add(rescanButton);

        jUserFillBtn.setIcon(ImageUtilsEx.getIcon("busi/UserFill.png"));
        jUserFillBtn.setText("手动填写");
        jUserFillBtn.setIconTextGap(8);
        jUserFillBtn.setMargin(new Insets(2, 2, 2, 2));
        jUserFillBtn.setBounds(380, 232, 125, 30);

        checkResultPanel.add(rescanButton);

        jFinishBtn.setIcon(ImageUtilsEx.getIcon("busi/ok_finish.png"));
        jFinishBtn.setText("检验完成");
        jFinishBtn.setIconTextGap(8);
        jFinishBtn.setMargin(new Insets(2, 2, 2, 2));
        jFinishBtn.setBounds(535, 232, 575, 30);

        checkResultPanel.add(rescanButton);
    }

    public V0405CheckOut() {

        initBindings();
    }

    public static void main(String[] args) {

        V0405CheckOut checkOut = new V0405CheckOut();
        checkOut.initComponents();
    }
}
