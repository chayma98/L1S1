
import scala.io.StdIn;
object exr3 extends App {
  def affichage(n: Int) = {
    var i: Int = 0;
    for (i <- 1 to n) { print(i); }
  }
  var nombre: Int = 0;
  println("donner un entier");
  nombre = StdIn.readInt();
  affichage(nombre);
}