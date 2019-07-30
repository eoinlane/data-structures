import datastruct._

object Test extends App {

  var ll = new LinkedList[String]()
  ll.add("eoin")
  ll.add("Susan")
  ll.add("RoRo")
  ll.add("Olie")
  ll.printAll()

  val table = new HashTable[(String, Int)]()
  table.add("Susan", 123) 
  table.add("eoin", 456)
  table.add("Olan Lane", 789)
  table.add("Ronan", 111)                                       
  println("hi")         
}
