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

// Regex examples from book to build off of
// Ex.1
// for(matchstring <- regexPattern.findAllIn("filename or array") // example uses a given string
// Ex.2
// regexPattern.findFirstIn("string")
// Ex.3
// regexPattern.replaceSomeIn("string", 
//              m => if (m.matched.toInt %2 == 0) some ("define replace") else None)

// starting with opening a file and writing it to terminal.
    import scala.io.Source
    import java.io.PrintWriter
    import scala.util.matching.Regex 

// value to hold the output file
    val outFile = new PrintWriter("example.txt")

// Timing begins
    val startTime = System.nanoTime // runtime =  endtime(ns)  - starttime(ns)
                                    //           -----------------------------
                                    //                       (10^9)  
// regex pattern
val regexPattern = """\sSMT\s+""".r // Matches the letters SMT seperated by spaces  TODO: Update if over or under matching

// value holding file
    val myFile = Source.fromFile("Old_Proteus_Master Design - CADCAM READ-ME.TXT")

// place file lines into an array
// TODO: TIMING: See if placing in an array is needed
    val fileArray =  myFile.getLines.toArray

// Search the created arry
   for( i <- 0 until fileArray.length-1)
       {
        // println(s"${fileArray(i)}")

        // Each line check if it the regex matches, print to terminal and file
        if(regexPattern.findFirstIn(s"${fileArray(i)}").isDefined)
        {
          println(s"${fileArray(i)}")
          // TODO: make a count and at the end print the number of times this happens
          outFile.println(s"${fileArray(i)}")  //output the regex matched lines to a file 
        }
       }

// DISABLED same file but backwards, ENABLE during timing
/*    for (i<- fileArray.length -1 to 0 by -1)
      println(s"${fileArray(i)}")

    outFile.close()
    myFile.close() // see if this should be higher
*/

// Finish Timing
// TODO: add condtional check here for no passed parameters
//        needed for setting up conditional timing 
//   println("the other arg, " + args(0)) // remove to stop needed cmdline args 

    val prog_Run_Time = (System.nanoTime - startTime) / 1e9d

    println(s" Total runtime was ${prog_Run_Time} s")


// Total Runtime Pre Regex search.
//  0.060689796 s
// Total Runtime with finding lines containing SMT
//  0.048331443 s // shorter probaly due to small file size, try averaging or a larger file


