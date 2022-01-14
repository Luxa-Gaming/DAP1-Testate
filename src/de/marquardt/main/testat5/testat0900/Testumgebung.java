package de.marquardt.main.testat5.testat0900;

public class Testumgebung
{ 
    public static void main( String[] args )
    {
        test();
    }

    public static void test()
    {

        CharacterSearchTree emptyTree = new CharacterSearchTree();
        
        CharacterSearchTree singleNode1 = new CharacterSearchTree();
        singleNode1.iterativeAdd( 'd' );
        
        CharacterSearchTree singleNode2 = new CharacterSearchTree();
        singleNode2.iterativeAdd( 'n' ); singleNode2.iterativeAdd( 'n' );
        
        CharacterSearchTree bigTree = new CharacterSearchTree();
        bigTree.iterativeAdd( 'm' ); bigTree.iterativeAdd( 'm' );
        bigTree.iterativeAdd( 'g' );
        bigTree.iterativeAdd( 'r' ); bigTree.iterativeAdd( 'r' );
        bigTree.iterativeAdd( 'f' ); bigTree.iterativeAdd( 'f' );
        bigTree.iterativeAdd( 'k' ); bigTree.iterativeAdd( 'k' );
            bigTree.iterativeAdd( 'k' );
        bigTree.iterativeAdd( 'p' ); bigTree.iterativeAdd( 'p' );
            bigTree.iterativeAdd( 'p' );
        bigTree.iterativeAdd( 't' );
        bigTree.iterativeAdd( 'b' );
        bigTree.iterativeAdd( 'h' ); bigTree.iterativeAdd( 'h' );
        bigTree.iterativeAdd( 'n' ); bigTree.iterativeAdd( 'n' );
            bigTree.iterativeAdd( 'n' ); bigTree.iterativeAdd( 'n' );
        bigTree.iterativeAdd( 'v' ); bigTree.iterativeAdd( 'v' );
            bigTree.iterativeAdd( 'v' );
        bigTree.iterativeAdd( 'u' ); bigTree.iterativeAdd( 'u' );
        bigTree.iterativeAdd( 'x' );

        System.out.print( "bigTree: " );
        bigTree.show();
        System.out.println();
        System.out.println();


        //--- Test apply ---
        System.out.print( "Test apply() - emptyTree: " );
        System.out.println( emptyTree.apply() );
        System.out.println();

        System.out.print( "Test apply() - singleNode1: " );
        System.out.println( singleNode1.apply() );
        System.out.println();
        
        System.out.print( "Test apply() - singleNode2: " );
        System.out.println( singleNode2.apply() );
        System.out.println();

        System.out.print( "Test apply() - bigTree: " );
        System.out.println( bigTree.apply() );
        System.out.println();

    }
}

