package de.marquardt.main.testat3.testat0900;

public class Testat {
    public static int apply(int[] arr, int i) {
        int summe = 0;
        if (0 <= i && i < arr.length) {
            if (arr[i] < 0 && i % 2 != 0) {
                summe++;
            }
            return summe + apply(arr, i - 1);
        }
        return 0;
    }
}