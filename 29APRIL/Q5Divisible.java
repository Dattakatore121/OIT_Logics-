import java.util.Scanner;

public class Q5Divisible {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter your Number :");
        int num=scanner.nextInt();
         
        if (num%5==0 && num %7==0){
            System.out.println("number is Divisible by 5 & 7");
        } else{
            System.out.println("number is not Divisible by 5 & 7");
        }
    }
    
}
