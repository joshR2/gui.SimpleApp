package gui.simpleAppView;

import javax.swing.JPanel;
import gui.simpleAppController.simpleAppController;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SpringLayout; //For Layout
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

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
		
		baseLayout = new SpringLayout();
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
		this.setBackground(Color.BLUE);
	}
	
	/**
	 * helper method for arranging the panel.
	 * Dumping ground for generated code
	 */
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.SOUTH, firstButton, -98, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, firstButton, -96, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.WEST, firstTextField, 128, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, firstTextField, -50, SpringLayout.NORTH, firstButton);
	}
	
	private void setupListeners()
	{
		firstButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				firstTextField.setText("Wow,this is the most amazing click event ever! WOW!");
			}
		});
	}
}
