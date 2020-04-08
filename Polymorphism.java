
public class Polymorphism {
    public static void main ( String [] args ){
        // since this is not abstract class Base class Shape can be inicialized
        Shape s = new Shape();

        // class Circle can be inicialized as Circle
        Circle c1 = new Circle();
        // and also can be stored in a Shape
        Shape c2 = new Circle();


        s.whoAmI();

        c1.whoAmI();
        c2.whoAmI();
    }


}

// this is Base class
// unlike C++ in JAVA all method are virtual by default
class Shape{
    public void whoAmI(){
        System.out.println("I am Base class Shape");
    }

}

// this is derivated class
class Circle extends Shape{
    public void whoAmI(){
        System.out.println("I am Derivated class Circle");
    }
}