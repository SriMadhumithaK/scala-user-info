class Rational(x: Int, y: Int) {
  var a = x
  var b = y
  
  def add():Int = a+b    
    
}


object ObjectOrient{
    def main(args: Array[String]){
      val calc = new Rational(1,2)
      println(calc.add())
    }
}

