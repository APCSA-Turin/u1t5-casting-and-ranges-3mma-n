import java.util.Scanner;

public class Challenge3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number between 100.00 and 999.99 with up to 2 decimals: ");
        double input = scan.nextDouble() + 0.001;
    
        int digitOne = (int) (input / 100);
        int digitTwo = (int) (input % 100 / 10);
        int digitThree = (int) (input % 10 / 1);
        int digitFour = (int) (input % 1 / 0.1);
        int digitFive = (int) (input % 0.1 / 0.01);
    
        digitOne++;
        digitTwo++;
        digitThree++;
        digitFour++;
        digitFive++;
        digitOne %= 10;
        digitTwo %= 10;
        digitThree %= 10;
        digitFour %= 10;
        digitFive %= 10;

        String fullString = (String) ("The adjusted number is: " + digitOne + digitTwo + digitThree + "." + digitFour + digitFive);
        System.out.println(fullString);

        scan.close();
    }
}