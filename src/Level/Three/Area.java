package Level.Three;

public class Area extends Shape {
    double length = 12;
    double width = 15;
    double radius = 3.5;


    @Override
    double RectangleArea(double length, double width) {

//        System.out.println(length*width);

        return length*width;
    }

    @Override
    double SquareArea(double length) {

//        System.out.println(length*length);

        return length*length;
    }

    @Override
    double CircleArea(double radius) {

//        System.out.println(Math.PI*radius*radius);


        return Math.PI*radius*radius;
    }
}
