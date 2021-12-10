package de.marquardt.main.testat3.testat1500;

public class Testat {
    public static int apply(int[] arr, int i) {
        int summe = 0;
        if (0 <= i && i < arr.length) {
            if (i % 2 != 0 && arr[i] < 0) {
                summe += summe + arr[i];
            }
            return summe + apply(arr, i - 1);
        }
        return 0;
    }
}