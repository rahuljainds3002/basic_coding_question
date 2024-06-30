object question12 {
  def main(args: Array[String]): Unit = {
    var a = 0
    var b = 100
    var cnt = 0
    for(i<-a to b)
      {
        var c = i%2
        if(c==0){ cnt +=1}
      }
      print(s"total number of even numbers bw $a&$b is $cnt")
  }

}

