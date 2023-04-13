public class AufgabeA722_Raute {
        public static void main(String[] args) {
          for ( int i = 1; i <= 5; i++ ) {
              for ( int indent = 0; indent < (5 - i); indent++ )
                System.out.print( " " );
      
              for ( int j = 1; j <= i; j++ )
                System.out.print( "5 " );
      
              System.out.println();
            }
          for ( int i = 4; i >= 1; i-- ) {
            for ( int indent = 0 ; indent <(4-i) ; indent++ )
              System.out.print( " " );
      
            for ( int j = 1; j <= i; j++ )
              System.out.print( " 6" );
      
              System.out.println();
            }  
        }
      }
