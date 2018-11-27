
import scala.io.StdIn;
object Q4 extends App {
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
 def sup (n : Int , t: Array[Int] ) : Int =
 { var i,x : Int = 0 ;
 for (i <- 0 to n-1 ) { if (t(i) < t(i+1)) 
           { x =t(i+1) }
 }
 return x;
 }
  var nb : Int= 0 ;
 println( "entrer le nombres des cases du tableau")
 nb =io.StdIn.readInt() ;
 remplissage(nb,t) ;
println (sup (nb,t))
;
}