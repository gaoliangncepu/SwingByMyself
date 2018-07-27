package jgoodies.FormLayout;

/*
Code revised from Desktop Java Live:
http://www.sourcebeat.com/downloads/
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

public class FormLayoutDemo2 extends JPanel {
	private static final long serialVersionUID = 2L;

	public FormLayoutDemo2() {
      super(new BorderLayout());

        FormDebugPanel panel = new FormDebugPanel();

        FormLayout formLayout =
                new FormLayout("left:100px, right:100px, center:100px, fill:100px", //列：left、right、center、fill
                		"top:100px, bottom:100px, center:100px, fill:100px");//行：top、bottom、center、fill
        
        panel.setLayout(formLayout);
        CellConstraints cc = new CellConstraints();
        
        panel.add(createLabel("L/T", 50, 50), cc.xy(1, 1));//x-列（位置），y-行（位置）
        panel.add(createLabel("L/B", 50, 50), cc.xy(1, 2));
        panel.add(createLabel("L/C", 50, 50), cc.xy(1, 3));
        panel.add(createLabel("L/F", 50, 50), cc.xy(1, 4));

        panel.add(createLabel("R/T", 50, 50), cc.xy(2, 1));
        panel.add(createLabel("R/B", 50, 50), cc.xy(2, 2));
        panel.add(createLabel("R/C", 50, 50), cc.xy(2, 3));
        panel.add(createLabel("R/F", 50, 50), cc.xy(2, 4));

        panel.add(createLabel("C/T", 50, 50), cc.xy(3, 1));
        panel.add(createLabel("C/B", 50, 50), cc.xy(3, 2));
        panel.add(createLabel("C/C", 50, 50), cc.xy(3, 3));
        panel.add(createLabel("C/F", 50, 50), cc.xy(3, 4));

        panel.add(createLabel("F/T", 50, 50), cc.xy(4, 1));
        panel.add(createLabel("F/B", 50, 50), cc.xy(4, 2));
        panel.add(createLabel("F/C", 50, 50), cc.xy(4, 3));
        panel.add(createLabel("F/F", 50, 50), cc.xy(4, 4));
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
        label.setOpaque(true);//设置为不透明的,内部填充
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.CENTER);
        return label;
    }

    public static void main(String[] a){
      JFrame f = new JFrame("FormLayout: Default Alignment Example 2");
      f.setDefaultCloseOperation(2);
      f.add(new FormLayoutDemo2());
      f.pack();
      f.setVisible(true);
    }
}
