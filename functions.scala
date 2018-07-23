// playing with functions in scala

import scala.io._
// function 1: signum function, returns if a entered number is postive, 0, or negitive

val display_message = StdIn.readLine("enter a number: ").toInt	

def signum(x: Int) = 
			if (x<0)	
			"negitive"		
			else if(x == 0)
			"zero"
			else if (x>=1)
			"positive"
			 
val result = signum(display_message)
println(s" The significant number is " + result)
