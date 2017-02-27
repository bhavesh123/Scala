import java.io.BufferedReader
import java.io.InputStreamReader
object Main {
    def main(args: Array[String]) {
    
    try{
    val reader = new BufferedReader(new InputStreamReader(System.in))
    var line = reader.readLine()
    val obj = new Palindrome()
    println(obj.findPalindrome(line))      
    }
    catch{
    case e: Exception => e.printStackTrace
    }
    
    }
    }
