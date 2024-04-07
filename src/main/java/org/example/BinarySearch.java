package org.example;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};

        System.out.println(find(7, arr));
    }

    public static int find(int key, int[] array) {
        int lowerBound = 0;
        int upperBound = array.length - 1;
        int currentIndex;

        while (true) {
            currentIndex = (lowerBound + upperBound) / 2;
            if (array[currentIndex] == key)
                return currentIndex;
            else if (lowerBound > upperBound)
                return -1;
            else if (array[currentIndex] < key)
                lowerBound = currentIndex + 1;
            else if (array[currentIndex] > key)
                upperBound = currentIndex - 1;
        }
    }
}
