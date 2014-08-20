package videoplayer.layout;


import java.awt.Container;
import java.awt.GridLayout;


public class ButtonLayout extends GridLayout{
	
	//TODO generate serial id when class is done.

	private ButtonLayoutStratagy layoutStratagy = new NonRandomStratagy();
	
	
	//======================Constructors========================//
	/**
	 * Constructs the layout with preferred strategy.
	 * if no strategy is suppled initialized as NonRandom
	 * @param layoutStratagy - Stratagy to be used or null.
	 */
	public ButtonLayout(ButtonLayoutStratagy layoutStratagy){
		super();
		this.layoutStratagy = layoutStratagy;
	}
	
	/**
	 * Constructs the layout with preferred strategy.
	 * if no strategy is suppled initialized as NonRandom
	 * @param rows - number of rows.
	 * @param cols - number of columns
	 * @param layoutStratagy - the stratagy to be used or null.
	 */
	public ButtonLayout(int rows, int cols, ButtonLayoutStratagy layoutStratagy){
		super(rows, cols);
		this.layoutStratagy = layoutStratagy;
	}
	
	/**
	 * Constructs the layout with preferred strategy.
	 * if no strategy is suppled initialized as NonRandom
	 * @param rows - number of rows.
	 * @param cols - number of columns
	 * @param hgap - horozontal gap between buttons.
	 * @param vgap - vertical gap between buttons.
	 * @param layoutStratagy - the stratagy to be used or null.
	 */
	public ButtonLayout(int rows, int cols, int hgap, int vgap, ButtonLayoutStratagy layoutStratagy){
		super(rows, cols, hgap, vgap);
		this.layoutStratagy = layoutStratagy;
	}
	//=======================Constructors end===================//
	
	
	@Override
	public void layoutContainer(Container parent){
		layoutStratagy.layoutContainer(parent, this);
	}
	
}
