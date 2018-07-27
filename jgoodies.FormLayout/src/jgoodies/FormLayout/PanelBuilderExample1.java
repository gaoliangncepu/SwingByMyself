package jgoodies.FormLayout;

/*
Code revised from Desktop Java Live:
http://www.sourcebeat.com/downloads/
*/


import java.awt.BorderLayout;

import javax.swing.BorderFactory;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.jgoodies.forms.builder.PanelBuilder;
import com.jgoodies.forms.layout.CellConstraints;
import com.jgoodies.forms.layout.FormLayout;

public class PanelBuilderExample1 extends JPanel {
    public PanelBuilderExample1() {
      super(new BorderLayout());

        PanelBuilder builder = new PanelBuilder(new FormLayout(""));
        builder.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        builder.appendColumn("right:pref");
        builder.appendColumn("fill:max(pref; 100px)");

        CellConstraints c = new CellConstraints();

        builder.appendRow("top:pref");
        builder.addLabel("First:", c.xy(1, 1));
        builder.add(new JTextField(), c.xy(2, 1));

        builder.appendRow("top:pref");
        builder.addLabel("Last:", c.xy(1, 2));
        builder.add(new JTextField(), c.xy(2, 2));

        builder.appendRow("top:pref");
        builder.addLabel("Married:", c.xy(1, 3));
        builder.add(new JCheckBox(), c.xy(2, 3));

        builder.appendRow("top:pref");
        builder.addLabel("Phone:", c.xy(1, 4));
        builder.add(new JTextField(), c.xy(2, 4));

        builder.appendRow("top:pref");
        builder.addLabel("Fax:", c.xy(1, 5));
        builder.add(new JTextField(), c.xy(2, 5));

        builder.appendRow("top:pref");
        builder.addLabel("Email:", c.xy(1, 6));
        builder.add(new JTextField(), c.xy(2, 6));

        builder.appendRow("top:pref");
        builder.addSeparator("Work", c.xywh(1, 7, 2, 1));

        builder.appendRow("top:pref");
        builder.addLabel("Company:", c.xy(1, 8));
        builder.add(new JTextField(), c.xy(2, 8));

        builder.appendRow("top:pref");
        builder.addLabel("Phone:", c.xy(1, 9));
        builder.add(new JTextField(), c.xy(2, 9));

        builder.appendRow("top:pref");
        builder.addLabel("Fax:", c.xy(1, 10));
        builder.add(new JTextField(), c.xy(2, 10));

        add(builder.getPanel());
    }

    public static void main(String[] a){
      JFrame f = new JFrame("FormLayout: Panel Builder Example 1");
      f.setDefaultCloseOperation(2);
      f.add(new PanelBuilderExample1());
      f.pack();
      f.setVisible(true);
    }
}
