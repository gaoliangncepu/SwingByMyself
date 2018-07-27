package jgoodies.FormLayout;

/*
Code revised from Desktop Java Live:
http://www.sourcebeat.com/downloads/
*/


import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.jgoodies.forms.builder.ButtonBarBuilder;
import com.jgoodies.forms.debug.FormDebugPanel;

public class ButtonBarBuilderDemo2 extends JPanel {
    public ButtonBarBuilderDemo2() {
      super(new BorderLayout());

        ButtonBarBuilder builder = new ButtonBarBuilder(new FormDebugPanel());
        builder.setLeftToRight(true);

        builder.addButton(new JButton("Help"));
        builder.addRelatedGap();
        builder.addGlue();
        builder.addButton(new JButton[]{new JButton("Ok"), new JButton("Cancel"), new JButton("Apply")});
        add(builder.getPanel());
    }


    public static void main(String[] a){
      JFrame f = new JFrame("FormLayout: Button Bar Builder Example 2");
      f.setDefaultCloseOperation(2);
      f.add(new ButtonBarBuilderDemo2());
      f.pack();
      f.setVisible(true);
    }
}
