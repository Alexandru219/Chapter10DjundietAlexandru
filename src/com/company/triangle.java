package com.company;

public class triangle extends TwoDimensionalShape {

  //2 arg constructor
  public triangle(double d1, double d2) {
    super(d1, d2);
  }

  private double triangleArea = getDimOne() * getDimTwo() * 0.5;

  public double getArea()	{
    return triangleArea;
  }


  public String toString(){
    return " base: " + getDimOne() + " height: " + getDimTwo();
  }
}
