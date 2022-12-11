package Homework;

public class Circle {
  public  double radius;

  public  void printSize()
    {
        System.out.println(String.format("area of circle (r = %.1f\n r^2*PI = %.2f", radius,Math.pow(radius,2)));

    }
}
