import java.util.Scanner;
public class Q31ElegibilityInterview {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter your 10th marks (in percentage): ");
        double tenthMarks = scanner.nextDouble();

        System.out.print("Enter your 12th marks (in percentage): ");
        double twelthMarks = scanner.nextDouble();

        System.out.print("Enter your Graduation marks (in percentage): ");
        double graduationMarks = scanner.nextDouble();

        if (tenthMarks >= 60 && twelthMarks >= 60 && graduationMarks >= 65) {
            System.out.println("Congratulations! You are eligible for the interview.");
        } else {
            System.out.println("Sorry, you are not eligible for the interview.");
        }

    }
}

    

