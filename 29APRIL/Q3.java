import java.util.Scanner;
public class Q3{
     public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter your a :");
        int num1=scanner.nextInt();

         System.out.print("Enter your b:");
        int num2=scanner.nextInt();

        if(num1> num2){
            System.out.println(num1 +"num1 is Max than num2");

        }else {
            System.out.println(num2  +"num2 is max than  num1");
        }
        
    
}
}
