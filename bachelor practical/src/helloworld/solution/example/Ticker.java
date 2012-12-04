package helloworld.solution.example;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

public class Ticker implements Runnable, ActionListener {

	private Timer timer;
	private HelloWorld frame;
	private int stringLength, index;
	private char[] text = {'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd', '!'};
	
	public Ticker(HelloWorld frame, int stringLength) {
		timer = new Timer(200, this);
		this.frame = frame;
		this.stringLength = stringLength;
	}
	
	public void run() {
		timer.start();
	}

	public void actionPerformed(ActionEvent e) {
		String s = "";
		
		for (int i = 0; i < stringLength - index; i++) {
			s += " ";
		}
		
		int i = index - stringLength;
		if(i < 0){
			i = 0;
		}
		
		for (; i < index; i++) {
			if(i < text.length) {
				s += text[i];
			}
			else {
				s += " ";
			}
		}
		
		frame.setOutput(s);
		
		index++;
		if(index > stringLength + text.length){
			index = 0;
		}
	}
}