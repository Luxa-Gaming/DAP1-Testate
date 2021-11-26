package de.marquardt.main.testat1.testat11500;

public class Testumgebung
{
    public static void main(String[] args)
    {
        // Beispiel 1
        int[] arr1 = {1,2,3,4,5,6};
        int[] erg1 = Testat.apply( arr1, 7 );
        showArray( erg1 );
        //Beispiel 2
        int[] arr2 = {2,2,3,3,4,4};
        int[] erg2 = Testat.apply( arr2, 3 );
        showArray( erg2 );
        //Beispiel 3
        int[] arr3 = {2,3,4,5,6};
        int[] erg3 = Testat.apply( arr3, -3 );
        showArray( erg3 );
        //Beispiel 4
        int[] arr4 = {2,3,4};
        int[] erg4 = Testat.apply( arr4, 0 );
        showArray( erg4 );
        //Beispiel 5
        int[] arr5 = {2,3};
        int[] erg5 = Testat.apply( arr5, 7 );
        showArray( erg5 );
        //Beispiel 6
        int[] arr6 = {2};
        int[] erg6 = Testat.apply( arr6, 5 );
        showArray( erg6 );
        //Beispiel 7
        int[] arr7 = {};
        int[] erg7 = Testat.apply( arr7, 2 );
        showArray( erg7 );
    }
    
    private static void showArray( int[] arr )
    {
        String res = ""; for ( int i : arr ) { res += i + ","; }
        System.out.println( "{" + ( res.length()>0 ? res.substring( 0, res.length()-1 ) : "" ) + "}" );
    }
}

