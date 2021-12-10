package com.company;

public class Sphere extends ThreeDimensionalShape {

  public Sphere(double d1) {
    super(d1);
  }

  private double sphereArea = 4 * (Math.pow(getDimOne(), 2) * Math.PI);
  private double sphereVolume = Math.PI * 4/3 * Math.pow(getDimOne(), 3.0);


  public double getArea() {
    return sphereArea;
  }

  public double getVolume() {
    return sphereVolume;
  }

  public String toString()	{
    return " radius: " + getDimOne();
  }
}

