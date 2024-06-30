object question19 {
  def main(args: Array[String]): Unit = {
    var sum = 0
    for(i<-5 to 102){

      sum = sum + (i*i)
      println(s" the number is $i and sum is $sum")
    }
  }
}
