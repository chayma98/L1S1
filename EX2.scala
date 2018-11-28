import scala.io.StdIn;
object exor2 extends App {
  val MAX = 40;
  var c: Array[Char] = Array.ofDim(MAX);
  def saisie(n: Int, c: Array[Char]) {
    var i: Int = 0;
    for (i <- 0 to n - 1) {
      println("En t re r l e c a r a c t e r e pour l a c a s e " + i);
      c(i) = io.StdIn.readChar();
    }
  }
  def affiche(n: Int, c: Array[Char]) {
    var i: Int = 0;
    for (i <- 0 to n - 1) {
      print(c(i) + " ");
    }
  }
  def voyelle(n: Int, c: Array[Char]) {
    var f: Boolean = false;
    var nc, s, i: Int = 0;
    for (i <- 0 to n - 1) {
      f = false;
      if ((c(i) == 'O') || (c(i) == 'I') || (c(i) == 'Y') || (c(i) == 'A') || (c(i) == 'E') || (c(i) == 'U')) {
        f = true;
        s = s + 1;
        nc = n - s;
      }
      if (f == true) { println(c(i), "est une voyelle"); }
    }
    println(s, "estle nombre des voyelles", nc, "est le nombre des caractères et consonnes");
  }
  
  var i, nb: Int = 0;
  var f: Boolean = false;
  println(" En t rez l e nombre de c a r a c t e r e s du t a bl e a u : ");
  nb = io.StdIn.readInt();
  saisie(nb, c);
  affiche(nb, c);
  voyelle(nb, c);

}
