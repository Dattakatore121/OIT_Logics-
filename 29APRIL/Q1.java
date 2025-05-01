import java.util.Scanner;
public class Q1{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter your number =");
        int num=scanner.nextInt();
         

        if(num%2==0){
            System.out.println("Even Number");
        }else{
            System.out.println("odd Number");
        }
        
    }
}