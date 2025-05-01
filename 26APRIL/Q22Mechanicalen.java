
    import java.util.Scanner;// no
    public class Q22Mechanicalen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the mass of the particle (in kg): ");
        double mass = input.nextDouble();

        System.out.print("Enter the height from the ground (in meters): ");
        double height = input.nextDouble();

        System.out.print("Enter the velocity of the particle (in m/s): ");
        double velocity = input.nextDouble();

        final double g = 9.8;

        double potentialEnergy = mass * g * height;

        double kineticEnergy = 0.5 * mass * velocity * velocity;

        double totalEnergy = potentialEnergy + kineticEnergy;

        System.out.println("Potential Energy = " + potentialEnergy + " Joules");
        System.out.println("Kinetic Energy = " + kineticEnergy + " Joules");
        System.out.println("Total Mechanical Energy = " + totalEnergy + " Joules");

    }
}

    

