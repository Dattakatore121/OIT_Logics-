  import java.util.Scanner;

public class Q21Interest{
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
          System.out.print("Enter the principal amount: ");
          double principal = input.nextDouble();

          System.out.print("Enter the rate of interest (in %): ");
          double rate = input.nextDouble();

          System.out.print("Enter the time (in years): ");
          double time = input.nextDouble();

          double simpleInterest = (principal * rate * time) / 100; //        : SI = (P * R * T) / 100
          double compoundInterest = principal * Math.pow((1 + rate / 100), time) - principal; //  CI = P * ( (1 + R/100)^T ) - P

          System.out.println("Simple Interest = " + simpleInterest);
          System.out.println("Compound Interest = " + compoundInterest);
        }

    
    }
}

