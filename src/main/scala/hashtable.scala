package datastruct

class HashTable[A] {

    //  First, compute the key's hash code, which will usually be an int or long. Note that two different keys could have the same hash code, as there may be an infinite number of keys and a finite number of ints.
    //  2. Then, map the hash code to an index in the array. This could be done with something like hash (key) % array_length. Two different hash codes could, of course, map to the same index.
    //  3. At this index, there is a linked list of keys and values. Store the key and value in this index. We must use a linked list because of collisions: you could have two different keys with the same hash code, or two different  hash codes that map to the same index.

    // create an array with an initial size
    // val fruits = new Array[String](3)
    var hashtable = Array.ofDim[LinkedList[A]](10)

    def add(elem:A) {
      val hash1 = hashCode(elem.toString)
      val array_index1 =  hash1 % hashtable.size
      println(array_index1)
      hashtable(array_index1) = new LinkedList[A]()
      hashtable(array_index1).add(elem)
    }

    def hashCode(thiz: String): Int = {
      var res = 0
      var mul = 1 // holds pow(31, length-i-1)
      var i = thiz.length-1
      while (i >= 0) {
        res += thiz.charAt(i) * mul
        mul *= 31
        i -= 1
      }
      res
    }
}
