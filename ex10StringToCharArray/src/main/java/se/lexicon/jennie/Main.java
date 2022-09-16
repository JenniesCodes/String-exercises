package se.lexicon.jennie;

public class Main {
    public static void main(String[] args) {

        String s = "ThisShouldBeConverted";

        char[] c = new char[s.length()]; // Creating empty char array with same length as String

        for(int i = 0; i < s.length(); i++) { // Storing all elements from the String in the char array
            c[i] = s.charAt(i);
        }

        System.out.println("Each element in the char array: ");

        for(int i = 0; i < s.length(); i++) {
            System.out.print(c[i]);
        }
    }
}