package org.bcit.comp2522.lectures.solution.a;

import org.bcit.comp2522.lectures.sl02.Square;

public class Circle {
    private float xpos;
    private float ypos;
    private float diameter;
    private ProcessingWindow window;

    public Circle(ProcessingWindow window, float x, float y, float diameter) {
      this.window = window;
      this.xpos = x;
      this.ypos = y;
      this.diameter = diameter;
    }

    public void draw() {
      window.rect(this.xpos, this.ypos, diameter, diameter);
    }

    public float getX() {
      return this.xpos;
    }

    public float getY() {
      return this.ypos;
    }

    public void setX(float x) {
      this.xpos = x;
    }

    public void setY(float y) {
      this.ypos = y;
    }

    public boolean equals(Circle b) {
      boolean sameX = this.xpos == b.xpos;
      boolean sameY = this.ypos == b.ypos;
      boolean sameDiameter = this.diameter == b.diameter;
      if (sameX && sameY && sameDiameter) {
        return true;
      }
      return false;
    }

    public int hashCode() {
      int hash = (int) (this.xpos + this.ypos + this.diameter);
      return hash;
    }

    public String toString() {
      String s = String.format("Circle X:%f; Y:%f, D:%f", this.xpos, this.ypos, this.diameter);
      return s;
    }

}
