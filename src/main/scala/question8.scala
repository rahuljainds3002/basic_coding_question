object question8 {
  def main(args: Array[String]): Unit = {
    for (i<-250 to 550){
      var a  = i%11
      if(a==0){println(s"number $i is divisible by 11")}
    }
  }

}
