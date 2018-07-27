package jgoodies.FormLayout;

import com.jgoodies.forms.factories.CC;
/*
Code revised from Desktop Java Live:
http://www.sourcebeat.com/downloads/
*/
import com.jgoodies.forms.layout.CellConstraints;
import com.jgoodies.forms.layout.FormLayout;


import javax.swing.*;

public class FormLayoutDemo1 extends JPanel {
    public FormLayoutDemo1() {
        FormLayout formLayout = new FormLayout("pref", "pref, pref");
        setLayout(formLayout);
        CellConstraints c = new CellConstraints();
        add(new JLabel("Component 1"), c.xy(1, 1));
        add(new JLabel("Component 2"), c.xy(1, 2));
        
        /* CellConstraints的可用语法
        	c.xy  (3, 5);
        	c.xy  (3, 5, CC.RIGHT, CC.BOTTOM);
        	c.xy  (3, 5, "right, bottom");

        	c.xyw (3, 5, 1);
        	c.xyw (3, 5, 1, CC.RIGHT, CC.BOTTOM);
        	c.xyw (3, 5, 1, "right, bottom");

        	c.xywh(3, 5, 1, 1);
        	c.xywh(3, 5, 1, 1, CC.RIGHT, CC.BOTTOM);
        	c.xywh(3, 5, 1, 1, "right, bottom");
        */
    }

    public static void main(String[] a){
      JFrame f = new JFrame("FormLayout: Basic Example 1");
      f.setDefaultCloseOperation(2);
      f.add(new FormLayoutDemo1());
      f.pack();
      f.setVisible(true);
    }
}
