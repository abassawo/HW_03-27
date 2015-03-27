package nyc.c4q.abassawo;

import sun.net.SocksProxy;

import java.util.ArrayList;
import java.util.Scanner;

//Class for Encoding and Decoding CaesarCiphers

public class CaesarCipher {

    public static String decode(String enc, int offset) {   //decode method
        return encode(enc, 26 - offset);
    }

    public static String encode(String enc, int offset) {   //encode method
        offset = offset % 26 + 26;
        StringBuilder encoded = new StringBuilder();
        for (char i : enc.toCharArray()) {
            if (Character.isLetter(i)) {
                if (Character.isUpperCase(i)) {
                    encoded.append((char) ('A' + (i - 'A' + offset) % 26));
                } else {
                    encoded.append((char) ('a' + (i - 'a' + offset) % 26));
                }
            } else {
                encoded.append(i);
            }
        }
        return encoded.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to encode");

        String input = sc.nextLine();
        String encoded = CaesarCipher.encode(input, 25);
        System.out.println(encoded);
        String decoded = CaesarCipher.decode(encoded, 25);
        System.out.println(decoded);
        System.out.println(codeBreaker(input, decoded));
    }

    public static boolean codeBreaker(String x, String y) {      //boolean method.
        //ArrayList<Character> uniqueLetters = new ArrayList<Character>(); //another way to do
        for (int i = 0; i < x.length() || i < y.length(); i++) {
            char j = x.charAt(i);
            char k = y.charAt(i);

            if ( x.length() == y.length() && (j % 26)  == (k % 26)) { //word length and chars same.
                return true;
            } else {
                return false;
            }
        }
        return true;
    }
}