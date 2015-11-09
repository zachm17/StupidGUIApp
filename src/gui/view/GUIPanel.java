package gui.view;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import gui.controller.GUIController;

/**
 * 
 * @author Zach Moyes
 *
 */

public class GUIPanel extends JPanel
{
	private GUIController baseController;
	private JButton firstButton;
	private JTextField firstTextField;
	
	public GUIPanel(GUIController baseController)
	{
		this.baseController = baseController;
		
		firstButton = new JButton("Please do not click the button Greyson");
		firstTextField = new JTextField("words can be typed here bruv");
		
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
