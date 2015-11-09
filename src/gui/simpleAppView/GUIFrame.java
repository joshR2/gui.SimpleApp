package gui.simpleAppView;

import javax.swing.JFrame;
import simpleAppController;

/**
 * 
 * @author jrob2049
 *@version o.x Noc 9,2015
 */
public class GUIFrame extends JFrame
{
	private simpleAppControler baseController;
	
	public GUIFrame(simpleAppController baseController)
	{
		this.baseController = baseController;
	}
	
	private void setupFrame()
	{
		this.setSize(400,400);
		this.setVisible(true);
	}
}
