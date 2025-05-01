import java.util.Scanner;
public class Q24SalaryCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your basic salary: ");
        double basicSalary = scanner.nextDouble();

        double hra = 0.20 * basicSalary; 
        double ta  = 0.10 * basicSalary; 
        double da  = 0.15 * basicSalary; 

        double grossSalary = basicSalary + hra + ta + da;

        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("HRA (20%): " + hra);
        System.out.println("TA  (10%): " + ta);
        System.out.println("DA  (15%): " + da);
        System.out.println("Gross Salary: " + grossSalary);


    }
}

    

