package org.bcit.comp2522.lectures.solution.b;

public class Square extends Shape {
  public Square(ProcessingWindow window, float xpos, float ypos, float size) {
    super(window, xpos, ypos, size);
  }

  public void draw() {
    window.rect(this.xpos, this.ypos, this.size, this.size);
  }
}
