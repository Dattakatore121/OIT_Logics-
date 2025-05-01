import java.util.Scanner;
public class Q13Amoutcalculate {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the purchase amount: ");
        double amount = scanner.nextDouble();
        double discountRate;
        double discountAmount;
        double finalAmount;


        if (amount >= 5000) {
            discountRate = 20;
        } else if (amount >= 2000) {
            discountRate = 10;
        } else {
            discountRate = 5;
        }

    
        discountAmount = (discountRate / 100) * amount;
        finalAmount = amount - discountAmount;

        
        System.out.println("Original Amount: RS  " + amount);
        System.out.println("Discount Applied: " + discountRate + "%");
        System.out.println("Discount Amount: RS " + discountAmount);
        System.out.println("Final Amount to Pay: RS " + finalAmount);


    
    
} 
}
