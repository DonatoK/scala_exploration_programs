
// Author: Donato Kava, Dated and created: 8/7/2019 
// Scala map and trouple exploration file.

// TODO: figure out how to catch exemptions. 
import scala.io._
import scala.collection.mutable.ArrayBuffer
import scala.util._

// itemCostAndDisocunt: function takes a map of key items string "nameOfItem" and Int value price

// minmax: function that takes and array of values and returns (min,max) pair 
//def itemCostAndDiscount() 

def minmax(values: Array[Int]) : Tuple2[Int,Int] =
{
  val values_max   = values.max
  val values_min   = values.min
  val found_minmax = Tuple2(values_min, values_max)
  found_minmax
}

def randomArray(size: Int) : ArrayBuffer[Int] =
{
  var countUp    = 0
  var varArray   = ArrayBuffer[Int]()
  val randomInts = Random
  while (countUp < size)
    {
    varArray += randomInts.nextInt
    countUp  += 1
    }
  varArray
}


//small UI for map and truple function demos
var run_UI = "run"
//////////////////////
//   " in printf   //
////////////////////
printf( "Enter \"1\" to use (Item, Cost), Discount function. \n enter \"2\" to return an array of random numbers and its min and max numbers \n" )
val selection = StdIn.readLine().toInt

if(selection == 1)
{
  printf( " Enter the number of items names, and their names \n comma seperated by their values. ex: \"name\" 1. Then the percent discounted. \n " ) 
  while (run_UI != "quit")
  {
    printf("  How many items with values are there? ")
    val how_Many_Items = StdIn.readLine().toInt
    /////////////////////
    //   Blank Map     //
    /////////////////////
    var maped_items = Map[String,Double]()
    for ( i <- 0 until how_Many_Items)   
    {  
      val user_input_key     = StdIn.readLine("Enter an item name as a string ")
      val user_input_value   = StdIn.readLine("Enter the items price ").toDouble
    
      maped_items = maped_items + ((user_input_key, user_input_value)) 
    }
  
    val user_input_percent = StdIn.readLine("enter percent as integer ").toInt.toDouble // TODO: make sure this isnt because of a typo earlier.
    for(k <- maped_items.values) println(k * user_input_percent/100 )
    printf("Enter \"quit\" to exit or anything else to repeat ")
    run_UI = StdIn.readLine().toString
  }
}

if (selection == 2)
{
  val array_size = StdIn.readLine("How many numbers in the array? \n").toInt
  val selected_array = randomArray(array_size)
  val arrays_minmax  = minmax(selected_array.toArray)

  println(s"The returned Array was " + selected_array.mkString( "<", ", ", ">" ))
  println(arrays_minmax)
} 

