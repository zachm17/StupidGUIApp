package gui.view;
 
import javax.swing.*;  
import gui.controller.GUIController;
import java.awt.event.*;
import java.awt.Color;

/**
 * 
 * @author Zach Moyes
 *version 0.1 Nov 9, 2015
 */

public class GUIPanel extends JPanel
{
	private GUIController baseController;
	private JButton firstButton;
	private JTextField firstTextField;
	private SpringLayout baseLayout;
	
	public GUIPanel(GUIController baseController)
	{
		this.baseController = baseController;
		
		baseLayout = new SpringLayout();
		firstButton = new JButton("Please do not click the button Greyson");
		firstTextField = new JTextField("words can be typed here bruv");
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	/**
	 * Helper method to load all GUI Components into the panel
	 */
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(Color.MAGENTA);
		this.add(firstButton);
		this.add(firstTextField);
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.WEST, firstButton, 81, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, firstButton, -33, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, firstTextField, 39, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, firstTextField, -27, SpringLayout.EAST, this);
		
	}
	
	private void changeRandomColor()
	{
		int red, green, blue;
		
		red = (int) (Math.random() * 256);
		green = (int) (Math.random() * 256);
		blue = (int) (Math.random() * 256);
		
		this.setBackground(new Color(red, green, blue));
	}
	
	private void setupListeners()
	{
		firstButton.addActionListener(new ActionListener()
		
		{
			public void actionPerformed(ActionEvent click)
			{
				firstTextField.setText("Wow, this is the most amazing click event ever! WOW!");
			}
		});
		
		this.addMouseListener(new MouseListener()
		{
			public void mouseClicked(MouseEvent click)
			{
				
			}
			
			public void mouseReleased(MouseEvent released)
			{
				changeRandomColor();
			}
			
			public void mousePressed(MouseEvent pressed)
			{
				
			}
			
			public void mouseEntered(MouseEvent entered)
			{
				changeRandomColor();
			}
			
			public void mouseExited(MouseEvent exited)
			{
				changeRandomColor();
			}
		});
			
			this.addMouseMotionListener(new MouseMotionListener()
			{
				
					public void mouseMoved(MouseEvent moved)
					{
						if(moved.isAltDown())
						{
							changeRandomColor();
						}
						
						firstTextField.setText("Mouse X: " + moved.getX() + " Mouse Y: " + moved.getY() );
						
						if((Math.abs(moved.getX() - firstButton.getX()) < 650) && 
								(Math.abs(moved.getY() - firstButton.getY()) < 650))
							
						//if(moved.getY() >= (firstButton.getY() -5) && moved.getY() <= (firstButton.getHeight() +5) &&
							//	moved.getX() >= (firstButton.getX() - 5) && moved.getX() <= (firstButton.getWidth() +5))
							
						{
							firstButton.setLocation((int) (Math.random() * 800 ), (int) (Math.random() * 800 ));
						}
						
						
					}
					
					public void mouseDragged(MouseEvent dragged)
					{
						
					}
			
			
		});
	}
}

	
	

