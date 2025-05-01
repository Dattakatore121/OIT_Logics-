import java.util.Scanner;
public class Q15MonthlyincomeCalculate {
    
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter your monthly sellingincome :" );
        Double Sellincome= scanner.nextDouble();

        Double commitisition= 0.03;
        if(Sellincome>1000000){
            System.out.println("Your commition is " + (Sellincome*commitisition));


        }else{
            System.out.println("No commition");
        }



        

    }
}
