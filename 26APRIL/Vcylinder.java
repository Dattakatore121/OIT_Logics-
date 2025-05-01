import java.util.Scanner;
public class Vcylinder {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the radius of cylinder :");
        Double radius=sc.nextDouble();

        System.out.print("Enter the height");
        Double height=sc.nextDouble();
        
        Double vcylinder= 3.14*radius*radius*height;//सिलेंडरचे पायाचे क्षेत्रफळ (area of base) = π * r² *h

        System.out.println(vcylinder);

    }
}
