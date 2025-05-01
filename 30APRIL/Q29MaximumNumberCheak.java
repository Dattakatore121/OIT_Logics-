import java.util.Scanner;
public class Q29MaximumNumberCheak {

    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        System.out.print("Enter Fourth number: ");
        int d = sc.nextInt();


        int max;

        if (a > b) {
            if (a > c) {
                if (a > d) {
                    max = a;
                } else {
                    max = d;
                }
            } else {
                if (c > d) {
                    max = c;
                } else {
                    max = d;
                }
            }
        } else {
            if (b > c) {
                if (b > d) {
                    max = b;
                } else {
                    max = d;
                }
            } else {
                if (c > d) {
                    max = c;
                } else {
                    max = d;
                }
            }
        }
                 System.out.println("The maximum number is: " + max);


    


    }
    
}
