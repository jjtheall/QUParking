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
		//first, clear the lot
		clearLot();
		//we'll use this variable in the switch statement to determine
		//how far to loop through spots array
		int upperBound = 0;
		//now switch on time param, looping through a
		//percentage of spots array setting each spot to taken
		switch(time){
			case TIME_MORNING:
				upperBound = (int) (.9 * spots.length);
				System.out.println(upperBound);
				break;
			case TIME_NOON:
				upperBound = (int) (.75 * spots.length);
				System.out.println(upperBound);
				break;
			case TIME_AFTERNOON:
				upperBound = (int) (.4 * spots.length);
				System.out.println(upperBound);
				break;
			default:
				System.out.println("not a valid time");
				break;

		}
	}

	//sets all spots in spots array to open
	public void clearLot(){
		for(int i=0; i<spots.length; i++){
			spots[i].setTaken(false);
		}
	}

	//prints all spots in spots array
	public void printSpots(){
		for(int i=0; i<spots.length; i++){
			System.out.println(spots[i]);
		}
	}

}
