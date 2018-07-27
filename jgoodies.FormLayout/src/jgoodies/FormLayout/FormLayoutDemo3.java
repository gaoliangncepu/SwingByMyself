package jgoodies.FormLayout;

/*
Code revised from Desktop Java Live:
http://www.sourcebeat.com/downloads/
*/


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import com.jgoodies.forms.debug.FormDebugPanel;
import com.jgoodies.forms.factories.CC;
import com.jgoodies.forms.layout.CellConstraints;
import com.jgoodies.forms.layout.FormLayout;


import javax.swing.*;

public class FormLayoutDemo3 extends JPanel {
	private static final long serialVersionUID = 3L;

	public FormLayoutDemo3() {
      super(new BorderLayout());

        FormDebugPanel panel = new FormDebugPanel();

        FormLayout formLayout =
                new FormLayout("100px, 100px, 100px, 100px",
                		"100px, 100px, 100px, 100px");
        
        panel.setLayout(formLayout);
        CellConstraints c = new CellConstraints();
        
        // CC是 CellConstraints的工厂类
        panel.add(createLabel("L/T", 50, 50), c.xy(1, 1, CC.LEFT, CellConstraints.TOP));
        panel.add(createLabel("L/B", 50, 50), c.xy(1, 2, CellConstraints.LEFT, CC.BOTTOM));
        panel.add(createLabel("L/C", 50, 50), c.xy(1, 3, CellConstraints.LEFT, CellConstraints.CENTER));
        panel.add(createLabel("L/F", 50, 50), c.xy(1, 4, CellConstraints.LEFT, CellConstraints.FILL));

        panel.add(createLabel("R/T", 50, 50), c.xy(2, 1, CellConstraints.RIGHT, CellConstraints.TOP));
        panel.add(createLabel("R/B", 50, 50), c.xy(2, 2, CellConstraints.RIGHT, CellConstraints.BOTTOM));
        panel.add(createLabel("R/C", 50, 50), c.xy(2, 3, CellConstraints.RIGHT, CellConstraints.CENTER));
        panel.add(createLabel("R/F", 50, 50), c.xy(2, 4, CellConstraints.RIGHT, CellConstraints.FILL));

        panel.add(createLabel("C/T", 50, 50), c.xy(3, 1, CellConstraints.CENTER, CellConstraints.TOP));
        panel.add(createLabel("C/B", 50, 50), c.xy(3, 2, CellConstraints.CENTER, CellConstraints.BOTTOM));
        panel.add(createLabel("C/C", 50, 50), c.xy(3, 3, CellConstraints.CENTER, CellConstraints.CENTER));
        panel.add(createLabel("C/F", 50, 50), c.xy(3, 4, CellConstraints.CENTER, CellConstraints.FILL));

        panel.add(createLabel("F/T", 50, 50), c.xy(4, 1, CellConstraints.FILL, CellConstraints.TOP));
        panel.add(createLabel("F/B", 50, 50), c.xy(4, 2, CellConstraints.FILL, CellConstraints.BOTTOM));
        panel.add(createLabel("F/C", 50, 50), c.xy(4, 3, CellConstraints.FILL, CellConstraints.CENTER));
        panel.add(createLabel("F/F", 50, 50), c.xy(4, 4, CellConstraints.FILL, CellConstraints.FILL));
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
      JFrame f = new JFrame("FormLayout: Explicit Alignment Example 3");
      f.setDefaultCloseOperation(2);
      f.add(new FormLayoutDemo3());
      f.pack();
      f.setVisible(true);
    }
}
