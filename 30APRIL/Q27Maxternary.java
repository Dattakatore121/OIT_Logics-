import java.util.Scanner;
public class Q27Maxternary {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("enter your a :");
        int a=scanner.nextInt();
        System.out.print("Enter your b :");
        int b= scanner.nextInt();
        System.out.print("Enter your c :");
        int c= scanner.nextInt();

        int result=(a>b)? (a>c)? a:c:(b>c)? b:c;
    
        System.out.println(result);
    }
    
}
