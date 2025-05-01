import java.util.Scanner;
public class Q22Tringle {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter your a: ");
        double a=scanner.nextDouble();

         System.out.print("Enter your b: ");
        double b=scanner.nextDouble();

         System.out.print("Enter your c: ");
        double c=scanner.nextDouble();

        if ( a>0 &&b>0 && c>0){
            if(a==b&& b==c){
                System.out.println("It is an Equilatreal triangle");
            }else if(a==b||b==c||a==c){
                System.out.println(" It is an isosceles Triangle");
            }else if(
                a*a+b*b==c*c||
                b*b+c*c==a*a||
                a*a+c*c==b*b


            ){
                System.out.println(" It an Right Triangle");
            }else{
                System.out.println(" It is an Scalene Tringle");
            }
        }else{
            System.out.println("It is an Not a Tringle");
        }


    }
    
}
