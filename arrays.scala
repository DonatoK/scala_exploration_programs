import scala.collection.mutable.ArrayBuffer
import scala.util._

// randomArray: varible array of size 0 to n filled with random numbers. wanted to return the array but it
//                 prints it terminal.

// arraySwapAdjenct: swaps adjenct values in an array

def randomArray(size: Int) : ArrayBuffer[Int] =
{
  var countUp    = 0
  var varArray    = ArrayBuffer[Int]()
  val randomInts = Random
  while (countUp < size)
    {
    varArray += randomInts.nextInt
    countUp += 1
    }
  // wanted to return this from the function but
  // printing worked.
    for( i <- 0 until varArray.length)
      println(s"$i: ${varArray(i)}")
  varArray
}

val printArray = randomArray(3)
//println(s" 3 random Numbers:  ")         ***planned but did not work***
//for( i <- 0 until printArray.length)
//  println(s"$i: ${printArray(i)}")

