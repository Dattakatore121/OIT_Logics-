import java.util.Scanner;
public class Areaofcircumferencecircle {
    public static void main(String[] args) {
        
Scanner Scanner= new Scanner (System.in);
System.out.print( " Enter your radius of the circle : ");
Double Radius=  Scanner.nextDouble();

Double circle_of_area= Math.PI*Radius*Radius;
Double circle_of_circumference= 2*Math.PI*Radius;

System.out.println( circle_of_area);
System.out.println(circle_of_circumference);


    }
    
}
