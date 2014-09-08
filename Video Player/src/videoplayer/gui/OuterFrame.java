package videoplayer.gui;

import java.awt.BorderLayout;

import javax.swing.*;

public class OuterFrame extends JFrame{
	
	public OuterFrame(){
		MenuBar menu = new MenuBar();
		this.add(menu, BorderLayout.NORTH);
	}
	
}
