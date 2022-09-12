package org.bcit.comp2522.lectures.sl02;

import org.bcit.comp2522.lectures.sl02.Circle;
import processing.core.PApplet;

import java.util.ArrayList;

public class ProcessingWindow extends PApplet {
  ArrayList<Circle> circles;

  public ProcessingWindow() {
    this.circles = new ArrayList<Circle>();
  }

  public void settings() {
    size(500, 500);
  }

  public void addCircle(Circle c) {
    circles.add(c);
  }

  public void draw() {
    for (Circle c : circles) {
      c.draw();
    }
  }
 }