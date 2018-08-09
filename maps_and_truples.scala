
// Author: Donato Kava, Dated and created: 8/7/2019 
// Scala map and trouple exploration file.

import scala.io._


// itemCostAndDisocunt: function takes a map of key items string "nameOfItem" and Int value price
 
//def itemCostAndDiscount() 

//small UI for map and truple function demos
var run_UI = "run"
//////////////////////
//   " in printf   //
////////////////////
printf( "Enter \"1\" to use (Item, Cost), Discount function. \n")
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
  
  val user_input_percent = StdIn.readLine("enter percent as integer ").toInt.toDouble
  for(k <- maped_items.values) println(k * user_input_percent/100 )
  printf("Enter \"quit\" to exit or anything else to repeat ")
  run_UI = StdIn.readLine().toString
}
