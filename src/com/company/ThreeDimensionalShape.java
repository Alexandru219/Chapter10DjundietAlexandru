package com.company;

public abstract class ThreeDimensionalShape extends Shape {

  public ThreeDimensionalShape(double d1) {
    super(d1);
  }

  public ThreeDimensionalShape (double d1, double d2, double d3)	{
    super(d1, d2, d3);
  }

  public abstract double getArea();
  public abstract double getVolume();
}
