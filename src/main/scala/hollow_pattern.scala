object hollow_pattern {
  def main(args: Array[String]): Unit = {
    for(i<-1 to 4 ){
      for(j<-1 to 6){
        if(i==1||i==4) {
          print("*")
        }
        if(i==2||i==3){
          if(j==1||j==4){print("*")}
          else{print(" ")}
        }
      }
      println()
    }
  }

}
