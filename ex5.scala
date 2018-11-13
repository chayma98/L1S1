
import scala.io.StdIn ;
object ex5 extends App {
 var i , j, s , x : Int = 0 ;
 print ("donner n ");
 print ("donner m");
 s= 1 ;
 for (i = 1 to n ) { if ( n % i == 0 ) 
 {s = s+i } }
 x = 1;
 for ( j = 1 to m ) { (if m % j == 0) { x = x + j } 
 }
 if (s+x == n + m ) { print (n, "et" ,m, "sont amicaux" )}
}