

public class ParkingLot {

	private Spot[] spots;
	
	
	
	
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
	
	public void setTaken(int index)
	{
		
		spots[index].setTaken(true);
	}
}
