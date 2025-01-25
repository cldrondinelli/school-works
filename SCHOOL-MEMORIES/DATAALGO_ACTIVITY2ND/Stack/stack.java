package Stack;

import java.util.*;
import java.util.Stack;

public class stack{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String Order;
		Stack<String> Orders = new Stack<>();
		
		System.out.println("~~~~~MENU~~~~~");
		System.out.println("• Cheeseburger = $5");
		System.out.println("• Pasta = $8");
		System.out.println("• Fries = $3");
		System.out.println("• Soda = $2");
		System.out.println("• Chicken = $10\n");
		
		int CheeseburgerTotal = 0, PastaTotal = 0, FriesTotal = 0, SodaTotal = 0, ChickenTotal = 0;
		
		System.out.println("Enter Order From The Menu then type 'OUT' to finalize the Order\n");
		while(true) {
		       Order = input.next();
		       String Item = Order;
		       switch (Item) {
		        case "Cheeseburger":
                    CheeseburgerTotal++;
                    break;
                case "Pasta":
                    PastaTotal++;
                    break;
                case "Fries":
                    FriesTotal++;
                    break;
                case "Soda":
                    SodaTotal++;
                    break;
                case "Chicken":
                    ChickenTotal++;
                    break; 
                case "OUT":
                    break;
                default:
                    System.out.println("Enter a Valid Order or Type 'OUT' to finalize the Order");
		    }
		       if(Order.equalsIgnoreCase("OUT")){
		           break;
		       }
		}  
		
		int Total = (CheeseburgerTotal * 5) + (PastaTotal *8) + (FriesTotal * 3) + (SodaTotal * 2) + (ChickenTotal * 10);
		System.out.println("Summary of Order:\n");
		  
        System.out.println("Cheeseburger = " + CheeseburgerTotal);
        System.out.println("Pasta = " + PastaTotal);
        System.out.println("Fries = " + FriesTotal);
        System.out.println("Soda = " + SodaTotal);
        System.out.println("Chicken = " + ChickenTotal);
        System.out.println("Total = " + "$" + Total);
	}
}