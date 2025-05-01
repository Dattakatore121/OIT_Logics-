import java.util.Scanner;;
public class Q21DigitCheak {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.print(" Enter your digit :");
        int num= scanner.nextInt();

        if (num<0){
            num=-num;
        }

        if(num>=0 && num<=9){
            System.out.println("given number is 1-Digit" );

        }else if(num>=10 && num<=99){
            System.out.println("given number is 2-Digit" );
        
        
    }else if(num>=99 && num<=999){
            System.out.println("given number is 3-Digit" );
    }else if(num>=999 && num<=9999){
            System.out.println("given number is 4-Digit" );
    }else{ 
        System.out.println(" Given number is above than 4-digit");
    }
    
}
}