package gui.simpleAppView;

import javax.swing.JPanel;
import gui.simpleAppController.simpleAppController;
import javax.swing.JButton;
import javax.swing.JTextField;

/**
 * 
 * @author jrob2049
 *@version o.x Nox 9,2015
 */
public class GUIPanel extends JPanel
{
	private simpleAppController baseController;
	private JButton firstButton;
	private JTextField firstTextField;
	
	public GUIPanel(simpleAppController baseController)
	{
		this.baseController = baseController;
		
		firstButton = new JButton("Please do not click on the button");
		firstTextField = new JTextField("words can be typed here ;)");
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}
}
