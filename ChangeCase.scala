/* Toggle string problem in scala, changing the case of string from upper to lower & vice-versa in scala */
import java.io.BufferedReader
import java.io.InputStreamReader
object ChangeCase {
    def main(args: Array[String]) {
    val reader = new BufferedReader(new InputStreamReader(System.in))
    var line:String = null
    val final_output = new StringBuffer()
    try{
    line = reader.readLine()
    var output:String = null
    var data:Array[Char] = line.toCharArray()
    for(c:Char <- data){
    val temp = new StringBuilder();
    temp.append(c)
    if(temp.toString().toLowerCase().compareTo(temp.toString()) == 0){
    output = temp.toString().toUpperCase()  
    }
    else{
      output = temp.toString().toLowerCase()
    }
    final_output.append(output);
        }
    println(final_output.toString());
    }
    catch{
    case e: Exception => e.printStackTrace
    }
    }
}
