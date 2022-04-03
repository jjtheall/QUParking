import java.util.ArrayList;

public class QUParking {

	public static void main(String[] args) {

		ParkingLot test = new ParkingLot();
		test.setTakenForTime(ParkingLot.TIME_NOON);

		test.setTakenAtIndex(80);
		ArrayList<Spot> available = test.avaliableSpots();

		for (int i = 0; i < available.size(); i++) {
			System.out.println(available.get(i));
		}
	}
}
