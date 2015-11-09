package gui.view;

import javax.swing.JFrame;
import gui.controller.GUIController;

/**
 * 
 * @author Zach moyes
 * 0.2 Nov 9, 2015 Updated setupFrame to load contentPane with a GUIPanel.
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
		this.setContentPane(basePanel); //Must be first line of setupFrame! - Installs the panel in the frame.
		this.setSize(400,400);		//Find a good size for the app.	
		this.setTitle("YEEEEEEE!!!");
		this.setResizable(false);	//Advisable not required.
		this.setVisible(true);		//Must be last line of setupFrame!
	}
	
	public GUIController getBaseController()
	{
		return baseController;
	}

}
