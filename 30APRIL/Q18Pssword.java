import java.util.Scanner;
public class Q18Pssword {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print(" enter your password :");
        int pass= scanner.nextInt(); 
        int ATMpin=1234;


        if(ATMpin==pass){
            System.out.println("Valid");
        }else{
            System.out.println("Not Valid");
        }
    }
    
}
