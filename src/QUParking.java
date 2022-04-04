import java.util.ArrayList;
import java.util.Scanner;

public class QUParking {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Welcome to the QU Parking Simulator");
		System.out.println("======================================================================================");
		System.out.println("The simulator will ask for the total number of spots in your hypothetical lot, \n" +
				"the number of people waiting to park, and the time of day.");
		System.out.println("======================================================================================");
		System.out.println("The simulator will populate the lot as accurately as it can based on the time of day, \n" +
				"and then delegate as many open spots as it can find to the waiting users");
		System.out.println("======================================================================================");
		System.out.println("Press enter to continue...");
		sc.nextLine();

		System.out.println("Enter the total number of spots in the lot: ");
		int numSpots = sc.nextInt();
		System.out.println("Enter the total number of waiting people: ");
		int numWaiting = sc.nextInt();
		System.out.println("Enter the time of day (0 - morning, 1 - noon, 2 - evening)");
		int timeOfDay = sc.nextInt();

		ParkingLot lot = new ParkingLot(numSpots, numWaiting);
		lot.setTakenForTime(timeOfDay);
		ArrayList<Spot> available = lot.avaliableSpots();

		for(int i=0; i<numWaiting; i++){
			if(i < available.size()){
				System.out.println("User " + i + " take Spot " + available.get(i).getID());
			}
			else{
				System.out.println("No available spot for User " + i);
			}
		}
	}
}
