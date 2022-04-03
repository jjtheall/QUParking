public class QUParking {

    public static void main(String[] args)
    {

    	ParkingLot test = new ParkingLot();
    	test.setTakenForTime(ParkingLot.TIME_AFTERNOON);
    	Spot[] spots = test.getSpots();
    	
    	for(int i = 0; i < spots.length ; i++)
    	{
    		System.out.println(spots[i]);
    	}
    }
}
