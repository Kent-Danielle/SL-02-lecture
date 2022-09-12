package org.bcit.comp2522.lectures.solution.b;

import org.bcit.comp2522.lectures.solution.b.Circle;
import org.bcit.comp2522.lectures.solution.b.ProcessingWindow;

public class Shape {
  protected ProcessingWindow window;
  protected float xpos;
  protected float ypos;
  protected float size;

  public Shape(ProcessingWindow window, float xpos, float ypos, float size) {
    this.window = window;
    this.xpos = xpos;
    this.ypos = ypos;
    this.size = size;
  }

  public void draw() {};

  public float getX() {
    return xpos;
  }
  public float getY() {
    return ypos;
  }
  public float getSize() {
    return this.size;
  }

  public void setX(float x) {
    this.xpos = x;
  }
  public void setY(float y) {
    this.ypos = y;
  }
  public void setSize(float s) {
    this.size = s;
  }

  public boolean equals(Shape b) {
    boolean sameClass = this.getClass().getSimpleName() == b.getClass().getSimpleName();
    boolean sameX = this.xpos == b.xpos;
    boolean sameY = this.ypos == b.ypos;
    boolean sameDiameter = this.size == b.size;
    if (sameX && sameY && sameDiameter && sameClass) {
      return true;
    }
    return false;
  }

  public int hashCode() {
    int hash = (int) (this.xpos + this.ypos + this.size);
    return hash;
  }

  public String toString() {
    String classname = this.getClass().getSimpleName();
    String s = String.format("%s X:%f; Y:%f, D:%f", classname, this.xpos, this.ypos, this.size);
    return s;
  }
}
