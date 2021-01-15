/**
 * File: MaxProduct.java
 * <p>
 * Given an array of integers. Find the maximum product obtained from multiplying 2 adjacent numbers in the array.
 * <p>
 * Notes:
 * - Array/list size is at least 2.
 * - Array/list numbers could be a mixture of positives, negatives also zeroes .
 */
public class MaxProduct {
    public int adjacentElementsProduct(int[] array) {
        int max = array[0] * array[1];

        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] * array[i + 1] > max)
                max = array[i] * array[i + 1];
        }

        return max;


    }
}