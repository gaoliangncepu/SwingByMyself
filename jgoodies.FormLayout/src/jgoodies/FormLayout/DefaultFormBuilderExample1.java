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

import com.jgoodies.forms.builder.DefaultFormBuilder;
import com.jgoodies.forms.layout.FormLayout;

public class DefaultFormBuilderExample1 extends JPanel {
    public DefaultFormBuilderExample1() {
      super(new BorderLayout());
  
        DefaultFormBuilder builder = new DefaultFormBuilder(new FormLayout(""));
        builder.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        builder.appendColumn("right:pref");
        builder.appendColumn("3dlu");
        builder.appendColumn("fill:max(pref; 100px)");
        builder.appendColumn("5dlu");
        builder.appendColumn("right:pref");
        builder.appendColumn("3dlu");
        builder.appendColumn("fill:max(pref; 100px)");

        builder.append("First:", new JTextField());

        builder.append("Last:", new JTextField());
        builder.nextLine();

        builder.append("Married:", new JCheckBox());
        builder.nextLine();

        builder.append("Phone:", new JTextField());
        builder.nextLine();

        builder.append("Fax:", new JTextField());
        builder.nextLine();

        builder.append("Email:", new JTextField());
        builder.nextLine();

        builder.appendSeparator("Work");

        builder.append("Company:", new JTextField());
        builder.nextLine();

        builder.append("Phone:", new JTextField());
        builder.nextLine();

        builder.append("Fax:", new JTextField());
        builder.nextLine();

        add(builder.getPanel());
    }

    public static void main(String[] a){
      JFrame f = new JFrame("FormLayout: Default Form Builder Example 1");
      f.setDefaultCloseOperation(2);
      f.add(new DefaultFormBuilderExample1());
      f.pack();
      f.setVisible(true);
    }
}
