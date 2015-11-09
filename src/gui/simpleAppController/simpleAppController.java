package gui.simpleAppController;

import gui.view.GUIFrame;

/**
 * AppController for the Simple Gui Application
 * @author jrob2049
 *0.x Nov 9,2015
 */
public class simpleAppController
{
	/**
	 * Reference to the GUIFrame object for internal use.
	 */
	private GUIFrame baseFrame;
	/**
	 * Creates a GUIAppController and intializes the GUIFrame.
	 */
	public simpleAppController()
	{
		baseFrame = new GUIFrame(this);
	}
	
	public void start()
	{}
		
	
	
}
