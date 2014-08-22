package videoplayer.layout;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Insets;

public class NonRandomStratagy implements ButtonLayoutStratagy {

	@Override
	public void layoutContainer(Container parent, ButtonLayout buttonLayout) {
		synchronized (parent.getTreeLock()) {

			Insets insets = parent.getInsets();
			Component[] components = parent.getComponents();
			int rows = buttonLayout.getRows();
			int cols = buttonLayout.getColumns();

			// No point computing if components equal null.
			if (components.length == 0) {
				return;
			}

			if (rows > 0) {
				cols = (components.length + rows - 1) / rows;
			} else {
				rows = (components.length + cols - 1) / cols;
			}

			int hgap = buttonLayout.getHgap();
			int vgap = buttonLayout.getVgap();
			
			int prefWidth = 0;
			int prefHight = 0;
			
			for (int i = 0; i < components.length; i++){
				Dimension d = components[i].getPreferredSize();
				if (d.width > prefWidth){
					prefWidth = d.width;
				}
				if (d.height > prefHight){
					prefHight = d.height;
				}
			}

			// scaling factors
			Dimension pd = buttonLayout.preferredLayoutSize(parent);
			double sw = (1.0 * parent.getWidth()) / pd.width;
			double sh = (1.0 * parent.getHeight()) / pd.height;

			// Scale
			// scale
			int[] w = new int[cols];
			int[] h = new int[rows];
			for (int i = 0; i < components.length; i++) {
				int r = i / cols;
				int c = i % cols;
				Component comp = components[i];
				Dimension d = comp.getPreferredSize();
				d.width = (int) (sw * prefWidth);
				d.height = (int) (sh * prefHight);
				if (w[c] < d.width) {
					w[c] = d.width;
				}
				if (h[r] < d.height) {
					h[r] = d.height;
				}
			}
			for (int c = 0, x = insets.left; c < cols; c++) {
				for (int r = 0, y = insets.top; r < rows; r++) {
					int i = r * cols + c;
					if (i < components.length) {
						components[i].setBounds(x, y, w[c], h[r]);
					}
					y += h[r] + vgap;
				}
				x += w[c] + hgap;
			}
		}
	}

}
