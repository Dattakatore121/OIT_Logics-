
import java.util.Scanner;
public class Subjectclass{
    public static void main(String[] args) {
         
        Scanner Scanner= new Scanner (System.in);
        System.out.print( "Math subject marks:");
        int Math=Scanner.nextInt();

        System.out.print( "Marathisubject marks:");
        int Marathi=Scanner.nextInt();

        System.out.print( "Hindi subject marks:");
        int Hindi=Scanner.nextInt();

        System.out.print( "English subject marks:");
        int English=Scanner.nextInt();
         
        System.out.print( "History subject marks:");
        int History=Scanner.nextInt();
         
        int Total=   Math + Marathi+ Hindi+History+ English ;
        System.out.println(Total);

        int per= Total/5;
        System.out.println(per);







    }
}