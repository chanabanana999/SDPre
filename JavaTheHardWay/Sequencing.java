import java.util.Scanner;

public class Sequencing {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    double price, salesTax, total;

    System.out.println();
    System.out.print( "How much is the purchase price? ");

    price = keyboard.nextDouble();
    salesTax = price * 0.0825;
    total = price + salesTax;

    System.out.println( "Item price:\t" + price );
    System.out.println( "Sales tax:\t" + salesTax );
    System.out.println( "Total cost:\t" + total);
    System.out.println();
    /* if the salesTax and total are calculated in the original position, there
    is an error unless price is initialized to zero. Once the statements are
    places in the correct order, it does not matter if the price is initialized
    because they input value overrides whatever was there.
    */
  }
}
