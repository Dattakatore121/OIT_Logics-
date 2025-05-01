import java
import java.util.Scanner;,util.Scanner;
public class Q16Emi {
    
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your loan amount");
        double Loan_Amount=scanner.nextDouble();

        System.out.println("Enter your month(6)or (12)");

        int month=scanner.nextInt();

        double interest_rate=0;
        if(month==6){
            interest_rate=0.02;
        }else {
            interest_rate=0.03;
        }double total_interest=Loan_Amount*interest_rate;
        double EMI=
          
    }
}
