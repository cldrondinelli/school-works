import java.util.Scanner;
public class Eggs {
	
	public static void main(String [] args) {
		
		int numberofEggs;
		try (Scanner inputDevice = new Scanner (System.in)) {
            System.out.print("Enter the number of eggs: ");
            numberofEggs = inputDevice.nextInt();
        }
		
		int dozens = (numberofEggs / 12)  ;
		
		System.out.println();
		System.out.println();
		
		System.out.println(numberofEggs + " eggs is " + dozens + " full dozzen " + " (with " +(numberofEggs % dozens)+" eggs remaining )");
		
		
	}

}