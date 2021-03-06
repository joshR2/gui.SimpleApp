package gui.simpleAppView;

import javax.swing.JFrame;
import gui.simpleAppController.simpleAppController;

/**
 * 
 * @author jrob2049
 *@version o.x Nov 9,2015
 */
public class GUIFrame extends JFrame
{
	private simpleAppController baseController;
	private GUIPanel basePanel;
	
	public GUIFrame(simpleAppController baseController)
	{
		this.baseController = baseController;
		basePanel = new GUIPanel(baseController);
		setupFrame();
	}
	/**
	 * Required helper method to prepare the frame.
	 */
	private void setupFrame()
	{
		this.setContentPane(basePanel); //must be first line of the setupFrame!
		this.setSize(400,400); //Find a good Size for the app.
		this.setTitle("silly app!!");
		this.setVisible(true);	//Advisable not required.
		this.setResizable(false); //Must be the lt line of setupFrame!
	}
		public simpleAppController getBaseController()
	{
		return baseController;
	}
	
	
}
