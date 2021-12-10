package com.company;

public abstract class TwoDimensionalShape extends Shape {

  public TwoDimensionalShape(double d1) {
    super(d1);
  }

  public TwoDimensionalShape(double d1, double d2) {
    super(d1, d2);
  }

  public abstract double getArea();
}
