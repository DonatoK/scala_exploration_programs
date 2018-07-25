// playing with functions in scala

import scala.io._
// function 1: signum function, returns if a entered number is postive, 0, or negitive

//used a while loop to do for(i=10, i>=0; i--) to repeat signum function

//writing a procedure which returns nothing and counts down form 10

var repeat_limit = 10

def signum(x: Int) = 
			if (x<0)	
			"negitive"		
			else if(x == 0)
			"zero"
			else if (x>=1)
			"positive"

def countdown(n: Int)
{


}

while(repeat_limit>=0)
{

  val display_message = StdIn.readLine(repeat_limit+" enter a number: ").toInt
  val result = signum(display_message)
  println(s" The significant number is " + result)
  repeat_limit -= 1
}
