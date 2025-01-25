import java.util.Scanner;
 public class Furniture
 {
   public static void main(String args[])
   { 
    try (Scanner scanner = new Scanner(System.in)) {
        // Ask the user to choose number from 1-3(1 for Pine, 2 for Oak, and 3 for Mahogany).
        System.out.println("[ 1 ] Pine" + "\n[ 2 ] Oak" + "\n[ 3 ] Mahogany\n");
        System.out.print("Choose a number >> ");
        int choose = scanner.nextInt();
        
        switch (choose)
        {
          case 1:
            System.out.println("Pine tables cost $100");
            break;
            
          case 2:
            System.out.println("Oak tables cost $225");
            break;
            
          case 3:
            System.out.println("Mahogany tables cost $310");
            break;
          
          default:
            System.out.println("Invalid, cost $0");
            break;
            }
    }
   }
 }