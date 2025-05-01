import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner Scanner=new Scanner(System.in);
        System.out.print(" Enter your Birth year : ");
        int Year =Scanner.nextInt();
        int currentage= 2025;
        int old= currentage-Year;

        int All_days= old*365;
        System.out.println(All_days + "Days");
    }
    
}
