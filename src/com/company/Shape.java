package com.company;

public abstract class Shape {
  private double dimOne;
  private double dimTwo;
  private double dimThree;

  //1 arg constructor
  public Shape (double d1)  {
    dimOne = d1;
  }

  //2 arg constructor
  public Shape (double d1, double d2) {
    dimOne = d1;
    dimTwo = d2;
  }

  //3 arg constructor
  public Shape (double d1, double d2, double d3){
    dimOne = d1;
    dimTwo = d2;
    dimThree = d3;
  }

  //Setters and getters:
  //dim 1
  public void setDimOne(double d1)  {
    dimOne = d1;
  }
  public double getDimOne()   {
    return dimOne;
  }

  //dim2
  public void setDimTwo(double d2) {
    dimTwo = d2;
  }
  public double getDimTwo()   {
    return dimTwo;
  }

  //dim3
  public void setDimThree(double d3) {
    dimThree = d3;
  }
  public double getDimThree() {
    return dimThree;
  }

  public abstract double getArea();

  public String getName() {
    return getClass().getName();
  }

  @Override
  public String toString(){
    return "area = " + getArea();
  }
}
