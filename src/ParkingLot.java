public class ParkingLot {

	private Spot[] spots;

	//static instance vars to standardize how we pass time param
	//to setTakenForTime method
	public static final int TIME_MORNING = 0;
	public static final int TIME_NOON = 1;
	public static final int TIME_AFTERNOON = 2;

	public ParkingLot() {
		spots = new Spot[100];

		for(int i = 0; i < spots.length; i++ )
		{
			Spot currentSpot = new Spot(i);
			spots[i] = currentSpot;
		}
	}
	
	public Spot[] getSpots()
	{
		return spots;
	}
	
	public void setTaken(int index) {
		spots[index].setTaken(true);
	}

	public void setTakenForTime(int time){
		
	}

	//sets all spots in spots array to open
	public void clearLot(){
		for(int i=0; i<spots.length; i++){
			spots[i].setTaken(false);
		}
	}
}
