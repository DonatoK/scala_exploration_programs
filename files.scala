// scala file manulipation exploration
//

// fileFlip: Function to reverse a file
//
//


// starting with opening a file and writing it to terminal.
import scala.io.Source

val myFile = Source.fromFile("Old_Proteus_Master Design - CADCAM READ-ME.TXT")

val printTry =  myFile.getLines.toArray

for( i <- 0 until printTry.length-1)
  println(s"${printTry(i)}")

myFile.close()
