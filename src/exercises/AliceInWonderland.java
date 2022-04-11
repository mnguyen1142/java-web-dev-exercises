package exercises;
import java.util.Scanner;

public class AliceInWonderland {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String sentence = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having " +
                "nothing to do: once or twice she had peeped into the book her sister was reading, but it had no " +
                "pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures " +
                "or conversation?'";
        System.out.print("Enter a term for search: ");
        String term = input.nextLine();
        sentence = sentence.toLowerCase();
        term = term.toLowerCase();
        term = term.trim();

        if(sentence.contains(term) == true) {
            int index = sentence.indexOf(term);
            int length = term.length();

            System.out.println(term + " was found.");
            System.out.println(term + " has an index of " + index + ".");
            System.out.println(term + " has a length of " + length + ".");
            String newStr1 = sentence.substring(0, index);
            String newStr2 = sentence.substring((index + length), sentence.length());
            String newStr = newStr1.concat(newStr2);
            System.out.println(newStr);
        } else {
            System.out.println(term + " was NOT found.");
        }

    }
}
