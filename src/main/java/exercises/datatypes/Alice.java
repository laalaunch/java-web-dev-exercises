package exercises.datatypes;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        String firstSentence = "Alice was beginning to get very tired of sitting by her sister on the bank, and of " +
                "having nothing to do: once or twice she had peeped into the book her sister was reading, but it had " +
                "no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures " +
                "or conversation?'\n";

        Scanner search = new Scanner(System.in);
        System.out.println("Enter a word to search for:");
        String word = search.nextLine();

        System.out.println(firstSentence.toLowerCase().contains(word));
        int wordIndex = firstSentence.indexOf(word);
        int wordLength = word.length();
        System.out.printf("Index of search word %d Length of search word %d%n", wordIndex, wordLength);

        String newSentence = firstSentence.replaceAll(word,"");
        System.out.println(newSentence);
    }
}
