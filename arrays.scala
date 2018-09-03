// Author: Donato Kava, Dated 8/7/2019
// Scala array exploration file.

import scala.collection.mutable.ArrayBuffer
import scala.util._

// randomArray: Determine varible array of size 0 to n filled with random numbers. 

// arraySwapAdjenct: Loop swaps adjenct values in an passed array

// arrayPosNeg: Creates new array when given array of integers with positive original 
//                ordered numbers followed by negitive original ordered numbers.  

// ArrayAverage: Returns average of an array of doubles

// ArrayInReverse: Returns a giveninteger array in reverse sorted order
// ArrayInReverseBuffer: Minor needed to take a buffer array.

// ArrayReverseUnsorted: Returns a given array in reverse unsorted.

// ArrayNoDuplicates: Returns given integer array with duplicates removed. 
//  	    	        look in scaladoc

// ArrayOnlyOneNeg: Returns an integer array buffer from 
//		      a given integer arrayBuffer with only its first negitve. 
//                    requires ArrayInReverseBuffer

// ArrayTimeZones: Procedure that makes a collection of times that are in america 
//                   sorted with the "america/" prefix removed.

def randomArray(size: Int) : ArrayBuffer[Int] =
{
  var countUp    = 0
  var varArray   = ArrayBuffer[Int]()
  val randomInts = Random
  while (countUp < size)
    {
    ////////////////////////
    ///add to buffer Array//
    ///////////////////////
    varArray += randomInts.nextInt
    countUp  += 1
    }
  // printing here works as a procedure.
  //  for( i <- 0 until varArray.length)
  //    println(s"$i: ${varArray(i)}")
  varArray
}

def arraySwapAdjenct(inputArray: Array[Int]): Array[Int] =
{
//  val result = for (elem <- inputArray) yield elem *2        *** trying using yield***
//  val result = for (elem <- inputArray if elem % 2 == 0)    ***    not working ***
  
  //  Loop method
  val i = 0
  for (i <- 0 until inputArray.length-1)
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
  output   ++= negitives
  output  
}

def arrayAverage (inputArray: Array[Double]): Double =
{
  val arraySum      = inputArray.sum
  val outputAverage = arraySum/inputArray.length
  outputAverage
}

def arrayInReverse(inputArray: Array[Int]): Array[Int]=
{
 // val sortBuffer         = inputArray.sorted ** Buffer Array sort **
 Sorting.quickSort(inputArray) // **Array sort** 
 val reverseSortedArray = inputArray.sortWith(_>_)
 reverseSortedArray
}

def arrayInReverseBuffer (inputArray: ArrayBuffer[Int]): ArrayBuffer[Int]=
{
  val sortBuffer         = inputArray.sorted //** Buffer Array sort **
 //Sorting.quickSort(inputArray) // **Array sort**
 val reverseSortedArray = sortBuffer.sortWith(_>_)
 reverseSortedArray
}

def ArrayReverseUnsorted (inputArray: Array[Int]): ArrayBuffer[Int]=
{
   
  val reversedArray = ArrayBuffer[Int]()
  //for (i <- inputArray.indicies.reverse)
   for (i <- inputArray.length -1 to 0 by -1) 
    {
    reversedArray += inputArray(i)
    }
  reversedArray

}
def arrayNoDuplicates (inputArray: Array[Int]): Array[Int] =
{
  val removedDuplicates = inputArray.distinct
  removedDuplicates
}

def arrayyOnlyOneNeg( inputArray: ArrayBuffer[Int]): ArrayBuffer[Int] =
{
  val negitiveValuePosition = ArrayBuffer[Int]()
  
  // Accomplishing this by looping over the array and recording the position.
  for( i <- 0 until inputArray.length)
  { // Loop over array and record negitive value positions
    if(inputArray(i) < 0)
    {
      negitiveValuePosition += i    
    }
  }
  // remove first negitive postion from array of negitive positions
  negitiveValuePosition.remove(0)
  
  // reverse order of negitive positon array 
  val removePositions = arrayInReverseBuffer (negitiveValuePosition)
  
  // remove negitives
  for(i <- 0 until removePositions.length)
  {
    inputArray.remove(removePositions(i))
  }
  val returnArray = inputArray
  returnArray
}

def arrayTimeZones () 
{
  //string array 
  val TimeZoneValues = java.util.TimeZone.getAvailableIDs
  // figureout how to seperate out america/
  for(i <- 0 until TimeZoneValues.length)
  {
    if(TimeZoneValues(i).startsWith("America"))
    {
      
     // println(s"$i: ${TimeZoneValues(i)}") 
    }
  }

}
// function testing calls

////////////////
//static Array//
////////////////

val printArray = randomArray(3)
println(s" 3 random Numbers:  ")     

for( i <- 0 until printArray.length)
  println(s"$i: ${printArray(i)}")

val mixup = Array(1,2,3,4,5,6)
val printArray2 = arraySwapAdjenct(mixup)

println(s" returned array values:  ")
//////////////////
//  Loop Print  //
//////////////////
for( i <- 0 until printArray2.length)
  println(s"$i: ${printArray2(i)}")

val mixedSigned = Array(1,-1,2,-6,-3,-2)
val printArray3 = arrayPosNeg(mixedSigned)
//////////////////
// 1 Line Print //
//////////////////
println(s"the average of the Array was " + printArray3.mkString( "<", ", ", ">" ))

val doubleArray = Array(1.0, 2.0)
val printArray4 = arrayAverage(doubleArray)

println(s"the average of the Array was " + printArray4)


val reverseOrderThis  = Array(2,4,5,1,3) 
val printArray5_1 = arrayInReverse(reverseOrderThis)

println(s"Reverse sorted Array was " + printArray5_1.mkString( "<", ", ", ">" ))

// resue reverse order this
val reverseOrderThis_2  = Array(2,4,5,1,3)
val printArray5_2  = ArrayReverseUnsorted(reverseOrderThis_2)
println(s"Reverse unsorted Array was " + printArray5_2.mkString( "<", ", ", ">" ))


val duplicates  = Array(1,1,1,1,2,4,3,4,5)
val printArray6 = arrayNoDuplicates(duplicates)

println(s"Duplicates removed  " + printArray6.mkString( "<", ", ", ">" ))

///////////////////
// Buffer Arrays //
///////////////////

val buffer =  ArrayBuffer[Int](-1,11,1,-2,4,-3,4,5)
val keepFirstNeg = buffer //renaming
val printArray7 = arrayyOnlyOneNeg(keepFirstNeg)

println(s"keeping only the first negitive  " + printArray7.mkString( "<", ", ", ">" ))

arrayTimeZones()
