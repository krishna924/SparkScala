package main
import scala.io.Source


object Compare {


   def data (path : String) : Map[String, Map[String,String]] = {

    val s1 = Source.fromFile(path).getLines().filter(!_.isEmpty()).mkString(" ")

    val i1 = s1.split('[').drop(1)
      .map(_.split(']') )
      .map{case Array(k,v) => (k.substring(0, k.length), v.substring(0, v.length))}
      .toMap

    val f1 = i1.map{
      case (k,v) => (k, v.trim.split(' ').map(_.split(':'))
        .map{case Array(a,b) => (a.substring(0,a.length), b.substring(0,b.length))}.toMap)}

    f1
  }

 // def main(args: Array[String]): Unit = {

/*
// C:\Users\User\Desktop\data.txt
    val s2 = Source.fromFile("C:\\Users\\User\\Desktop\\data1.txt").mkString
    val s1 = Source.fromFile("C:\\Users\\User\\Desktop\\data1.txt").getLines().filter(!_.isEmpty()).mkString(" ")


    val test = "Hello World"

    val i1 = s1.split('[').drop(1)
      .map(_.split(']') )
      .map{case Array(k,v) => (k.substring(0, k.length), v.substring(0, v.length))}
      .toMap
    val f1 = i1.map{
    case (k,v) => (k, v.trim.split(' ').map(_.split(':'))
                  .map{case Array(a,b) => (a.substring(0,a.length), b.substring(0,b.length))}.toMap)}
    println(i1)
    println(f1)
*/







}
//List(LocalMechine\Test\Node1] "reg1":"value1" "reg2":"value2" , LocalMechine\Test\Node2] "reg3":"value3" "reg4":"value4")