package helloworld.solution.mmildner;

import java.awt.Point;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class AnimateThread extends Thread
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