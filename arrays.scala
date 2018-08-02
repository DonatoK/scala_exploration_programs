import scala.collection.mutable.ArrayBuffer
// randomArray: varible array of size 0 to n filled with random numbers. wanted to return the array but it
                  prints it terminal.


def randomArray(size: Int)
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

}

val printArray = randomArray(3)
//println(s" 3 random Numbers:  ")      ***planned but did not work***
//for( i <- 0 until printArray.length)
//  println(s"$i: ${printArray(i)}")

