
import scala.io.StdIn ;
object exo4 extends App {
    var n : Int = 30 ;
    print ("entrer une valeur entière " ) ;
    if ((n % 2 != 0 ) && (n < 0 ) ) || ((n % 2 = 0) && ((n > 0) && (n < 20)))
    {print ("ok" ) ; }
    else {print ("not ok ") ; }
  }