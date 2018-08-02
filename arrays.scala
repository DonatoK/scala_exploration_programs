import scala.collection.mutable.ArrayBuffer
import scala.util._

// randomArray: varible array of size 0 to n filled with random numbers. 

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
  // printing here works as a procedure.
  //  for( i <- 0 until varArray.length)
  //    println(s"$i: ${varArray(i)}")
  varArray
}

def arraySwapAdjenct 
{

}

val printArray = randomArray(3)
println(s" 3 random Numbers:  ")     
for( i <- 0 until printArray.length)
  println(s"$i: ${printArray(i)}")

