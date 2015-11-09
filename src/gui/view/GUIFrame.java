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
	
	public GUIFrame(GUIController baseController)
	{
		this.baseController = baseController;
		setupFrame();
		
	}
	private void setupFrame()
	{
		this.setSize(400,400);
		this.setResizable(false);
		this.setVisible(true);
	}

}
