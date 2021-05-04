package syne.thread.classess.synchronization;

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.util.*;
import javax.swing.*;

/**
 * Shows an animated bouncing Ball1.
 */
public class BounceThread {
	public static void main(String[] args) {
		JFrame frame = new BounceFrame1();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}

/**
 * A runnable that animates a bouncing Ball1.
 */
class Ball1Runnable implements Runnable {
	/**
	 * Constructs the runnable.
	 * 
	 * @aBall1 the Ball1 to bounce
	 * @aPanel the component in which the Ball1 bounces
	 */
	public Ball1Runnable(Ball1 aBall1, Component aComponent) {
		Ball1 = aBall1;
		component = aComponent;
	}

	public void run() {

		for (int i = 1; i <= STEPS; i++) {
			Ball1.move(component.getBounds());
			component.repaint();

			for (int j = 0; j < 99999; j++) {
				double k = j * Math.cos(j) + j * Math.sin(j);
			}

		}

	}

	private Ball1 Ball1;
	private Component component;
	public static final int STEPS = 1000;
	public static final int DELAY = 0;
}

/**
 * A Ball1 that moves and bounces off the edges of a rectangle
 */
class Ball1 {
	Color colour;

	public Ball1(Color col) {
		this.colour = col;
	}

	/**
	 * Moves the Ball1 to the next position, reversing direction if it hits one of
	 * the edges
	 */
	public void move(Rectangle2D bounds) {
		x += dx;
		y += dy;
		if (x < bounds.getMinX()) {
			x = bounds.getMinX();
			dx = -dx;
		}
		if (x + XSIZE >= bounds.getMaxX()) {
			x = bounds.getMaxX() - XSIZE;
			dx = -dx;
		}
		if (y < bounds.getMinY()) {
			y = bounds.getMinY();
			dy = -dy;
		}
		if (y + YSIZE >= bounds.getMaxY()) {
			y = bounds.getMaxY() - YSIZE;
			dy = -dy;
		}
	}

	/**
	 * Gets the shape of the Ball1 at its current position.
	 */
	public Ellipse2D getShape() {
		return new Ellipse2D.Double(x, y, XSIZE, YSIZE);
	}

	private static final int XSIZE = 15;
	private static final int YSIZE = 15;
	private double x = 0;
	private double y = 0;
	private double dx = 1;
	private double dy = 1;
}

/**
 * The panel that draws the Ball1s.
 */
class Ball1Panel extends JPanel {
	/**
	 * Add a Ball1 to the panel.
	 * 
	 * @param b the Ball1 to add
	 */
	public void add(Ball1 b) {
		Ball1s.add(b);
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		for (Ball1 b : Ball1s) {
			g2.setColor(b.colour);
			g2.fill(b.getShape());
		}
	}

	private ArrayList<Ball1> Ball1s = new ArrayList<Ball1>();
}

/**
 * The frame with panel and buttons.
 */
class BounceFrame1 extends JFrame {
	/**
	 * Constructs the frame with the panel for showing the bouncing Ball1 and Start
	 * and Close buttons
	 */
	public BounceFrame1() {
		setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
		setTitle("BounceThread");

		panel = new Ball1Panel();
		add(panel, BorderLayout.CENTER);
		JPanel buttonPanel = new JPanel();
		addButton(buttonPanel, "Start", new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				addBall1();
			}
		});
		addButton(buttonPanel, "Fast", new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				addFastBall1();
			}
		});

		addButton(buttonPanel, "Slow", new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				addSlowBall1();
			}
		});
		addButton(buttonPanel, "Close", new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				System.exit(0);
			}
		});
		add(buttonPanel, BorderLayout.SOUTH);
	}

	/**
	 * Adds a button to a container.
	 * 
	 * @param c        the container
	 * @param title    the button title
	 * @param listener the action listener for the button
	 */
	public void addButton(Container c, String title, ActionListener listener) {
		JButton button = new JButton(title);
		c.add(button);
		button.addActionListener(listener);
	}

	/**
	 * Adds a bouncing Ball1 to the canvas and starts a thread to make it bounce
	 */
	public void addBall1() {
		Ball1 b = new Ball1(Color.black);
		panel.add(b);
		Runnable r = new Ball1Runnable(b, panel);
		Thread t = new Thread(r);
		t.start();
	}
	
	public void addFastBall1() {
		Ball1 b = new Ball1(Color.red);
		panel.add(b);
		Runnable r = new Ball1Runnable(b, panel);
		Thread t = new Thread(r);
		t.setPriority(Thread.MAX_PRIORITY);
		t.start();
	}
	public void addSlowBall1() {
		Ball1 b = new Ball1(Color.yellow);
		panel.add(b);
		Runnable r = new Ball1Runnable(b, panel);
		Thread t = new Thread(r);
		t.setPriority(Thread.MIN_PRIORITY);
		t.start();
	}

	private Ball1Panel panel;
	public static final int DEFAULT_WIDTH = 450;
	public static final int DEFAULT_HEIGHT = 350;
	public static final int STEPS = 1000;
	public static final int DELAY = 3;
}
