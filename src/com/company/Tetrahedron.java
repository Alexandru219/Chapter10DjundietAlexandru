package com.company;

public class Tetrahedron extends ThreeDimensionalShape{

  public Tetrahedron (double d1)	{
    super(d1);
  }

  private double tetrahedronArea = 4 * (0.5 * getDimOne() * getDimTwo()) ;
  private double tetrahedronVolume = ((0.5 * getDimOne() * getDimTwo()) * getDimThree())/3;


  public double getArea()	{
    return tetrahedronArea;
  }


  public double getVolume()	{
    return tetrahedronVolume;
  }


  public String toString()	{
    return " base width: " + getDimOne() + " base height: " + getDimTwo() + " height " + getDimThree();
  }
}
