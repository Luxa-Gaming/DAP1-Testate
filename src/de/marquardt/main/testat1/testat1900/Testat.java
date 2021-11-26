package de.marquardt.main.testat1.testat1900;

public class Testat
{
    public static int [] apply ( int[] arr , int x)
    {
         int[] newarr;
         newarr = arr;

        for(int i=0; i<newarr.length; i++){
            if (i%2 == 0){
                int var1 = newarr[i];
                int var2 = var1*x;
                newarr[i] = var2;
            }else{
                newarr[i] = x;
            }
        }

        return newarr;

    }
}