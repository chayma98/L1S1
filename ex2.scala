
import scala.io.StdIn;
object Q2 extends App {
  val MAX=100 ;
  var t :Array[Int] = Array .ofDim(MAX) ;
  def remplissage (n: Int , t : Array[Int] ) 
  { var i,m : Int = 0 
    for (i<- 0 to n-1 ) 
    { println ("donner le",i,"ème nombre") ;
    m =io.StdIn.readInt() ;
    t(i) = m ;
    }
  }
 var nb : Int= 0 ;
 println( "entrer le nombres des cases du tableau")
 nb =io.StdIn.readInt() ;
 remplissage(nb,t) ;
 for (i<- 0 to nb-1 ) { print(t(i)) ;}
}