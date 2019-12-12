package lab8;

public class Polymorphism {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(10,20,15);
        triangle.Per();
        triangle.S();
        System.out.println("----------");
        RightTriangle rightTriangle = new RightTriangle(3,8,10);
        rightTriangle.Сorner();
    }
}