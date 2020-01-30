package com.company;

public class MissingValue {
    public static void main(String[] args) {
        int n;    // initialize here.

        int[] numbers = new int[]{1, 2, 3, 4, 6, 7};   // take default input array.

        n = 7;    // last elements.

        int expected_sum = n * ((n + 1) / 2);       // sum of elements till last value.
        int sum = 0;

        for (int i : numbers) {
            sum += i;
        }

        // obtain missing elements.
        int m = expected_sum - sum;
        System.out.print("Missing element is : " + m);
        System.out.print("\n");
    }
}
