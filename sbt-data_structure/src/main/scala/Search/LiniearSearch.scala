package Search

/**
  * Created by root on 3/1/17.
  */
class LiniearSearch(name:String) extends BasicSearch{

  var names:String = name;
  @Override
  def setName(name:String): Unit ={
    this.names = "Liniear Search is here";
  }

  @Override
  def getName(): String = return this.names
}
