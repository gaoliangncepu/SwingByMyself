package jgoodies.FormLayout;

/*
Code revised from Desktop Java Live:
http://www.sourcebeat.com/downloads/
*/


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import com.jgoodies.forms.debug.FormDebugPanel;
import com.jgoodies.forms.layout.CellConstraints;
import com.jgoodies.forms.layout.FormLayout;


import javax.swing.*;

public class FormLayoutDemo5 extends JPanel {
	private static final long serialVersionUID = 5L;

	public FormLayoutDemo5() {
      super(new BorderLayout());
  
        JPanel panel = new FormDebugPanel();

        FormLayout formLayout = new FormLayout(
        		"left:pref, 10dlu, 100dlu", //内容默认左对齐，但left:pref和pref是有区别的
        		"default, default, default"
        		);
        
        panel.setLayout(formLayout);
        CellConstraints c = new CellConstraints();
        
        panel.add(createLabel("Small 1"), c.xy(1, 1));
        panel.add(createLabel("Larger Label"), c.xy(1, 2));
        panel.add(createLabel("Med. Label"), c.xy(1, 3));
        panel.add(new JTextField(), c.xy(3, 1));
        panel.add(new JTextField(), c.xy(3, 2));
        panel.add(new JTextField(), c.xy(3, 3));

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
      JFrame f = new JFrame("FormLayout: Spacing Example 5");
      f.setDefaultCloseOperation(2);
      f.add(new FormLayoutDemo5());
      f.pack();
      f.setVisible(true);
    }
}
