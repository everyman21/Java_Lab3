package network;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *	Class to calculate the maximum data rate of a channel. Prompts user for two 
 *  attributes, bandwidth and signal to noise ratio, that are input via a JOptionPane.
 *	It is then able to calculate and display the output via JOptionPane.message.
 * @version		1.1.0
 * @author		Andy Groenenberg
 */


public class ShannonsTheorem {
	
	/* CONSTRUCTORS -------------------------------------------------- */

	public ShannonsTheorem() {
		
	}

	/* ACCESSORS ----------------------------------------------------- */
	
//	public double getBandwidth() {
//		/* return the attribute bandwidth */
//		return model.getBandwidth();
//	}
	
	/**
	 * Public get method which returns the signal to noise 
	 * @return the attribute signalToNoise
	 */
//	public double getSignalToNoise() {
//		/* return attribute signalToNoise */
//		return model.getSignalToNoise();
//	}

	/* MODIFIERS ----------------------------------------------------- */
	/**
	 * Public method to set the attribute bandwidth with the variable passed in
	 * @param h
	 */
	
	public void setBandwidth(double bw) {
		/* assign the variable passed to the attribute bandwidth*/
		model.setBandwidth(bw);
		}
	/**
	 * Public modifier method which sets the attribute signalToNoise to the variable passed in
	 * @param snr
	 */
	public void setSignalToNoise(double snr) {
		/* assign the variable passed to the attribute signalToNoise */
		model.setSignalToNoise(snr);
	
	}

	public void addObserver(Observer o)
	{
		// do stuff
	}
	
	private void initGUI()
	{
		
	}
//	
//	/**
//	 * Public method used to overload the private method getMaximumDataRate(double, double)
//	 * Passes the attributes signalToNoise and bandwidth
//	 * @return the calculated maximum data rate
//	 */
//	public double getMaximumDataRate() {
//		/* call the private overloaded method getMaximumDataRate and pass both attributes */
//		return model.getMaximumDataRate();
//	}


	/* NORMAL BEHAVIOR ------------------------------------------------- */
	
	

	/* HELPER METHODS -------------------------------------------------- */

	
	/* ENTRY POINT for STAND-ALONE OPERATION --------------------------- */

	/**
	 * Entry point "main()" as required by the JVM. Invoked first and
	 *	either instantiates a ServerWrapper object and invokes startMain directly, or
	 * uses the WrapperManager to start the ServerWrapper object.
	 * @param  args   Standard command line parameters (arguments) as a
	 *	string array.
	 */
	
	public static void main(String[] args) {
		
		/* Instantiate a new instance of class ShannonsTheorem */
		ShannonsTheorem shannonsTheorem = new ShannonsTheorem();
		int exit=0;
		
		do{
		/* Read in bandwidth from user - call set method to populate attribute bandwidth */
		
		try{
			
		shannonsTheorem.setBandwidth(Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the channels bandwidth: ")));
		/* Read in signal to noise ration from user - call set method to populate attribute signalToNoise */
		shannonsTheorem.setSignalToNoise(Double.parseDouble(JOptionPane.showInputDialog(null, "Enter signal to noise ratio: ")));
		/* Call upon toString to display the calculated Maximum Data Rate for the channel: displayed meaningfully */
		JOptionPane.showMessageDialog(null,shannonsTheorem.model.toString());
		exit = JOptionPane.showConfirmDialog(
			    null,
			    "Would you like to continue?",
			    "Continue?",
			    JOptionPane.YES_NO_OPTION);
		
		}catch(NumberFormatException nfe){JOptionPane.showMessageDialog(null,"Error: Invalid data entered, please try again.","ERROR",JOptionPane.ERROR_MESSAGE);}  // pop dialogue not console
		catch(NullPointerException npe)
		{	break;}; // exit without confirmation
		
		
		}while(exit==0);
	}
	
	/* Attributes ---------------------------------------------*/
	
	private JFrame appFrame;
	private static int height =200;
	private static int width = 450;
	private DefaultShannonsModel model = new DefaultShannonsModel();
	
	
	
	
}  /* END OF CLASS: ShannonsTheorem.java			*/



