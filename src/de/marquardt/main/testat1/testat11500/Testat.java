package de.marquardt.main.testat1.testat11500;

public class Testat
{
    public static int [] apply ( int[] arr , int x)
    {
        int[] newarr;
        newarr = arr;

        for(int i=0; i<newarr.length; i++){
            //{
            if(i>0 && i< newarr.length-1){
                int save1 = newarr[i];
                int save2 = x-save1;
                newarr[i] = save2;
            }if(i<1 || i> newarr.length - 1){
                int smallestindex = 0;
                int biggestindex = newarr.length-1;

                int var1 = newarr[smallestindex]; //Wert des kleinsten Index
                int var2 = newarr[biggestindex]; // Wert des größten Index
                newarr[smallestindex] = var2; //Einsetzen des größten Index Wert auf den Platz des Kleinsten
                newarr[biggestindex] = var1; // Einsetzen des kleinsten Index Wert auf den Platz des Größten
            }
        }
        return newarr;
    }
}