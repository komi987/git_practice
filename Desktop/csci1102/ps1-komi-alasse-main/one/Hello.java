/* file: Hello.java
   author: Bob Muller

   CSCI 1102 Computer Science 2

   Run:
   > javac Hello.java
   > java Hello Name
*/

import edu.princeton.cs.algs4.StdRandom;

public class Hello {

    public static void main(String[] args) {
        String name = StdRandom.uniform(2) == 1 ? "Maya" : "Cleo";
        System.out.format("Hello %s!", name);
    }
}
