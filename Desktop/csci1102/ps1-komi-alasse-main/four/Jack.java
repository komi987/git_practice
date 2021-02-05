/* file: Jack.java
   author: Bob Muller

   CSCI 1102 Computer Science 2

   Run:
   > javac Jack.java
   > java Jack 5
*/

public class Jack {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
        int repeats = 0;
        while (repeats < number) {
            System.out.println("All work and no play makes Jack a bad boy");
            repeats++;
        }
    }
}

