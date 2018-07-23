package com.se;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class SnakeGame extends JFrame implements KeyListener {
	private int stat = 1, 
			
			direction = 0, 
			bodylen = 6, 
			headx = 7, 
			heady = 8, 
			tailx = 1, 
			taily = 8, 
			tail, 
			foodx, 
			foody,
			food;
	public final int EAST = 1, WEST = 2, SOUTH = 3, NORTH = 4;
	int[][] fillblock = new int[20][20];

	public static void main(String[] args){
		new SnakeGame();
	}
	public SnakeGame() {
		super("Ã∞≥‘…ﬂ");
		setSize(510, 510);
		setVisible(true);
		addKeyListener(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		for (int i = 1; i <= 7; i++)
			fillblock[i][8] = EAST;
		direction = EAST;
		FoodLocate();
		while (stat == 1) {
			fillblock[headx][heady] = direction;
			switch (direction) {
			case 1:
				headx++;
				break;
			case 2:
				headx--;
				break;
			case 3:
				heady++;
				break;
			case 4:
				heady--;
				break;
			}

			if (heady > 19 || headx > 19 || tailx > 19 || taily > 19 || heady < 0 || headx < 0 || tailx < 0 || taily < 0
					|| fillblock[headx][heady] != 0) {
				stat = 0;
				break;
			}
			try {
				Thread.sleep(150);
			} catch (InterruptedException e) {

			}
			fillblock[headx][headx] = direction;
			if (headx == foodx && heady == foody) {
				FoodLocate();
				food = 2;
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {

				}
			}
		}
		if (food != 0)
			food--;
		else {
			tail = fillblock[tailx][taily];
			fillblock[tailx][taily] = 0;
			switch (tail) {
			case 1:
				tailx++;
				break;
			case 2:
				tailx--;
				break;
			case 3:
				taily++;
				break;
			case 4:
				taily--;
				break;
			}
		}
		repaint();
		if (stat == 0)
			JOptionPane.showMessageDialog(null, " GAME OVER", " Game Over", JOptionPane.INFORMATION_MESSAGE);
	}

	private void FoodLocate() {
		// TODO Auto-generated method stub

	}

	public void keyPressed(KeyEvent e) {
		int keyCode = e.getKeyCode();
		if (stat == 1)
			switch (keyCode) {
			case KeyEvent.VK_UP:
				if (direction != SOUTH)
					direction = NORTH;
				break;
			case KeyEvent.VK_DOWN:
				if (direction != NORTH)
					direction = SOUTH;
				break;
			}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}
}