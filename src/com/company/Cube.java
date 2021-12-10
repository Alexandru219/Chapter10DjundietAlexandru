package com.company;

public class Cube extends ThreeDimensionalShape {

  public Cube(double d1) {
    super(d1);
  }

  private double cubeArea = 6 * Math.pow(getDimOne(), 2.0);
  private double cubeVolume = Math.pow(getDimOne(), 3.0);

  public double getArea() {
    return cubeArea;
  }


  public double getVolume() {
    return cubeVolume;
  }


  public String toString() {
    return " length: " + getDimOne();
  }
}
