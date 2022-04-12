package org.launchcode.countingCharacters;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class countCharacters {

    public static void main(String[] args) {

        // Set Up
        Scanner input = new Scanner(System.in);

        // Receive String
        System.out.print("Enter String to Evaluate: ");
        String str = input.nextLine();
        System.out.println("You have entered '" + str + "', as your string to evaluate.");

        str = str.toUpperCase();
        char[] characters = str.toCharArray();
        HashMap<Character, Integer> charCount = new HashMap<>();

        for(int i = 0; i < characters.length; i++) {

            if(!charCount.containsKey(characters[i])) {
                charCount.put(characters[i], 1);
            } else {
                int count = charCount.get(characters[i]);
                count += 1;
                charCount.replace(characters[i], count);
            }

        }

        for(Map.Entry<Character, Integer> count : charCount.entrySet()) {

            System.out.println(count.getKey() + " : " + count.getValue());

        }




    }
}
