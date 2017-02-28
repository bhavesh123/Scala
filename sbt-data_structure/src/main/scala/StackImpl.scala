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

  def pop(): String = {
    if (data.isEmpty) {
      return "No Food"
    }
    var k = data.pop();
    return k.toString;

  }

  def push(i: Integer): Unit = {
    data.push(i)
  }
  /**
   * @param args the command line arguments
   */
  def main(args: Array[String]): Unit = {
    var br = new BufferedReader(new InputStreamReader(System.in));
    var line = br.readLine();
    var input = Integer.parseInt(line);
    var inputs = new Array[String](input);
    var i: Integer = 0
    for (i <- 0 until input) {
      inputs(i) = br.readLine();
      var splitdata: Array[String] = inputs(i).split(" ");
      if (Integer.parseInt(splitdata(0)) == 1) {
        println(pop);
      } else if (Integer.parseInt(splitdata(1)) == 2) {
        var value: Integer = Integer.parseInt(splitdata(1));
        push(value)
      }
    }
  }
}
