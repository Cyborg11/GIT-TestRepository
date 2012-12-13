package primes.solution.mmildner;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ResultFrame extends JFrame
{
	private static final long serialVersionUID = -5382695902508741016L;

	private DefaultTableModel tableModel;
	
	public ResultFrame(String title)
	{
		setTitle(title);
		
		tableModel = new DefaultTableModel();
		tableModel.addColumn("Primzahl");
		JTable table = new JTable(tableModel);
		JScrollPane spTable = new JScrollPane(table);
		
		getContentPane().add(spTable);
		
		pack();
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public void fillTable(ArrayList<Integer> primes)
	{
		for (int i = 0; i < primes.size(); i++)
		{
			tableModel.addRow(new String[]{""+primes.get(i)});
		}
	}
}
