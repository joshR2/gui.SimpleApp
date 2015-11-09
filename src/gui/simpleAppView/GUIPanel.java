package gui.simpleAppView;

import javax.swing.JPanel;
import gui.simpleAppController.simpleAppController;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SpringLayout; //For Layout

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
	private SpringLayout baseLayout;
	
	public GUIPanel(simpleAppController baseController)
	{
		this.baseController = baseController;
		
		firstButton = new JButton("Please do not click on the button");
		firstTextField = new JTextField("words can be typed here ;)");
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	/**
	 * Helper method to load all the GUI components into the panel
	 */
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(firstButton);
		this.add(firstTextField);
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}
}
