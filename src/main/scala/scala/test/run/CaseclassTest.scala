package scala.test.run

import org.apache.spark.sql.SparkSession


// 1,2013-07-25 00:00:00.0,11599,CLOSED

case class Orders(
                 orderid: Int,
                 orderdate: String,
                 ordersuctid : Int,
                 orderstatus : String
                 )

object CaseclassTest {

  def main(args: Array[String]): Unit = {

    val sc = SparkSession.builder.master("local[*]").appName("Spark").getOrCreate()
    val lines = sc.sparkContext.textFile("file:///E://Share//Data//data-master//retail_db//orders")
    import sc.implicits._
    val l = lines.map(a => a.split(",")).map(att => Orders(att(0).trim.toInt,att(1).trim.toString,att(2).trim.toInt,att(3).trim.toString))
    l.take(10).foreach(println)
    val linesdf = l.toDF().as[Orders]
linesdf.show(10)


   /* val res = lines.filter( a => a.split(",")(3) == "COMPLETE")
    res.take(20).foreach(println)
    println("Total completted orders: " + res.count())
*/

  }

}
