package main

import scala.io.Source

class DataGen {

 object DaraGen {
  def main(args: Array[String]): Unit = {

    val a = Compare.data("C:\\Users\\User\\Desktop\\data1.txt")

    println(a)
  }

}
}


/*
Map(LocalMechine\Test\Node1 ->  "reg1":"value1" "reg2":"value2" , LocalMechine\Test\Node2 ->  "reg3":"value3" "reg4":"value4")
Map(LocalMechine\Test\Node1 -> Map("reg1" -> "value1", "reg2" -> "value2"), LocalMechine\Test\Node2 -> Map("reg3" -> "value3", "reg4" -> "value4"))*/
