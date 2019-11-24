package exercises;

import java.util.ArrayList;

public class ArrayListSumEven {
    public static void main(String[] args) {
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(3);
        myNumbers.add(5);
        myNumbers.add(8);
        myNumbers.add(10);
        myNumbers.add(11);
        myNumbers.add(12);
        myNumbers.add(13);
        myNumbers.add(14);
        myNumbers.add(15);
        myNumbers.add(16);

        int EvenSum = 0;

        for (int i : myNumbers) {
            if (i % 2 == 0) {
                EvenSum = EvenSum + i;
                System.out.println(EvenSum);
            }
        }
    }
}
