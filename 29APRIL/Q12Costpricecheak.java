import java.util.Scanner;
public class Q12Costpricecheak {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter your cost Price :");
        Double costprice=scanner.nextDouble();

        System.out.print("Enter your selling Price :");
        Double sellprice=scanner.nextDouble();

        Double Profitorloss=costprice-sellprice;

        if(Profitorloss>0){
            Double profitpercentage=(Profitorloss/costprice)*100;
            System.out.println("profit :"+ Profitorloss +"Rs");
            System.out.println("profit percentage :"+ profitpercentage+"%");

            

        }else{
            Double losspercentage=(-Profitorloss/costprice)*100;
            System.out.println("Loss :"+ (-Profitorloss) +"Rs");
            System.out.println("Loss percentage :"+ losspercentage+"%");


        }

        
    }
    
}
