import java.util.Scanner;
public class Q28TwoNumberterCheak {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("enter your a :");
        int a=scanner.nextInt();
        System.out.print("Enter your b :");
        int b= scanner.nextInt();
    
        int result=(a>b)? a:b;
    
        System.out.println( "Maximum NUmber is  : " + result);
    }
    
}

    

