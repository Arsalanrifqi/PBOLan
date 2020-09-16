
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class Ball extends JPanel implements Runnable, MouseListener {
	int x = 200, y = 250;
	int width = 50, height = 50;
	int dx = 1, dy = 1;
	
	java.util.Timer move;
	static JFrame frame;
	
	Ball() {
		frame = new JFrame("Bounce Ball");
		frame.setSize(400, 400);
		frame.setVisible(true);
		
		setForeground(Color.blue);
		
		move = new java.util.Timer();
		
		move.scheduleAtFixedRate(new TimerTask() {
			
			@Override
			public void run() {
				if(x < 0) dx = 1;
				if(x >= getWidth()-45) dx = -1;
				if(y < 0) dy = 1;
				if(y >= getHeight()-45) dy = -1;
				
				x += dx;
				y += dy;
				
				repaint();
			}
		}, 0, 4);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2d.fillOval(x, y, width, height);
	}
	
	public static void main(String[] args) {
		Ball ball = new Ball();
		frame.add(ball);
	}

	@Override
	public void run() {
		((Runnable) frame).run();
		
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		
	}

}