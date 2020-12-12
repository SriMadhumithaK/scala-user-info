  


  object Functional{
    def main(args: Array[String]){
        inc.apply(3) 
        println(inc(3))
    }

    val inc = new Function1[Int, Int] {
    override def apply(arg: Int): Int = arg + 1
  }

  
}