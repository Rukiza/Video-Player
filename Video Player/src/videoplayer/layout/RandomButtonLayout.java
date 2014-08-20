package videoplayer.layout;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager;
import java.util.*;

public class RandomButtonLayout implements LayoutManager{
	
	
	@Override
	public void addLayoutComponent(String name, Component comp) {
		//Stub method
	}

	@Override
	public void layoutContainer(Container parent) {
		Component[] components = parent.getComponents();
		List<Component> componentsList = Arrays.asList(components);
		Collections.shuffle(componentsList);
		
	}

	@Override
	public Dimension minimumLayoutSize(Container parent) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Dimension preferredLayoutSize(Container parent) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeLayoutComponent(Component comp) {
		// TODO Auto-generated method stub
		
	}
}
