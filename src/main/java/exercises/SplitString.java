package exercises;

import java.util.Arrays;

public class SplitString {
    public static void main(String[] args) {
        String mySentence = "I would not, could not, in a box. " +
                "I would not, could not with a fox. " +
                "I will not eat them in a house. " +
                "I will not eat them with a mouse.";
        String[] myArray = mySentence.split("\\.");
        System.out.println(Arrays.toString(myArray));

    }
}
