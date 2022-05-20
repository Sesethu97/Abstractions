package Level.Three;
//We have to calculate the area of a rectangle, a square and a circle. Create an abstract class 'Shape' with three abstract methods namely 'RectangleArea' taking two parameters, 'SquareArea' and 'CircleArea' taking one parameter each.
// The parameters of 'RectangleArea' are its length and breadth, that of 'SquareArea' is its side and that of 'CircleArea' is its radius.
// Now create another class 'Area' containing all the three methods 'RectangleArea', 'SquareArea' and 'CircleArea' for printing the area of rectangle, square and circle respectively.
// Create an object of class 'Area' and call all the three methods.
public abstract class Shape {

    abstract double RectangleArea(double length, double width);
    abstract double SquareArea(double length);
    abstract double CircleArea(double radius);

    public static void main(String[] args) {
        Area as = new Area();

        System.out.println("Circle area: " +as.CircleArea(3.5));
        System.out.println("Square area: " +as.SquareArea(12));
        System.out.println("Rectangle area: "+as.RectangleArea(16,12));


    }
}