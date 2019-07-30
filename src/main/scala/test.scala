import datastruct._

object Test extends App {

  var ll = new LinkedList[String]()
  ll.add("eoin")
  ll.add("Susan")
  ll.add("RoRo")
  ll.add("Olie")
  ll.printAll()

//  val table = new HashTable[(String, Int)]()
 // table.add("susan", 123) 
  //table.add("eoin", 456)
  //table.add("olan lane", 789)
  //table.add("ronan", 111)                                       
  println("hi")         

  //table.add("susan", 123) 
  //table.add("eoin", 456)

  case class Thing(name:String, number:Int){ override def toString = name}

  val table = new HashTable[Thing]

  val eoin = Thing("eoin", 123)

  table.add(eoin)
}
