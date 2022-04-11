package exercises;
import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("What is the number of miles you have driven: ");
        double milesDriven = input.nextDouble();
        System.out.print("What is the number of gas you've consumed in gallons: ");
        double gallonsConsumed = input.nextDouble();
        System.out.println("Miles per gallon is approximately " + (milesDriven / gallonsConsumed));

    }
}
