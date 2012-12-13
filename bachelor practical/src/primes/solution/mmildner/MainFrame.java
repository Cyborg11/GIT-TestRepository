package primes.solution.mmildner;

import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class MainFrame extends JFrame
{
	private static final long serialVersionUID = -7895749739931284890L;
	
	private JTextField tfPrimzahl, tfVon, tfBis;
	private JLabel lPrimzahl, lVon, lBis, lErgebnis, lResult;
	private JButton bCalculate;
		
	public MainFrame(String title)
	{
		super(title);
		
		GridBagLayout gbl = new GridBagLayout();
		LayoutExtension layExt = new LayoutExtension(); // Hilfsklasse für das GridBagLayout
		JPanel mainPanel = new JPanel(gbl);
		setContentPane(mainPanel);
		
		lPrimzahl = new JLabel("Zahl:", JLabel.LEFT);
		tfPrimzahl = new JTextField(5);
		lVon = new JLabel("von:", JLabel.LEFT);
		lBis = new JLabel("bis:", JLabel.LEFT);
		tfVon = new JTextField(5);
		tfBis = new JTextField(5);
		bCalculate = new JButton("Berechnen");
		bCalculate.addActionListener(new CalculateButton());
		lErgebnis = new JLabel("Ergebnis:");
		lResult = new JLabel("");
		
		layExt.addComponent(mainPanel, gbl, lPrimzahl,		0, 0, 1, 1, 0, 0, 5, 5, 5, 5);
		layExt.addComponent(mainPanel, gbl, tfPrimzahl,		1, 0, 1, 1, 0, 0, 5, 5, 5, 5);
		layExt.addComponent(mainPanel, gbl, lVon,			0, 1, 1, 1, 0, 0, 5, 5, 5, 5);
		layExt.addComponent(mainPanel, gbl, tfVon,			1, 1, 1, 1, 0, 0, 5, 5, 5, 5);
		layExt.addComponent(mainPanel, gbl, lBis,			0, 2, 1, 1, 0, 0, 5, 5, 5, 5);
		layExt.addComponent(mainPanel, gbl, tfBis,			1, 2, 1, 1, 0, 0, 5, 5, 5, 5);
		layExt.addComponent(mainPanel, gbl, bCalculate,		0, 3, 1, 2, 0, 0, GridBagConstraints.BOTH, 5, 5, 5, 5);
		layExt.addComponent(mainPanel, gbl, lErgebnis,		0, 4, 1, 1, 0, 0, 5, 5, 5, 5);
		layExt.addComponent(mainPanel, gbl, lResult,		1, 4, 1, 1, 0, 0, 5, 5, 5, 5);
		
		pack();
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	private class CalculateButton implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent event)
		{
			if (tfVon.getText().length() == 0 || tfBis.getText().length() == 0)
			{
				lResult.setText("" + Primes.isPrime(Integer.parseInt(tfPrimzahl.getText())));
				pack();
			}		
			else
			{
				ResultFrame frame = new ResultFrame("Ergebnis");
				ArrayList<Integer> list = Primes.getPrimes(Integer.parseInt(tfVon.getText()), Integer.parseInt(tfBis.getText()));
				frame.fillTable(list);
			}
		}
		
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
					new MainFrame("Primzahlen");
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
