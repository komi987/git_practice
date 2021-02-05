/******************************************************************************
 *  Compilation:  javac-algs4 TestAlgs4.java
 *  Execution:    java-algs4 TestAlgs4
 *  Dependencies: StdDraw.java
 *                https://algs4.cs.princeton.edu/mac/cover.jpg
 *
 *  Draws a blue bullseye and textbook graphic.
 *
 ******************************************************************************/

import edu.princeton.cs.algs4.StdDraw;

import java.awt.*;

public class TestAlgs4 {
    public static void main(String[] args) {

        StdDraw.setScale(-1, 1);
        StdDraw.clear(StdDraw.BLACK);

        // draw the bullseye
        StdDraw.setPenColor(StdDraw.BOOK_BLUE);
        StdDraw.filledCircle(0, 0, 0.9);
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.filledCircle(0, 0, 0.8);
        StdDraw.setPenColor(StdDraw.BOOK_BLUE);
        StdDraw.filledCircle(0, 0, 0.7);
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.filledCircle(0, 0, 0.6);

        // write some text
        StdDraw.setPenColor(StdDraw.WHITE);
        Font font = new Font("Arial", Font.BOLD, 60);
        StdDraw.setFont(font);

        StdDraw.text(0.0, 0.0, "Hello " + String.format(args[0] + "!"));
    }
}
