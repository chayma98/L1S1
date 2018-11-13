

object tp2 extends App {
  import scala.io.StdIn ;
  object exemple_if extends App { 
    var n : Int = 50 ;
    var éval = !false ;
    
   n = 33 
   éval = ( n > 33 ) ;
   éval = (n<33) || (n>5 && n >100 ) ;
   éval = !( éval && (éval  % 2 != 0 ) );
   éval = ! éval || n > 50 ; }
}