import java.util.Scanner;
public class Q19VacnciesCheak {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter your vacancies :");
        int vac=scanner.nextInt();
         

        if (vac==2){
            System.out.println("elegible for Interview");
        }else{
            System.out.println("Not eligible for Interview");
        }
    }

    
}
