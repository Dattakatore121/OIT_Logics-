import java.util.Scanner;
public class Q23QudarentCheak {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("enter your X value :");
        double X=scanner.nextDouble();
        System.out.print("enter your Y value :");
        double Y=scanner.nextDouble();

        if(X>0 && Y>0){
            System.out.println("first I quardant");
        }else if(X>0 && Y<0){
            System.out.println("II quardent");
            
        }else if(X<0 && Y <0){
            System.out.println("III quardent");
        }else if(X<0 && Y >0){
            System.out.println("IV quardent");
        }else{
            System.out.println("Not a value");
        }

    }
    
}
