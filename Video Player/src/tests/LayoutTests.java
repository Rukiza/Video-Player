package tests;

import java.awt.Button;

import javax.swing.JFrame;
import javax.swing.JPanel;

import videoplayer.layout.ButtonLayout;
import videoplayer.layout.NonRandomStratagy;
import videoplayer.layout.RandomStratagy;

public class LayoutTests {
	public static void main(String[] args){
		JFrame frame = new JFrame();
		
		JPanel panel = new JPanel();
		panel.setLayout(new ButtonLayout(new RandomStratagy()));
		panel.add(new Button("Hello"));
		panel.add(new Button("Jim"));
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
		
	}
}
