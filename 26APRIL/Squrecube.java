import java.util.Scanner;
public class Squrecube {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter your Squre value");
        int num1 = sc.nextInt ();

        System.out.print( "Enter youe cube value");
        int num2 =sc.nextInt();

        int squre= num1*num1;
        int cube= num2*num2*num2;

        System.out.println("squre is "+ squre);
        System.out.println("cube is "+ cube);
         


        
        
    }
    
}
