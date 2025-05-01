import java.util.Scanner;
public class Q10Numberbetweencheak {
    
public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter your a :");
        int a=scanner.nextInt();

        System.out.print("Enter your b:");
        int b=scanner.nextInt();

        System.out.print("Enter your c :");
        int c=scanner.nextInt();

        if(c>a&& c<b){
            System.out.println("c is between the a& b");
        }else {
            System.out.println(" c is not a between the a & b");
        }
        
        

    }

}
