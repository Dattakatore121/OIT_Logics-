import java.util.Scanner;
public class Q23Room {
    
    public static void main(String[] args) {
          Scanner Scanner = new Scanner(System.in);
          System.out.print("Enter your room length ;");
          Double roomlength=Scanner.nextDouble();

          System.out.print("Enter your room width ;");
          Double roomwidth=Scanner.nextDouble();

          System.out.print("Enter your room height;");
          Double roomheight=Scanner.nextDouble();

          Double roomarea= roomlength*roomheight*roomwidth;
          System.out.println(roomarea);

          System.out.print("Enter your windo length ;");
          Double windolength=Scanner.nextDouble();

          System.out.print("Enter your windo height ;");
          Double windoheight=Scanner.nextDouble();

          System.out.print("Enter your windo width ;");
          Double windowidth=Scanner.nextDouble();

          Double windoarea= windoheight*windolength*windowidth;
          System.out.println(windoarea);

          System.out.println("Enter your door length :");
          Double Doorlength= Scanner.nextDouble ();

          System.out.println("Enter your door width:");
          Double Doorwidth = Scanner.nextDouble();

          System.out.println("Enter your door height :");
          Double Doorheight= Scanner.nextDouble();

          Double Doorarea= Doorheight*Doorlength*Doorwidth;
          System.out.println(Doorarea);

          Double Total_room_area= roomarea-windoarea-Doorarea;
          System.out.println( "room area is" + Total_room_area);







    }
}
