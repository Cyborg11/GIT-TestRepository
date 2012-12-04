package helloworld.solution.example;

import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class HelloWorld extends JFrame {

	private JLabel text = new JLabel();
	
	public HelloWorld() {
		setTitle("Hello World Ticker");
		setBounds(50, 50, 450, 100);
		setLayout(new FlowLayout());
		
		text.setFont(new Font("Arial", Font.BOLD, 40));
		add(text);
		
		setVisible(true);
	}
	
	public void setOutput(String s){
		text.setText(s);
	}
	
	public static void main(String[] args) {
		new Thread(new Ticker(new HelloWorld(), 30)).start();
	}
}