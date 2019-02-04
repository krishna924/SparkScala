package main

object mainrun {

  def main(args: Array[String]): Unit = {
 //   val x1 = args(0)
 //   val x2 = args(2)

    val a = Compare.data("C:\\Users\\User\\Desktop\\data1.txt")
    val b = Compare.data("C:\\Users\\User\\Desktop\\data2.txt")
    println(a)
    println(b)
/*    val c = a -- b.keySet
    println(c)
    val d = b -- a.keySet
    println(d)

    //println(a.keySet)
    println((a.toSet diff b.toSet) )*/

    a.keys.foreach{
      x => if(b.contains(x)) (x) else println("The missing nodes : "+x)
    }

/*    a.keys.foreach{
      x => println(a(x).keys.foreach(y =>  ))
    }*/

    a.keys.foreach {
      x => if(b.contains(x)) {
        a(x).keys.foreach {
          y => if (b(x).contains(y)) (y) else println("The missing node : " + x + " and the missing reg key is : " + y)
        }
    }
    }
// b(LocalMechine\Test\Node1).contains(reg2)

  }

}
