package Level.One;

//Create an abstract class 'Parent' with a method 'message'.
// It has two subclasses each having a method with the same name 'message' that prints "This is first subclass" and "This is second subclass" respectively.
// Call the methods 'message' by creating an object for each subclass.

public abstract class parent {

    public  void message(){

    }

    public static void main(String[] args) {
        childA one = new childA();
        one.message();

        childB two = new childB();
        two.message();
    }
}
