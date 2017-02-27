/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

class Palindrome {

 def findPalindrome(line:String) : String = {    
        val buffer = new StringBuilder(line);
		var data:Array[Char] = buffer.toString().toCharArray();
		var k:Int = 0;
		var length:Int = data.length;
		var i :Int = 0;
                for(i <- 0 to length){
                  if(data(i) != data(length-1-i)){
                    return "NO"
                  }
                  
                  if(k == data.length -1){
                    return "YES"
                  }
                  
                  k+=1
                }
 
                return ""
 }
}
