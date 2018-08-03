import scala.collection.mutable.ArrayBuffer
import scala.util._

// randomArray: Determine varible array of size 0 to n filled with random numbers. 

// arraySwapAdjenct: Loop swaps adjenct values in an passed array

// arrayPosNeg: Creates new array when given array of integers with positive original 
//                ordered numbers followed by negitive original ordered numbers.  

// ArrayAverage: Returns average of an array of doubles

// ArrayInReverse; Returns a given integer array in reverse sorted order

// BufferArrayInRevers: Returns an integer arrayBuffer in reverse sorted order

// ArrayNoDuplicates: Returns given integer array with duplicates removed. 
//  	    	        look in scaladoc

// ArrayOnlyOneNeg:  Returns an integer array buffer from 
		       a given integer arrayBuffer with only its first negitve 

// ArrayTimeZones: makes a collection of times that are in america sorted with
 		     the "america/" prefix removed

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

def arraySwapAdjenct(inputArray: Array[Int]): Array[Int] =
{
//  val result = for(elem <- inputArray) yield elem *2        *** trying using yield***
//  val result = for (elem <- inputArray if elem % 2 == 0)    ***    not working ***
  
  //  Loop method
  val i = 0
  for( i <- 0 until inputArray.length-1)
    {
      if((i % 2) == 0)
      { 
        val temp = inputArray(i) 
        inputArray.update(i,inputArray(i+1))
        inputArray.update((i+1), temp) 
      }
    }
  inputArray
}

def arrayPosNeg (inputArray: Array[Int]): Array[Int]=
{
  val positives = for(elem <- inputArray if elem >=0) yield elem 
  val negitives = for(elem <- inputArray if elem < 0) yield elem
  var output = positives
  output ++= negitives
  output  
}

val printArray = randomArray(3)

println(s" 3 random Numbers:  ")     

for( i <- 0 until printArray.length)
  println(s"$i: ${printArray(i)}")

val mixup = Array(1,2,3,4,5,6)
val printArray2 = arraySwapAdjenct(mixup)

println(s" returned array values:  ")

for( i <- 0 until printArray2.length)
  println(s"$i: ${printArray2(i)}")

val mixedSigned = Array(1,-1,2,-6,-3,-2)
val printArray3 = arrayPosNeg(mixedSigned)
//println(s" mixedSigned: " + mixedSigned)       ** find way to print**
//					          **array on 1 line**
println(s" returned positve then negatives:  ")
for( i <- 0 until printArray3.length)
  println(s"$i: ${printArray3(i)}")

