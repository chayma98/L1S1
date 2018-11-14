
import scala.io.StdIn ;
object exo2 extends App {
  def small ( a: Int , b : Int ) : Int = { var x : Int = 0 ;
  if (a<b) { x = a ; }
  else { x = b ;} 
  return x ;
  }
var a,b : Int = 0 ;
println("entrer le premier nombre" ) ;
a= StdIn.readInt();
println("entrer le deuxième nombre");
b= StdIn.readInt() ;
val y : Int = small(a,b) ; 
println (y) ; }
