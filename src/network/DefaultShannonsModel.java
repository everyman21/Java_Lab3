package network;

public class DefaultShannonsModel {
	
	/* Constructor --------------------------------------------------- */
	
	public DefaultShannonsModel()
	{
		bandwidth=0;
		signalToNoise=0;
	}
	
	
	/* ACCESSORS ----------------------------------------------------- */
		
	/**
	 *  get method returning the attribute bandwidth
	 * @return bandwidth
	 */
	public double getBandwidth() {
		/* return the attribute bandwidth */
		return bandwidth;
	}
	
	/**
	 * Public get method which returns the signal to noise 
	 * @return the attribute signalToNoise
	 */
	public double getSignalToNoise() {
		/* return attribute signalToNoise */
		return signalToNoise;
	}
	
	/**
	 * Public method used to overload the private method getMaximumDataRate(double, double)
	 * Passes the attributes signalToNoise and bandwidth
	 * @return calculated maximum data rate
	 */
	public double calculateMDR() {
		/* call the private overloaded method getMaximumDataRate and pass both attributes */
		return maximumDataRate(signalToNoise, bandwidth);
	}

	/**
	 * Private method which calculates maximum data rate for a channel based upon
	 * the two attribute parameters which are passed 
	 * @param signalToNoise
	 * @param hertz
	 * @return the calculated maximum data rate
	 */
	private static double maximumDataRate(double signalToNoise, double hertz) {
		/* calculate the maximum data rate of the channel giving the values passed */
		return (hertz * (Math.log(1 + Math.pow(10, signalToNoise / 10)) / Math.log(2)));

	}
	
	/* MODIFIERS ----------------------------------------------------- */
	/**
	 * Public method to set the attribute bandwidth with the variable passed in
	 * @param h
	 */
	
	public void setBandwidth(double h) {
		/* assign the variable passed to the attribute bandwidth*/
		bandwidth = h;
	}
	
	/**
	 * Public modifier method which sets the attribute signalToNoise to the variable passed in
	 * @param snr
	 */
	public void setSignalToNoise(double snr) {
		/* assign the variable passed to the attribute signalToNoise */
		signalToNoise = snr;
	}
	
	/* Normal Behaviour ------------------------------------------------ */
	public String toString() {
		return "A channel with a bandwidth of " + bandwidth
				+ " hz and a signal to noise ratio of " + signalToNoise
				+ " db results in a maximum data rate of "
				+ String.format("%.2f", calculateMDR());
	}
	
	
	/* ATTRIBUTES ------------------------------------------------------*/
	
	private double bandwidth;  // bandwidth to be entered by user
	private double signalToNoise; // signal to noise ratio to be entered by user
	
		
}
	

