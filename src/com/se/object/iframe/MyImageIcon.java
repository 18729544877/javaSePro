package com.se.object.iframe;
import java.awt.*;
import java.net.URL;
import javax.swing.*;

public class MyImageIcon extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MyImageIcon() {
		Container c = getContentPane();
		JLabel jl = new JLabel("这是一个JFrame窗体", JLabel.CENTER);
		URL url = MyImageIcon.class.getResource("1.jpg");
		Icon icon = new ImageIcon(url);
		jl.setIcon(icon);
		jl.setHorizontalAlignment(SwingConstants.CENTER);
		jl.setOpaque(true);
		c.add(jl);
		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}

	public static void main(String[] agre) {
		new MyImageIcon();
	}
}