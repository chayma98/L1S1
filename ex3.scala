
import scala.io.StdIn;
object ex3 extends App {
  def diviseur(n: Int) = {
    var i: Int = 0;
    var s: Int = 0;
    for (i <- 1 to n) {
      if (n % i == 0) { s = s + 1 }
    }
    println("result:"+ s)
  }
  var nombre  :Int = 0 ;
  println("donner un entier");
  nombre = StdIn.readInt() ;
  diviseur (nombre);
}