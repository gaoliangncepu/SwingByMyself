package jgoodies.FormLayout;

/*
	Code revised from Desktop Java Live:
	http://www.sourcebeat.com/downloads/

	行尺寸的控制规律
*/


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

import com.jgoodies.forms.debug.FormDebugPanel;
import com.jgoodies.forms.layout.CellConstraints;
import com.jgoodies.forms.layout.FormLayout;

public class FormLayoutDemo6 extends JPanel {
	private static final long serialVersionUID = 6L;

	public FormLayoutDemo6() {
      super(new BorderLayout());
  
        JTabbedPane tabbedPane = new JTabbedPane();

        String labelWidth = "50dlu";
        
        FormLayout formLayout = new FormLayout(
        		"max(" + labelWidth + ";pref), 2dlu, 100dlu", 
        		"default, default, default"
        		);
        JPanel tabPanel1 = new FormDebugPanel();
        tabPanel1.setLayout(formLayout);
        CellConstraints c = new CellConstraints();
        tabPanel1.add(createLabel("Small 1"), c.xy(1, 1));
        tabPanel1.add(createLabel("Larger Label"), c.xy(1, 2));
        tabPanel1.add(createLabel("Med. Label"), c.xy(1, 3));
        tabPanel1.add(new JTextField(), c.xy(3, 1));
        tabPanel1.add(new JTextField(), c.xy(3, 2));
        tabPanel1.add(new JTextField(), c.xy(3, 3));
        tabbedPane.add("Tab1", tabPanel1);

        formLayout = new FormLayout(
        		"max(" + labelWidth + ";pref), 2dlu, 100dlu", 
        		"default, default, default");
        JPanel tabPanel2 = new FormDebugPanel();
        tabPanel2.setLayout(formLayout);
        tabPanel2.add(createLabel("Small 2"), c.xy(1, 1));
        tabPanel2.add(createLabel("Small 3"), c.xy(1, 2));
        tabPanel2.add(createLabel("Small 4"), c.xy(1, 3));
        tabPanel2.add(new JTextField(), c.xy(3, 1));
        tabPanel2.add(new JTextField(), c.xy(3, 2));
        tabPanel2.add(new JTextField(), c.xy(3, 3));
        tabbedPane.add("Tab2", tabPanel2);

        formLayout = new FormLayout(
        		"pref, 2dlu, 100dlu", 
        		"default, default, default");
        JPanel tabPanel3 = new FormDebugPanel();
        tabPanel3.setLayout(formLayout);
        tabPanel3.add(createLabel("Small 5"), c.xy(1, 1));
        tabPanel3.add(createLabel("Small 6"), c.xy(1, 2));
        tabPanel3.add(createLabel("Small 7"), c.xy(1, 3));
        tabPanel3.add(new JTextField(), c.xy(3, 1));
        tabPanel3.add(new JTextField(), c.xy(3, 2));
        tabPanel3.add(new JTextField(), c.xy(3, 3));
        tabbedPane.add("Tab3", tabPanel3);

        formLayout = new FormLayout(
        		"pref, 2dlu, 100dlu", 
        		"default, default, default");
        JPanel tabPanel4 = new FormDebugPanel();
        tabPanel4.setLayout(formLayout);
        tabPanel4.add(createLabel("Small 8"), c.xy(1, 1));
        tabPanel4.add(createLabel("Larger Label"), c.xy(1, 2));
        tabPanel4.add(createLabel("Med. Label"), c.xy(1, 3));
        tabPanel4.add(new JTextField(), c.xy(3, 1));
        tabPanel4.add(new JTextField(), c.xy(3, 2));
        tabPanel4.add(new JTextField(), c.xy(3, 3));
        tabbedPane.add("Tab4", tabPanel4);

        JPanel panel = new JPanel(new BorderLayout());
        panel.add(tabbedPane, BorderLayout.CENTER);
        
        add(panel);
    }
    public JLabel createLabel(String text, int prefWidth, int prefHeight) {
        JLabel label = createLabel(text);
        label.setPreferredSize(new Dimension(prefWidth, prefHeight));
        return label;
    }
    public JLabel createLabel(String text) {
        JLabel label = new JLabel(text);
        label.setBackground(Color.lightGray);
        label.setBorder(BorderFactory.createLineBorder(Color.black));
        label.setOpaque(true);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.CENTER);
        return label;
    }

    public static void main(String[] a){
      JFrame f = new JFrame("FormLayout: Bounds Example 6");
      f.setDefaultCloseOperation(2);
      f.add(new FormLayoutDemo6());
      f.pack();
      f.setVisible(true);
    }
}
