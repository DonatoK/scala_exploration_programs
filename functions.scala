// Introduction to functions in scala

import scala.io._
import scala.Char._
import scala.collection.immutable._
import scala.util._

// Function 1: signum function, returns if a entered number is postive, 0, or negitive

// Used a while loop to do for(i=10, i>=0; i--) to repeat signum function

// Writing a procedure which returns nothing and counts down from a given value.i

// stringAddder: Function  to add the integer values of an input string. size of string

// stringProduct: Function to produce the product of all the valude in a string.

// stringProductLoopless: Same as stringProduct but with no loop. tried stringOps but the result is weird.

// xToPower: Function to print x to the n. recursion overflows idk why. 


def xToPower(power :Int, x: Int): Int =
{
  if(power == 0) 1

  if (power >0)
    { 
    if(power % 2 == 0)  
      {
	xToPower(power/2, x) * xToPower(power/2,x) 
      }
    else 
      {
	x * xToPower(power-1, x)
      }      
    }
  else
    {
      1/xToPower(-power, x)
    }
}

def signum(x: Int) = 
			if (x<0)	
			"negitive"		
			else if(x == 0)
			"zero"
			else if (x>=1)
			"positive"

///////////////
// PROCEDURE //
///////////////
def countdown(start: Int)
{
  var counter = start
  while (counter >= 0)
  {
    println(s" Program end " + counter)
    counter -= 1 
  }  
}

def stringAdder(inputString: String) =
{
			val charArry = inputString.toCharArray
			var sum      = 0
			for(i <- 0 to inputString.length -1)
			{		
			  sum += char2int(charArry(i)) 
			} 
			sum			
}

def stringProduct(inputString: String) =
{
                        val charArry = inputString.toCharArray
                        var product      = 1
                        for(i <- 0 to inputString.length -1)
                        {               
                          product = product * char2int(charArry(i))
                        } 
                        product
}

def stringProductLoopless(inputString: String) =
{
                        val stringOpper = new StringOps(inputString)
                        val product     = stringOpper.product
   			product.toInt	 
                        product
}


// Calls for functions for tesing operation.

var repeat_limit = 2

while(repeat_limit>=0)
{
  val display_message = StdIn.readLine(repeat_limit+" enter a number: ").toInt
  val result = signum(display_message)
  println(s" The significant number is " + result)
  repeat_limit -= 1
}

countdown(5)
val hello_value = stringAdder("Hello")
println(s" hello equals  " + hello_value)
val hello_value2 = stringProduct("Hello")
println(s" hello equals " + hello_value2)
val hello_value3 = stringProductLoopless("Hello")
println(s" hello equals " + hello_value3)
//val x2PowerCheck = xToPower(1,1)                 ***does not work**
//println(s" xToPower returned: " + x2PowerCheck)  *****************
