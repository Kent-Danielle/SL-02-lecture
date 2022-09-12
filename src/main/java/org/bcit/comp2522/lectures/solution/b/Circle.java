package org.bcit.comp2522.lectures.solution.b;

public class Circle extends Shape{
  public Circle(ProcessingWindow window, float xpos, float ypos, float size) {
    super(window, xpos, ypos, size);
  }

  @Override
  public void draw() {
    window.ellipse(this.xpos, this.ypos, this.size, this.size);
  }
}
