package jgoodies.FormLayout;

/*
Code revised from Desktop Java Live:
http://www.sourcebeat.com/downloads/
*/
import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.jgoodies.forms.builder.ButtonStackBuilder;
import com.jgoodies.forms.debug.FormDebugPanel;

public class ButtonStackBuilderExample1 extends JPanel {
    public ButtonStackBuilderExample1() {
      super(new BorderLayout());

        ButtonStackBuilder builder = new ButtonStackBuilder(new FormDebugPanel());
        builder.addButton(new JButton("Button1"));
        builder.addButton(new JButton("Button2"));

        JButton bigGriddedButton = new JButton("Button3");
        bigGriddedButton.setFont(bigGriddedButton.getFont().deriveFont(30.0f));
        builder.addButton(bigGriddedButton);
        builder.addUnrelatedGap();
        builder.addFixed(new JButton("Button4"));
        JButton bigFixedButton = new JButton("Button5");
        bigFixedButton.setFont(bigFixedButton.getFont().deriveFont(24.0f));
        builder.addFixed(bigFixedButton);
        builder.addUnrelatedGap();
        builder.addButton(new JButton[]{new JButton("Button6"), new JButton("Button7")});

        add(builder.getPanel());
    }

    public static void main(String[] a){
      JFrame f = new JFrame("FormLayout: Button Stack Builder Example 1");
      f.setDefaultCloseOperation(2);
      f.add(new ButtonStackBuilderExample1());
      f.pack();
      f.setVisible(true);
    }
}
