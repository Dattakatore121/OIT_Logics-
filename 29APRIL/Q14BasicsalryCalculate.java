import java.util.Scanner;
public class Q14BasicsalryCalculate{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        System.out.print("Enter your basic salary (in Rs): ");
        double salary = scanner.nextDouble();

        if (salary <= 700000) {
            System.out.println("NO tax");
        } else{
            double tax_amount=Salary*0.01;
        System.out.println("Your calculated tax is: Rs" + tax_amount);
        
    }

        
    }
}
    
    

