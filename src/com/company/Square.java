package com.company;

public class Square extends TwoDimensionalShape {

  public Square(double d1) {
    super(d1);
  }

  private double squareArea = getDimOne() * getDimOne();


  public double getArea()
  {
    return squareArea;
  }

  public String toString()
  {
    return " length: " + getDimOne();
  }
}
