import Search.{BinarySearch, HashTable, LiniearSearch}

/**
  * Created by bhavesh on 4/1/17.
  */
object Main {
  def Apply (kind :String) = kind match {
    case "binary search" => {
      val obj = new BinarySearch("binary search");
       println(obj.getName());
    }

    case "hash table" => {
      val obj = new HashTable("Hash table");
      println(obj.getName());
    }

    case "Liniear search" =>{
      val obj = new LiniearSearch("Liniear search");
      println(obj.getName());
    }
  }

  def main(args: Array[String]) {
    Main.Apply("binary search");
    Main.Apply("hash table");
    Main.Apply("Liniear search")
  }
}