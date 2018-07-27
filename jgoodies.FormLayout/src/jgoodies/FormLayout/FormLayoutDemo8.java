package jgoodies.FormLayout;

/*
	Code revised from Desktop Java Live:
	http://www.sourcebeat.com/downloads/
	
	“grow”是网格空间是否随面板尺寸的变化而变化：
		不加“grow”时，网格尺寸固定；
		加上“grow”时，网格按照指定的速率（倍率）增长尺寸；
*/


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.jgoodies.forms.debug.FormDebugPanel;
import com.jgoodies.forms.layout.CellConstraints;
import com.jgoodies.forms.layout.FormLayout;

public class FormLayoutDemo8 extends JPanel {
	private static final long serialVersionUID = 8L;

	public FormLayoutDemo8() {
      super(new BorderLayout());
        FormDebugPanel panel = new FormDebugPanel();

        FormLayout formLayout =
                new FormLayout(
                		"fill:50px:grow(.25), fill:50px:grow, fill:50px", 
                		"fill:50px");
        panel.setLayout(formLayout);
        CellConstraints c = new CellConstraints();
        panel.add(createLabel("Comp1"), c.xy(1, 1));
        panel.add(createLabel("Comp2"), c.xy(2, 1));
        panel.add(createLabel("Comp3"), c.xy(3, 1));

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
      JFrame f = new JFrame("FormLayout: Growable Example 8");
      f.setDefaultCloseOperation(2);
      f.add(new FormLayoutDemo8());
      f.pack();
      f.setVisible(true);
    }
}
