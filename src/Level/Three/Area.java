package Level.Three;

public class Area extends Shape {


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
