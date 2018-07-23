package com.se;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Timer extends JFrame {
	private static final long serialVersionUID = 1L;
	private JTextField screen = new JTextField("0");
	private JButton reset = new JButton("����");
	private JButton start = new JButton("��ʼ");
	private JPanel p = new JPanel();
	private boolean isRunning;
	private int time;
	private int timeBetween;

	public Timer(int timeBetween) {
		super("������");
		this.timeBetween = timeBetween;
		screen.setVisible(true);
		try {
			init();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Timer() {
		super("������");
		this.timeBetween = 100;
		screen.setVisible(true);
		try {
			init();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void init() {
		p.setLayout(new GridLayout());
		p.add(start);
		p.add(reset);
		p.setVisible(true);
		start.addMouseListener(new MouseListener() {
			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseExited(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				if (start.getText().equals("��ʼ")) {
					start.setText("��ͣ");
					isRunning = true;
				} else if (start.getText().equals("��ͣ")) {
					start.setText("��ʼ");
					isRunning = false;
				}
				new Thread(new TimeZone()).start();
			}
		});
		reset.addMouseListener(new MouseListener() {
			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseExited(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				start.setText("��ʼ");
				screen.setText("0");
				isRunning = false;
				time = 0;
				new Thread(new TimeZone()).start();
			}
		});
		screen.setFont(new Font("����", Font.BOLD, 60));
		// �����ı���ˮƽ���뷽ʽ
		screen.setHorizontalAlignment(JTextField.CENTER);
		screen.setEditable(false);

		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		c.add(p, BorderLayout.SOUTH);
		c.add(screen, BorderLayout.CENTER);

		this.setSize(300, 300);
		// �û��������ڵĹرհ�ťʱ����ִ�еĲ���
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);// ���ɵĴ��岻�������ɸı��С
	}

	class TimeZone implements Runnable {
		@Override
		public void run() {
			while (isRunning) {
				time++;
				if (time >= Integer.MAX_VALUE) {
					screen.setText("Error");
					JOptionPane.showMessageDialog(null, "Error");
					isRunning = false;
				}
				int s = time;
				screen.setText(Integer.valueOf(s).toString());
				try {
					Thread.sleep(timeBetween);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

	public static void main(String[] args) {
		new Timer(1);// �趨1msһ��
	}
}