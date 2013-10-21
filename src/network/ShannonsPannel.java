package network;

import java.awt.Dimension;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class ShannonsPannel implements Observer {

	private JTextField bandwidthText;
	private JLabel mdrLBL;
	private JTextField snrText;
	private static int width = 350;
	private ShannonsController controller;
	
	
	public ShannonsPannel (ShannonsController ctl)
	{
		
	}
	
	
	public Dimension getMinimumSize()
	{
		return ;
	}
	
	public Dimension getPreferedSize()
	{
		return ;
	}
	
	public Dimension getMaximumSize()
	{
		return ;
	}
	
	
	public void update(Observable arg0, Object arg) {
		// TODO Auto-generated method stub
		
	}	
	private void intGUI()
	{
		// stuff
	}

	}
		

	
	
}
