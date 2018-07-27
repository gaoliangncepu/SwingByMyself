package jgoodies.FormLayout;

/*
	Code revised from Desktop Java Live:
	http://www.sourcebeat.com/downloads/
	
	p:尺寸，代表使用组件自身的设置尺寸
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

public class FormLayoutDemo9 extends JPanel {
	private static final long serialVersionUID = 9L;


	public FormLayoutDemo9() {
      super(new BorderLayout());
        FormDebugPanel panel = new FormDebugPanel();

        FormLayout formLayout =
                new FormLayout("p, p, p, p", "p, p");
        panel.setLayout(formLayout);
        CellConstraints c = new CellConstraints();
        panel.add(createLabel("C1:", 30, 30), c.xy(1, 1));//行高可以独立控制，列宽的受同列其他组件的影响
        panel.add(createLabel("C2:", 30, 40), c.xy(2, 1));
        panel.add(createLabel("C3:", 30, 50), c.xy(3, 1));
        panel.add(createLabel("C4:", 30, 60), c.xy(4, 1));
        panel.add(createLabel("C5:", 30, 30), c.xy(1, 2));
        panel.add(createLabel("C6:", 40, 30), c.xy(2, 2));
        panel.add(createLabel("C7:", 50, 30), c.xy(3, 2));
        panel.add(createLabel("C8:", 60, 30), c.xy(4, 2));

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
      JFrame f = new JFrame("FormLayout: No Grouping Example 9");
      f.setDefaultCloseOperation(2);
      f.add(new FormLayoutDemo9());
      f.pack();
      f.setVisible(true);
    }
}