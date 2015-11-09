package gui.view;

import javax.swing.JFrame;
import gui.controller.GUIController;

/**
 * 
 * @author Zach moyes
 *
 */

public class GUIFrame extends JFrame
{
	private GUIController baseController;
	private GUIPanel basePanel;
	
	public GUIFrame(GUIController baseController)
	{
		this.baseController = baseController;
		basePanel = new GUIPanel(baseController);
		setupFrame();
		
	}
	private void setupFrame()
	{
		this.setContentPane(basePanel); //Must be first line of setupFrame!
		this.setSize(400,400);		//Find a good size for the app.	
		this.setResizable(false);	//Advisable not required.
		this.setVisible(true);		//Must be last line of setupFrame!
	}

}
