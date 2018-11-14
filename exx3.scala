import scala.io.StdIn;
object exx3 extends App {
 def premier (n :Int ) : Boolean = {
   var retour : Boolean = false ;
   var i : Int=0 ;
   for ( i <= 1 to n ) { if ( n % i ==0 ) { retour = true } }
   return retour
 }
 var r : Int = 0 ;
 println ("entrer un entier ") ;
 r = StdIn.readInt() ;
 var retour : Boolean = premier(r) ;
 if (retour) println ("le nombre est premier") 
}