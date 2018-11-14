import scala.io.StdIn ;
object exo1 extends App { 
  def plus_petit (a: Int , b : Int ) : Boolean =
  { var retour : Boolean = false ;
  if (a<= b ) 
  { retour = true ; }
  else 
  { retour = false ; }
  return retour ; }
  var n , m : Int = 0 ;
  println ("entrer_le premier_entier_:") ;
  n = StdIn.readInt();
  println ("enter_le_deuxieme_entier_:");
  m= StdIn.readInt () ;
  val rep : Boolean = plus_petit (n,m) ;
  if (rep==true) 
  {println (n + "_est_plus_petit_que_" + m );
  }
  else{ println ( n + " est_plus_grand_que_" + m) ;}
}
