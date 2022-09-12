package org.bcit.comp2522.lectures.solution.b;

import org.bcit.comp2522.lectures.solution.b.Circle;
import org.bcit.comp2522.lectures.solution.b.ProcessingWindow;
import org.bcit.comp2522.lectures.solution.b.Square;
import processing.core.PApplet;

public class Main {
  public static void main(String[] args) {
    ProcessingWindow window = new ProcessingWindow();

    Circle c1 = new Circle(window, 100f, 100f, 50f);
    Circle c2 = new Circle(window, 100f, 100f, 50f);
    Circle c3 = new Circle(window, 300f, 100f, 50f);

    window.addShape(c1);
    window.addShape(c2);
    window.addShape(c3);

    Square s1 = new Square(window, 200f, 200f, 50f);
    window.addShape(s1);

    boolean c1c2 = c1.equals(c2);
    boolean c1c3 = c1.equals(c3);
    String c1String = c1.toString();
    String c2String = c2.toString();
    String c3String = c3.toString();
    System.out.format("\t%s \n\tequals \n\t%s \n\t== %b\n\n", c1String, c2String, c1c2);
    System.out.format("\t%s \n\tequals \n\t%s \n\t== %b\n\n", c1String, c3String, c1c3);

    String[] processingArgs = {"ProcessingWindow"};
    PApplet.runSketch(processingArgs, window);
  }
}