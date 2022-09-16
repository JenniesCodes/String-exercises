package se.lexicon.jennie;

public class Main {
    public static void main(String[] args) {

        String s1 = "Oil and water";

        String s2 = s1.substring(0, s1.indexOf(" ")); // Saving the word "Oil" in a separate String

        String s3 = s1.substring(s1.indexOf("w"), s1.length()); // Saving the word "water" in another String

        String[] ow = {s2, s3}; // Storing the words "Oil" and "water" in a String array

        System.out.println(ow[0] + " " + ow[1]);
    }
}