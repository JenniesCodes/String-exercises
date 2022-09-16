package se.lexicon.jennie;

public class Main {
    public static void main(String[] args) {

        String s = "Carl,Susie,Fredrick,Bob,Erik";

        String s1 = s.substring(0, s.indexOf(",")); // Carl
        String s2 = s.substring(s.indexOf("S"), s.indexOf("e") + 1); // Susie
        String s3 = s.substring(s.indexOf("F"), s.indexOf("k") + 1); // Fredrick
        String s4 = s.substring(s.indexOf("B"), s.indexOf("b") + 1); // Bob
        String s5 = s.substring(s.indexOf("E"), s.length()); // Erik

        String[] names = {s1, s2, s3, s4, s5}; // Storing the names in a String array

        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
        System.out.println(names[4]);
    }
}