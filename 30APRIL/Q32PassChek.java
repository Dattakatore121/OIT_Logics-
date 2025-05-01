import java.util.Scanner;;
public class Q32PassChek{
    public static void main(String[] args) {
        

        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter python");
        int a=scanner.nextInt();

         System.out.print("Enter java");
        int b=scanner.nextInt();

         System.out.print("Enter javascript");
        int c=scanner.nextInt();

        if(a>=40&& b>40&& c>40){

            int total=a+b+c;
            double percentage= (total /3.0);
             
            if(percentage>=90){

                System.out.println("Distinction");

            }else if(percentage >=70&& percentage<90){
                System.out.println("first class");

            }else if(percentage>=50 && percentage<70){
                System.out.println("Second class");

            }else if(percentage>=40&& percentage<50){
                System.out.println
                ("pass class ");
            }

        }else{
            System.out.println("ATKT");
        }

    }
    
}
