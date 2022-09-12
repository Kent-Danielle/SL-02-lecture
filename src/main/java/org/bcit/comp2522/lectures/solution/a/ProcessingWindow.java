package org.bcit.comp2522.lectures.solution.a;

import processing.core.PApplet;

import java.util.ArrayList;

public class ProcessingWindow extends PApplet {
  ArrayList<Circle> circles;
  ArrayList<Square> squares;

  public ProcessingWindow() {
    this.circles = new ArrayList<Circle>();
    this.squares = new ArrayList<Square>();
  }

  public void settings() {
    size(500, 500);
  }

  public void draw() {
    strokeWeight(1f);
    for (Circle circle : circles) {
      circle.draw();
    }
    for (Square square : squares) {
      square.draw();
    }
  }

  public void addCircle(Circle c) {
    this.circles.add(c);
  }

  public void addSquare(Square s) {
    this.squares.add(s);
  }
}