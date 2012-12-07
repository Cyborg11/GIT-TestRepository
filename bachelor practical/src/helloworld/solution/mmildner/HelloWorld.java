package helloworld.solution.mmildner;

import java.awt.Font;
import java.awt.Point;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class HelloWorld extends JFrame
{
	private static final long serialVersionUID = 3021608142052453646L;

	public HelloWorld(String title)
	{
		super(title);
		
		JLabel lHelloWorld = new JLabel("Hello World!");
		lHelloWorld.setFont(new Font(lHelloWorld.getFont().getFontName(), Font.BOLD, 30));
		getContentPane().add(lHelloWorld);
		
		pack();
		setSize(400, 300);
		setResizable(false);
		setLocationRelativeTo(null);	// Positionierung des Frames in der Mitte des Bildschirms
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		AnimateThread thread = new AnimateThread(this, lHelloWorld);
		thread.start();
		
		setVisible(true);
	}
		
	private class AnimateThread extends Thread
	{
		private JLabel label;
		private JFrame frame;
		
		public AnimateThread(JFrame frame, JLabel label)
		{
			this.frame = frame;
			this.label = label;
		}
		
		public void run()
		{
//			int height = frame.getHeight();
			int width = frame.getWidth();
			
			while (true)
			{
				int x = label.getX();
				int y = label.getY();
				int size = label.getSize().width;
				
				if (x < width)
				{
					label.setLocation(new Point(x+1, y));
				}
				else
				{
					label.setLocation(-size/2, y);
				}
				try
				{
					Thread.sleep(10);
				}
				catch (InterruptedException e)
				{
					e.printStackTrace();
				}
			}
		}
	}
	
	public static void main(String[] args)
	{
		new HelloWorld("Hello World!");
	}
}