package helloworld.solution.mmildner;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

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
	
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					new HelloWorld("Hello World!");
				}
				catch (ClassNotFoundException e)
				{
					e.printStackTrace();
				}
				catch (InstantiationException e)
				{
					e.printStackTrace();
				}
				catch (IllegalAccessException e)
				{
					e.printStackTrace();
				}
				catch (UnsupportedLookAndFeelException e)
				{
					e.printStackTrace();
				}
			}
		});
	}
}