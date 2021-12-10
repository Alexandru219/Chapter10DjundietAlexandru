package com.company;

public class Shapes {

  public static void main(String[] args) {

    Shape shape[] = new Shape[6];
    shape[0] = new Circle(7.0);
    shape[1] = new Square(7.0);
    shape[2] = new triangle(4.0, 5.0);
    shape[3] = new Sphere(1.0);
    shape[4] = new Cube(1.0);
    shape[5] = new Tetrahedron(1.0);

    for (Shape curentShape : shape) {
      System.out.println(curentShape);
      if (curentShape instanceof TwoDimensionalShape) {
        TwoDimensionalShape twoDimentionalShape = (TwoDimensionalShape) curentShape;

        System.out.printf("%sArea: %.2f\n\n", twoDimentionalShape.toString(), twoDimentionalShape.getArea());

      } else if (curentShape instanceof ThreeDimensionalShape) {
        ThreeDimensionalShape threeDimensionalShape = (ThreeDimensionalShape) curentShape;
        System.out.printf("%sArea: %.2f\n\n", threeDimensionalShape.toString(), threeDimensionalShape.getVolume());

        System.out.printf("%sArea: %.2f\n\n", threeDimensionalShape.toString(), threeDimensionalShape.getArea());
      }

    }
  }
}

