// scala file manulipation exploration
// This script is the groundwork for my file manipulation
// writing to a file.

// Includes timing work
// TODOs:
// 1. see about having the timing on with a script parameter pass
// 2. apply found timing soluion to do timing as an arg passed during compulaiotn
//
//
// Ideas for file processing
// TODOs:
// 1.   output into a new file.                                                                                         FINSIHED
// 3.   print lines wiht SMT in them  
// 3.5  use this to write them into a file					
// 4.   Create new files then try to edit original file, remove a line, remove a word, add a line
// 5.   place File List info into its own file.
//

// fileFlip: Function to reverse a file
//
//


// starting with opening a file and writing it to terminal.
    import scala.io.Source
    import java.io.PrintWriter
// value to hold the output file
    val outFile = new PrintWriter("example.txt")

// Timing begins
    val startTime = System.nanoTime // runtime =  endtime(ns)  - starttime(ns)
                                    //           -----------------------------
                                    //                       (10^9)  

// value holding file
    val myFile = Source.fromFile("Old_Proteus_Master Design - CADCAM READ-ME.TXT")

// place file lines into an array
    val printTry =  myFile.getLines.toArray

// outputs file to terminal and to a file.
   for( i <- 0 until printTry.length-1)
       {
        println(s"${printTry(i)}") 
        outFile.println(s"${printTry(i)}") // first attempt at file writing
       }

// same file but backwards
    for (i<- printTry.length -1 to 0 by -1)
      println(s"${printTry(i)}")

    outFile.close()
    myFile.close() // see if this should be higher

// Finish Timing

    println("the other arg, " + args(0)) 

    val prog_Run_Time = (System.nanoTime - startTime) / 1e9d

    println(s" Total runtime was ${prog_Run_Time} s")
