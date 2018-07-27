// playing with functions in scala

import scala.io._
import scala.Char._
// function 1: signum function, returns if a entered number is postive, 0, or negitive

// used a while loop to do for(i=10, i>=0; i--) to repeat signum function

// writing a procedure which returns nothing and counts down from a given value.i

// stringAddder: function  to add the integer values of an input string. size of string

var repeat_limit = 10

def signum(x: Int) = 
			if (x<0)	
			"negitive"		
			else if(x == 0)
			"zero"
			else if (x>=1)
			"positive"

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




while(repeat_limit>=0)
{
  val display_message = StdIn.readLine(repeat_limit+" enter a number: ").toInt
  val result = signum(display_message)
  println(s" The significant number is " + result)
  repeat_limit -= 1
}

countdown(5)
val hello_value = stringAdder("Hello")
println(s" hello equals" + hello_value)

