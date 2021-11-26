package de.marquardt.main.testat2.testat0900;

public class Testat
{
    public static Fraction apply( Fraction[] arr, Fraction x )
    {

        Fraction result;

        if(arr.length < 3 || arr.length % 2 == 0) {
            Fraction multi = new Fraction(1,2);
            result = x.multiply(multi);

        }else {
            result = x.add(arr[arr.length/2]);

        }
        return result;
        
    }
}