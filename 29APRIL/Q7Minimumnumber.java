import java.util.Scanner;

public class Q7Minimumnumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
System.out.print("Enter your num1 :");
int num1= scanner.nextInt();

System.out.print("Enter your num2 :");
int num2= scanner.nextInt();

if(num1<num2){
    System.out.println(num1 +"is the minimum value of" +num2);
}else {
    System.out.println(num2+ "is the minimum of "+num1);
}



    }
    
}
