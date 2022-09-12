package org.bcit.comp2522.lectures.sl02;

import processing.core.PApplet;
import org.bcit.comp2522.lectures.sl02.Circle;
/*
SOLID
Single Responsibily
Open-Closed
Liskov Sub
Interface Segregation
Dependency Inversion
 */


public class Main {
  public static void main(String[] args) {
    ProcessingWindow window = new ProcessingWindow();
    // add shapes here

    String[] processingArgs = {"ProcessingWindow"};
    PApplet.runSketch(processingArgs, window);
  }
}