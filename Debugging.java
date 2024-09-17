import java.util.Scanner;

public class Debugging {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter an amount of dollars & cents: ");
    double amountUnused = scan.nextDouble();
    
    amountUnused += 0.000001;

    int quarters = (int) (amountUnused / 0.25);
    amountUnused %= 0.25;

    int dimes = (int) (amountUnused / 0.1);
    amountUnused %= 0.1;

    int nickels = (int) (amountUnused / 0.05);
    amountUnused %= 0.05;

    int pennies = (int) (amountUnused / 0.01);
    int numCoins = quarters + dimes + nickels + pennies;

    System.out.println("The minimum # of coins is: " + numCoins);
    System.out.println(quarters + " Quarters");
    System.out.println(dimes + " Dimes");
    System.out.println(nickels + " Nickels");
    System.out.println(pennies + " Pennies");

    scan.close();
  }
}

