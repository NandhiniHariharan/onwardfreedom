package MethodOverloading;

public class Shape {
    public double area(double sidelength){
      return sidelength*sidelength;
    }
    public double area(double width,double height){
       return width*height;
    }
    public static void main(String args[]){
        Shape shape=new Shape();
        System.out.println("Area of Square is : "+shape.area(10));
        System.out.println("Area of Rectangle is :"+shape.area(20, 20));
    }
}
