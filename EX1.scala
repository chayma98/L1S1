
import scala.io.StdIn;
object EX1 extends App {
  val MAX=100 ;
  var t : Array[Int] = Array .ofDim(MAX);
  def maz(n : Int , t : Array[Int]) { 
    var i : Int = 0 ;
    for ( i<- 0 to n - 1 ) 
        { t(i) = 0 ; } 
  }
  def affiche ( n : Int , t : Array[Int])
    { var i : Int = 0 ;
    for (i<- 0 to n-1 ) {
      print ( t(i)+ " ") ;
    }
  }
 var nb : Int = 0 ;
 println("entrez_le_nombre_de_valeurs_du_tableau_:")
 nb = io.StdIn.readInt() ;
 maz(nb,t) ;
 affiche (nb,t);
}
  