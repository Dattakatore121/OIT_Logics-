import java.util.Scanner;

public class Vsphere {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the radius of the sphere:");
        Double radius=sc.nextDouble();
        Double vol_of_sphere=1.33*3.14*radius*radius*radius; // गोलाचे आकारमान (volume) = (4/3)πr³
        System.out.println("The area of Sphere is:="+ vol_of_sphere);
        
    }
    
}
