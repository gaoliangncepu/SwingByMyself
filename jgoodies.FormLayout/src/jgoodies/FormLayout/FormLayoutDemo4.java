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

public class FormLayoutDemo4 extends JPanel {
	private static final long serialVersionUID = 4L;


	public FormLayoutDemo4() {
      super(new BorderLayout());

        JPanel panel = new FormDebugPanel();
        FormLayout formLayout = new FormLayout(
        		"35px, 40pt, 35dlu, 1.0in, 3.5cm, 40.0mm",
        		"min, min, min, min, min, min"
        		);
        panel.setLayout(formLayout);
        CellConstraints c = new CellConstraints();
        panel.add(createLabel("30px"), c.xy(1, 1));
        panel.add(createLabel("40pt"), c.xy(2, 2));
        panel.add(createLabel("35dlu"), c.xy(3, 3));
        panel.add(createLabel("1.0in"), c.xy(4, 4));
        panel.add(createLabel("3.5cm"), c.xy(5, 5));
        panel.add(createLabel("40.0mm"), c.xy(6, 6));
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
      JFrame f = new JFrame("FormLayout: Size Specification Example 4");
      f.setDefaultCloseOperation(2);
      f.add(new FormLayoutDemo4());
      f.pack();
      f.setVisible(true);
    }
}
