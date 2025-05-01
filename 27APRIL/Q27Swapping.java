import java.util.Scanner;
public class Q27Swapping {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter your first Number");
        int num1=scanner.nextInt();

        System.out.println("enter your Second Number");
        int num2=scanner.nextInt();

        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;

        System.out.println( "After Swapping" + num1 , "num2"+ num2) ;
        

    }
    
}
