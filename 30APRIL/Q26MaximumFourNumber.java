import java.util.Scanner;
public class Q26MaximumFourNumber {
    public static void main(String[] args) {
    Scanner scanner= new Scanner(System.in);

    System.out.print("Enter your first number  :" );
        int a=scanner.nextInt();

    System.out.print("Enter your second number  :" );
        int b =scanner.nextInt();

    System.out.print("Enter your Third number  :" );
        int c =scanner.nextInt();

        System.out.print("Enter your fourth Number :");
        int d=scanner.nextInt();
    

        int max;

        if (a >= b && a >= c && a >= d) {
            max = a;
        } else if (b >= a && b >= c && b >= d) {
            max = b;
        } else if (c >= a && c >= b && c >= d) {
            max = c;
        } else {
            max = d;
        }

        System.out.println("The maximum number is: " + max);
    }
}

    

