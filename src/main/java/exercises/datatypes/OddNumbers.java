package exercises.datatypes;

public class OddNumbers {
    public static void main(String[] args) {
        int[] myArray = {1, 1, 2, 3, 5, 8};

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] % 2 != 0) {
                System.out.println(myArray[i]);
            }
        }
    }
}

