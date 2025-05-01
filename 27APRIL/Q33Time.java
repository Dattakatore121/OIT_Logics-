import java.util.Scanner;

public class Q33Time {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("Eyour enter seconds  :" );
        int second=scanner.nextInt();

        int hours= second/3600;
        int minute= (second%3600) /60;
        int sec=(second/3600)%60;

        System.out.print ("hours"+ hours);
        System.out.print ( "minute" + minute);
        System.out.print  ("sec"+ sec);


    }
    
}
