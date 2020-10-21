import java.util.InputMismatchException;
import java.util.Scanner;
public class  ExchangeCurrency {
    public static void  main (String[] args) {
        ExChangeAPI obj = new ExChangeAPI();
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("### Currency Exchange System ####");
            System.out.println("Please, enter your current currency:" );
            String currentCurrency = scanner.nextLine ();
            if (obj.getConnection(currentCurrency) == false)
                System.out.println("Sorry,we can't find tind this currency rate.");
            else {
                System.out.println("Amount: ");
                double amount = Double.parseDouble(scanner.nextLine());

                System.out.println("Enter new currency: ");
                String newCurrency = scanner.nextLine();

                double rate = obj.getEachRate (newCurrency);

                System.out.println("\nExchange "+currentCurrency+" to "+newCurrency);
                System.out.println("\t"+currentCurrency+": "+amount);
                System.out.println("\t"+newCurrency+": "+(amount*rate));

            }
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }

    }//main
}//class