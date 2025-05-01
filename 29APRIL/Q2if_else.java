import java.util.Scanner;
public class Q2if_else {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter your number :");
        int num=scanner.nextInt();
        if(num%17==0){
            System.out.println(num +"  Divisible by 17");

        }else{
            System.out.println(num  +"  Divisible not 17");
        }
        
    }
    
}
