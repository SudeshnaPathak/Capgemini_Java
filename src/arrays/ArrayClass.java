package arrays;

import java.util.Arrays;
import java.util.List;

public class ArrayClass {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        Arrays.sort(numbers);
        System.out.println("Sorted array: " + Arrays.toString(numbers));
        List<int[]> l = Arrays.asList(numbers);
        System.out.println("List from array: " + l);
        int index = Arrays.binarySearch(numbers, 30);
        System.out.println("Index of 30: " + index);
        int ind = Arrays.binarySearch(numbers, 1 , 3 , 30);
        System.out.println("Index of 30 in range 1 to 2: " + ind);

        int[] numbers1 = {11, 22, 33, 44, 55};
        boolean areEqual = Arrays.equals(numbers, numbers1);
        System.out.println("Are arrays equal: " + areEqual);
        System.out.println(Arrays.compare(numbers, numbers1));
    }


}

