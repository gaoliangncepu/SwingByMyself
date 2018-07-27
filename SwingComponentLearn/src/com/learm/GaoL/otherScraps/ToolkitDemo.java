package com.learm.GaoL.otherScraps;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 * 
 * @author Administrator
 *
 */
public class ToolkitDemo {
	public static void main(String[] args) {
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		System.out.println(dimension);
	}
}
