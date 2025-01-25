import java.util.Scanner;
public class Room {
    public static void main(String args[]){
        try (Scanner myInput = new Scanner(System.in)) {
            int length;
            int width;
            int floor;
            System.out.print("Enter Length: ");
            length = myInput.nextInt();
            System.out.print("Enter Width: ");
            width = myInput.nextInt();
            floor = length * width;
            System.out.println("\nThe floor Space is " + floor + "square feet");
        } 

    }

    @Override
    public String toString() {
        return "room []";
    }
}