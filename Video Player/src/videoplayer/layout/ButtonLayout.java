package videoplayer.layout;


import java.awt.Container;
import java.awt.GridLayout;


public class ButtonLayout extends GridLayout{
	
	//TODO generate serial id when class is done.

	private ButtonLayoutStratagy layoutStratagy;
	
	
	//======================Constructors========================//
	public ButtonLayout(ButtonLayoutStratagy layoutStratagy){
		super();
		this.layoutStratagy = layoutStratagy;
	}
	
	public ButtonLayout(int rows, int cols, ButtonLayoutStratagy layoutStratagy){
		super(rows, cols);
		this.layoutStratagy = layoutStratagy;
	}
	
	public ButtonLayout(int rows, int cols, int hgap, int vgap, ButtonLayoutStratagy layoutStratagy){
		super(rows, cols, hgap, vgap);
		this.layoutStratagy = layoutStratagy;
	}
	//=======================Constructors end===================//
	
	
	@Override
	public void layoutContainer(Container parent){
		
	}
	
}
