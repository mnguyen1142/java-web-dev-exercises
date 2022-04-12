package exercises;
import java.io.*;
import java.util.*;

public class ArrayPractice {

    public static void main(String[] args) {

        // Numbers Array
        int[] arr = {1, 1, 2, 3, 5, 8};
        int arrLength = arr.length;

        for (int i = 0; i < arrLength; i++) {
            if((arr[i] % 2) == 1) {
                System.out.println(arr[i]);
            }
        }

        // Strings Array
        String str = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a " +
                "house. I will not eat them with a mouse.";
        String[] word = str.split(" ");
        System.out.println(Arrays.toString(word));
        String str2 = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a " +
                "house. I will not eat them with a mouse.";
        String[] sentence = str2.split("\\.");
        System.out.println(Arrays.toString(sentence));


    }
}
