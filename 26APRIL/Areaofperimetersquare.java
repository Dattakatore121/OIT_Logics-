import java.util.Scanner;
public class Areaofperimetersquare {
    public static void main(String[] args) {
        

        Scanner Scanner= new Scanner(System.in);
        System.out.print("Enter your Length : ");
        Double side =Scanner.nextDouble();
        Double Area_of_Squre= side*side;
        Double perimeter=4*side;

        System.out.println( Area_of_Squre);
        System.out.println(perimeter);


    }

    
}
