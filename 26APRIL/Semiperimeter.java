import java.util.Scanner;

public class Semiperimeter{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a");
        Double a= sc.nextDouble();

        System.out.println("Enter  b");
        Double b= sc.nextDouble();

        System.out.println("Enter  c");
        Double c= sc.nextDouble();

         Double s =(a + b+ c)/ 2 ;// Semi perimeter = (a + b + c)/2,अर्ध परिमिती म्हणजे त्रिकोणाच्या तीनही बाजूंची लांबी (a, b, c) मिळवून त्यांची बेरीज करा (a + b + c). त्या बेरजेला 2 
         System.out.println("semiperimeter of sp:" + s);

            Double Area= Math.sqrt(s*(s-a) *(s-b) *(s-c));
            System.out.println("area is  " + Area + "sq.cm");

         
 



    }
    
}
