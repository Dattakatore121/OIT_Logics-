import java.util.Scanner;
public class Q4Leapyear {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter your Year :");
          int year=scanner.nextInt();

          if(year%4==0 ){
            System.out.println("This is leaf year ");
          }else{
            System.out.println("This Year is not leaf year");
          }
    }
    
}
