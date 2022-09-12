package org.bcit.comp2522.lectures.solution.a;

public class Square {
  private ProcessingWindow window;
  private float width;
  private float xpos;
  private float ypos;

  public Square(ProcessingWindow window, float x, float y, float width) {
    this.window = window;
    this.xpos = x;
    this.ypos = y;
    this.width = width;
  }

  public void draw() {
    window.rect(this.xpos, this.ypos, this.width, this.width);
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

  public boolean equals(Square b) {
    boolean sameX = this.xpos == b.xpos;
    boolean sameY = this.ypos == b.ypos;
    boolean sameDiameter = this.width == b.width;
    if (sameX && sameY && sameDiameter) {
      return true;
    }
    return false;
  }

  public int hashCode() {
    int hash = (int) (this.xpos + this.ypos + this.width);
    return hash;
  }

  public String toString() {
    String s = String.format("Circle X:%f; Y:%f, D:%f", this.xpos, this.ypos, this.width);
    return s;
  }
}
