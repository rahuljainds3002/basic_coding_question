object question13 {
  def main(args: Array[String]): Unit = {
    var b= 0
    for(i<-20 to 140){
      var c = i%2
      if(c==0){
        if(b==0){
          println(i)
          b=1
        }
        else{b=0}
      }
    }
  }

}
