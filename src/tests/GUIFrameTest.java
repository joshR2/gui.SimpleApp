/**
 * 
 */
package tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import gui.simpleAppController.simpleAppController;
import gui.simpleAppView.*;

/**
 * @author CodyH
 * @version 0.x Nov 12, 2015
 *
 */
public class GUIFrameTest
{

	private GUIFrame GUIFrame;
	private GUIPanel GUIPanel;
	private simpleAppController testController;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception
	{
		testController = new simpleAppController();
		GUIFrame = new GUIFrame(testController);
		GUIPanel = new GUIPanel(testController);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception
	{
		GUIFrame = null;
		GUIPanel = null;
		testController = null;
	}

	/**
	 * Test method for {@link gui.view.GUIFrame#GUIFrame(gui.controller.GUIAppController)}.
	 */
	@Test
	public void testGUIFrame()
	{
		assertTrue(GUIFrame.getContentPane() instanceof GUIPanel);
		assertTrue(GUIFrame.isVisible());
		assertTrue(GUIFrame.getWidth() > 100);
		assertTrue(GUIFrame.getHeight() > 100);
	}
	

	/**
	 * Test method for {@link gui.view.GUIFrame#getBaseController()}.
	 */
	@Test
	public void testGetBaseController()
	{
		assertNotNull(GUIFrame.getBaseController());
		assertTrue(GUIFrame.getBaseController() instanceof simpleAppController);
	}

}
