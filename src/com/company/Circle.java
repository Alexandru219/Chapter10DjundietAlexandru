package com.company;

public class Circle extends TwoDimensionalShape {

  public Circle(double d1) {
    super(d1);
  }

  private double circleArea = (Math.pow(getDimOne(), 2) * Math.PI);


  public double getArea()
  {
    return circleArea;
  }


  public String toString()
  {
    return " radius: " + getDimOne();
  }

}
