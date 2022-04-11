package exercises;
import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("What is the width: ");
        int width = input.nextInt();
        System.out.print("What is the length: ");
        int length = input.nextInt();
        System.out.println("Area is " + (width * length));

    }
}
