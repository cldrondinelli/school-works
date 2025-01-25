import java.util.Scanner;

public class binary {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.println("Input a Decimal number: ");
        int decimalNumber = input.nextInt();
        String binaryNumber = Integer.toBinaryString(decimalNumber);
        System.out.println("Binary number is: " + binaryNumber);
        
        input.close();

    }
}
