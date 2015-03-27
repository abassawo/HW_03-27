package nyc.c4q.abassawo;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String value");

        String strUnique = input.next();
        char[] letters = strUnique.toCharArray();
        Arrays.sort(letters);                           //sort in alphabetical order

        ArrayList<Character>uniqueLetters = new ArrayList<Character>();

        for (int i = letters.length-1; i > 0; i--) {    //Collects in reverse order.
            if (letters[i] != letters[i- 1]) {          //Loop backwards. no repetitions accepted.
                uniqueLetters.add(letters[i]);          //If unique add to new Array List "UniqueLetters"
            }
        }
        uniqueLetters.add(letters[0]);                  //Manually include first letter of sorted array list.
        System.out.println(uniqueLetters);              //add other letters.
    }
}
