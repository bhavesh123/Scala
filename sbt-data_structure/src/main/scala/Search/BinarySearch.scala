package Search

/**
  * Created by bhavesh on 4th-jan-2017
  */
class BinarySearch(name:String) extends BasicSearch{

  var names:String = name;

  @Override
  def setName(name:String): Unit ={
    this.names = "Binary search is here";
  }

  @Override
  def getName(): String = return this.names




}
