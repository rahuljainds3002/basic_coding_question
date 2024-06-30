object question4 {
  def main(args: Array[String]): Unit ={
    var a  = 123

    if(a<100||a>1000){ print( s" variable a $a is not a valid number")}
    else {
      var b = a%2
         if(b==0){
           var c = a%3
           print(s"remainder of the result is $c")
         }
         else{var c = a%2
           print(s"remainder of the result is $c")}


  }

}}
