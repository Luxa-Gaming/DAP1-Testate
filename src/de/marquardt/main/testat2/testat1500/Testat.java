package de.marquardt.main.testat2.testat1500;

/*
Topic: Testat 2 - 1500
Author: Jaron Marquardt
Date: 26.11.2021 - 1455
*/

public class Testat
{
    public static Fraction apply( Fraction[] arr, Fraction x )
    {
        Fraction result;

        if(arr.length < 2 ) {
            Fraction divide = new Fraction(1,1);
            result = divide.divideBy(x);
            // result = x.reverse();

        }else {
            Fraction firstItem = arr[0];
            Fraction lastItem = arr[arr.length -1];
            Fraction firstResult = firstItem.add(lastItem);
            result = x.add(firstResult);
        }
        return result;
        
    }
}