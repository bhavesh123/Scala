import java.io.BufferedReader
import java.io.InputStreamReader
object ChangeCase {
    def main(args: Array[String]) {
    val reader = new BufferedReader(new InputStreamReader(System.in))
    var line:String = ""
    //val final_output = new StringBuffer()
    var final_output:String = "";
    try{
    line = reader.readLine()
    var output:String = ""
    var data:Array[Char] = line.toCharArray()
    /* char class support direct conversion to string , no need for string buffer we can directly append a char to string */
    for(c:Char <- data){
    var temps:String = "";
    temps+=c;
    if(temps.toString().toLowerCase().compareTo(temps.toString()) == 0){
    output = temps.toString().toUpperCase()  
    }
    else{
      output = temps.toString().toLowerCase()
     }
    final_output+=output;
    }
    println(final_output.toString());
    }
    catch{
    case e: Exception => e.printStackTrace
    }
    }
}
