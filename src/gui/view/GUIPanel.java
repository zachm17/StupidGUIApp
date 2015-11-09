package gui.view;

import javax.swing.JPanel;
import gui.controller.GUIController;

/**
 * 
 * @author Zach Moyes
 *
 */

public class GUIPanel extends JPanel
{
	private GUIController baseController;
	
	public GUIPanel(GUIController baseController)
	{
		this.baseController = baseController;
	}

}
