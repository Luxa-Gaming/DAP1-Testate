package de.marquardt.main.testat4.testat0900;

public class Testat {
    public static Fraction apply(Fraction[] arr, int i) {
        if (0 <= i && i < arr.length) {
            if (i == 0) {
                if (arr[i].toDouble() >= 0 && arr[i].toDouble() <= 1) {
                    return arr[i];
                }
                return new Fraction(0);
            }

            if (arr[i].toDouble() >= 0 && arr[i].toDouble() <= 1) {
                return arr[i].add(apply(arr, i - 1));
            }

            return apply(arr, i - 1);
        }
        return new Fraction(-1);

    }

}
