import java.util.Scanner;
public class BoxOffice {
    public static void main(String[] args){
        Scanner write = new Scanner(System.in);
        System.out.println("What is the name of the movie?");
        String movie = write.nextLine();
        System.out.println("How many adult tickets were sold?");
        double AT = write.nextInt();
        System.out.println("How many children tickets were sold?");
        double CT = write.nextInt();
        double gross = (AT * 10.00) + (CT * 6.00);
        double net = (gross * 0.20);
        double distributorProfit = gross - net;
        System.out.printf("Movie Name:                                       \"%s\'%n",movie);
        System.out.printf("Adult Tickets Sold:                               %.2f%n",AT);
        System.out.printf("Child Tickets Sold:                               %.2f%n",CT);
        System.out.printf("Gross Box Office Profit:                          $%.2f%n",gross);
        System.out.printf("Net Box Office Profit:                            $%.2f%n",net);
        System.out.printf("Amount Paid to Distributor:                       $%.2f%n",distributorProfit);
        write.close();
    }
    
}
