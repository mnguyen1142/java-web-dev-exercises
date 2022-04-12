package exercises;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

public class ArrayListExercise {

    public static void main(String[] args) {

        // ArrayList Practice #1
        int arrLength = 10;
        ArrayList<Integer> arr = new ArrayList<>();

        int intMin = 0;
        int intMax = 5;
        int intRange = intMax - intMin + 1;

        for(int i = 0; i < arrLength; i++) {
            arr.add((int)(Math.random() * intRange) + intMin);
        }

        int sum = 0;

        for(int i = 0; i < arrLength; i++) {
            if((arr.get(i) % 2) == 0) {
                sum += arr.get(i);
            }
        }
        System.out.println(arr);
        System.out.println(sum);


        // ArrayList Practice #2
        int arrLength2 = 10;
        ArrayList<String>  arr2 = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        String userInput;
        System.out.println("Enter words for Array List. To stop, enter '-1': ");

        do {
            userInput = input.nextLine();
            userInput = userInput.trim();
            if(!(userInput.equals("-1"))) {
                arr2.add(userInput);
                System.out.println(userInput + " has been added to ArrayList");
            }
        } while (!userInput.equals("-1"));

        System.out.println("Data is no longer being added to ArrayList");
        System.out.println("Length of Word for Search: ");
        int wordLength = input.nextInt();

        for(int i = 0; i < arr2.size(); i++) {
            if(arr2.get(i).length() == wordLength) {
                System.out.println(arr2.get(i));
            }
        }


        // HashMap Practice
        HashMap<Integer, String> students = new HashMap<>();
        int iD;
        String name;

        System.out.println("Begin Entering New Student Information. To stop, enter '-1'.");

        do {
           System.out.print("Enter New Student ID: ");
            iD = input.nextInt();
            input.nextLine();
            if(iD == -1) {
                break;
            }

            System.out.print("Enter Student's Name: ");
            name = input.nextLine();
            if(name.equals("-1")) {
                break;
            }

            students.put(iD, name);
            System.out.println("Successfully added Student #" + iD + ", " + name + ".");

        } while(!name.equals("-1") || iD != -1);

        System.out.println("Data is no longer being added to HashMap");

        for(Map.Entry<Integer, String> student : students.entrySet()) {

            System.out.println(student.getKey() + " - " + student.getValue());

        }

    }
}
