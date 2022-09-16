package se.lexicon.jennie;

public class Main {
    public static void main(String[] args) {

        String s = "Ok this is not as long!";

        System.out.println(s.substring(s.indexOf("n"), s.indexOf("!")));
    }
}