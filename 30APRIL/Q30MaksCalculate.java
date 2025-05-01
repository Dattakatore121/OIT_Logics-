import java.util.Scanner;
public class Q30MaksCalculate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter marks for Subject 1: ");
        int subject1 = input.nextInt();

        System.out.print("Enter marks for Subject 2: ");
        int subject2 = input.nextInt();

        System.out.print("Enter marks for Subject 3: ");
        int subject3 = input.nextInt();

        int total = subject1 + subject2 + subject3;
        double percentage = (total / 3.0);

        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");

        if (percentage >= 70) {
            System.out.println("Class: Distinction");
        } else if (percentage >= 60) {
            System.out.println("Class: First Class");
        } else if (percentage >= 50) {
            System.out.println("Class: Second Class");
        } else if (percentage >= 35) {
            System.out.println("Class: Pass Class");
        } else {
            System.out.println("Class: Fail");
        }

    
    }
}

    

