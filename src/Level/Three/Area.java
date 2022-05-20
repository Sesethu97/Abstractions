package Level.Three;

public class Area extends Shape {
    double length = 12;
    double width = 15;
    double radius = 3.5;


    @Override
    void RectangleArea(double length, double width) {

        System.out.println(length*width);

    }

    @Override
    void SquareArea(double length) {

        System.out.println(length*length);

    }

    @Override
    void CircleArea(double radius) {

        System.out.println(Math.PI*radius*radius);


    }
}
