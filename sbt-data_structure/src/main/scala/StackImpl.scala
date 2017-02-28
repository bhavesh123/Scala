/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 Our monk loves food. Hence,he took up position of a manager at Sagar,a restaurant that serves people with delicious food packages. It is a very famous place and people are always queuing up to have one of those packages. Each package has a cost associated with it. The packages are kept as a pile. The job of a manager is very difficult. He needs to handle two types of queries:

1) Customer Query:
When a customer demands a package, the food package on the top of the pile is given and the customer is charged according to the cost of the package. This reduces the height of the pile by 1. 
In case the pile is empty, the customer goes away empty-handed.

2) Chef Query:
The chef prepares a food package and adds it on top of the pile. And reports the cost of the package to the Manager.
Help him manage the process.

Input:
First line contains an integer Q, the number of queries. Q lines follow.
A Type-1 ( Customer) Query, is indicated by a single integer 1 in the line.
A Type-2 ( Chef) Query, is indicated by two space separated integers 2 and C (cost of the package prepared) .

Output:
For each Type-1 Query, output the price that customer has to pay i.e. cost of the package given to the customer in a new line. If the pile is empty, print "No Food" (without the quotes).

Constraints:
1 ≤ Q ≤ 105
1 ≤ C ≤ 107
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.BufferedReader
import java.io.InputStreamReader
import scala.collection.mutable.Stack;
object StackImpl {
  var data = new Stack[Integer]();
 
  def main(args: Array[String]): Unit = {
    var br = new BufferedReader(new InputStreamReader(System.in));
    var line = br.readLine();
    var input = Integer.parseInt(line);
    var inputs = new Array[String](input);
    var i: Integer = 0
    for (i <- 0 until input) {
      inputs(i) = br.readLine()
    }
    for(i<-0 until inputs.length){
      var splitdata: Array[String] = inputs(i).split(" ");
      if (Integer.parseInt(splitdata(0)) == 1) {
          if (data.isEmpty) {
              println("No Food")
          }
          else{
          var k = data.pop();
          println(k);
          }
      } else if (Integer.parseInt(splitdata(0)) == 2) {
        var value: Integer = Integer.parseInt(splitdata(1));
        data.push(value)
      }    
    }
  }
}
