import java.util.Scanner;
public class Q20BalnceCheak {
    public static void main(String[] args) {
        double balnce=1000;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter your widrawal balnce :");
        double amt=scanner.nextDouble();

        if(amt<=balnce){
            balnce-=amt;
            System.out.println("widrawal Sussesful");
             System.out.println("Your new balance :"+ balnce);


        }

        else{
            System.out.println(" Insufficient Balance");
    }
}
    
}
