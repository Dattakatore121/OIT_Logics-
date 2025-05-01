import java.util.Scanner;
public class Q9Numberbetweencheak {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter your a :");
        int a=scanner.nextInt();

        System.out.print("Enter your b:");
        int b=scanner.nextInt();

        System.out.print("Enter your c :");
        int c=scanner.nextInt();

        if(b<a&& a<c){
            System.out.println("a is between the b& c");
        }else {
            System.out.println(" a is not a between the b & c");
        }
        
        

    }
    
}
