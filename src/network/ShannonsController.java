package network;

import java.util.Observer;

public interface ShannonsController {

	public void addObserver(Observer o);

	public  void setBandwidth(double bandwidthinHertz);
	
	public void setSignalToNoise(double snrlnDB);
		
		
}
