package com.jgoodies.forms.layout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.jgoodies.forms.builder.PanelBuilder;

public class FormLayoutDemo extends BaseJFrame{

	private JFrame jFrame;
	
	public FormLayoutDemo(String name) {
		super(name, 400, 400);
		jFrame = getjFrame();
	}
	
	/**
	 * 直接向JPanel中添加组件
	 */
	public void testFormLayout1() {
		FormLayout layout = new FormLayout(
			      "left:pref, 1dlu, 100dlu, 1dlu, default",  // 5 columns(3 useful)
			      "pref, 3dlu, pref, 3dlu, pref");        	 // 5 rows(3 useful)
		CellConstraints cc = new CellConstraints();
		JPanel panel = new JPanel(layout);
		panel.add(new JLabel("Label1"),   cc.xy  (1, 1));
		panel.add(new JTextField(),       cc.xywh(3, 1, 3, 1));
		panel.add(new JLabel("Label2"),   cc.xy  (1, 3));
		panel.add(new JTextField(),       cc.xy  (3, 3));
		panel.add(new JLabel("Label3"),   cc.xy  (1, 5));
		panel.add(new JTextField(),       cc.xy  (3, 5));
		panel.add(new JButton("按钮"),  	  cc.xy  (5, 5));

		jFrame.add(panel);
//		jFrame.repaint();
		jFrame.pack();//调整此窗口的大小，以适合其子组件的首选大小和布局。如果该窗口和/或其所有者还不可显示，则在计算首选大小之前都将变得可显示。
	}
	
	/**
	 * 通过PanelBuilder向Panel中添加组件
	 */
	public void testFormLayout2() {
		FormLayout layout = new FormLayout(
			      "right:pref, 6dlu, 50dlu, 4dlu, default",  // columns
			      "pref, 3dlu, pref, 3dlu, pref");           // rows
		CellConstraints cc = new CellConstraints();
		PanelBuilder builder = new PanelBuilder(layout);
		builder.addLabel("Label1",         	cc.xy  (1, 1));
		builder.add(new JTextField(),     	cc.xywh(3, 1, 3, 1));
		builder.addLabel("Label2",         	cc.xy  (1, 3));
		builder.add(new JTextField(),      	cc.xy  (3, 3));
		builder.addLabel("Label3",         	cc.xy  (1, 5));
		builder.add(new JTextField(),      	cc.xy  (3, 5));
		builder.add(new JButton("按钮"), 		cc.xy  (5, 5));

		jFrame.add(builder.getPanel());	
//		jFrame.repaint();
		jFrame.pack();//调整此窗口的大小，以适合其子组件的首选大小和布局。如果该窗口和/或其所有者还不可显示，则在计算首选大小之前都将变得可显示。
	}

	public static void main(String[] args) {
        FormLayoutDemo demo = new FormLayoutDemo("FormLayout");
        demo.testFormLayout2();
    }
}
