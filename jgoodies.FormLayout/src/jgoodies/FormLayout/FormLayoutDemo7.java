package jgoodies.FormLayout;

/*
	Code revised from Desktop Java Live:
	http://www.sourcebeat.com/downloads/
	
	组件的跨表格放置，用于控制组件跨行、跨列布局
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

public class FormLayoutDemo7 extends JPanel {
	private static final long serialVersionUID = 7L;

	public FormLayoutDemo7() {
      super(new BorderLayout());

        FormDebugPanel panel = new FormDebugPanel();

        FormLayout formLayout =
                new FormLayout(
                		"fill:100px, fill:100px, fill:100px", 
                		"fill:100px, fill:100px");
        panel.setLayout(formLayout);
        CellConstraints c = new CellConstraints();
        panel.add(createLabel("Comp1"), c.xywh(1, 1, 1, 2));
        panel.add(createLabel("Comp2"), c.xywh(2, 1, 2, 1));
        panel.add(createLabel("Comp3"), c.xy(2, 2));
        panel.add(createLabel("Comp4"), c.xy(3, 2));

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
      JFrame f = new JFrame("FormLayout: Spanning Example 7");
      f.setDefaultCloseOperation(2);
      f.add(new FormLayoutDemo7());
      f.pack();
      f.setVisible(true);
    }
}
