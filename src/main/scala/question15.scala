object question15 {
  def main(args: Array[String]): Unit = {
    for(i<-2 to 16)
    {
      var a = i+1
      var b = i*(i+1)
      println(s"$i * $a")
      println(s"multiplication number of $i * $a  = $b")
    }

  }

}
