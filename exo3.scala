
import scala.io.StdIn ;
object exo3 extends App {
  def vitesse ( d : Int , t : Int ) : Int = { var v : Int = 0 ;
  v = d/t ;
  return v;
  }
 var  d, t : Int = 0 ;
 println ("donner la distance") ;
 d = StdIn.readInt();
 println ("donner le temps");
 t = StdIn.readInt() ;
 val vitesse : Int = vitesse(d,t) ;
 println (vitesse  ) ;}