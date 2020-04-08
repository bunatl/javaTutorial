
public class AbstarctInterface {
    public static void main( String[] args ){
        
        // Shape s = new Shape(); // since Shape is now interface it cannot create objects

        Circle c = new Circle();
        c.whoAmI();

        // Base b = new Base(); // again abstact class can not be initialized and an object cannnot be created

        Derivated d1 = new Derivated();
        Derivated d2 = new Derivated();
        // abstarct methodis called from Derivated class
        d1.abstractMethod();
        // non abstract method is can be inherited and called Base class
        // it is not neccessery to overwrite it
        d2.nonAbstractMethod();
    }
}

// compared to polymorphism interface only defines "the face" 
// the actual definition is in derivated classes
// interface is public and abstract be default
abstract interface Shape{
    // all methods have to be overrided
    public void whoAmI();
    // Interface attributes are by default public, static and final
}

// this is derivated class
class Circle implements Shape{
    public void whoAmI(){
        System.out.println("I am Derivated class Circle");
    }
}

// compared to abstract class where only some method can be abstract
abstract class Base{
    public abstract void abstractMethod();
    public void nonAbstractMethod(){
        System.out.println("Non abstarct methods can be implemented inside abstarct class.");
    }
}

class Derivated extends Base{
    public void abstractMethod(){
        System.out.println("On the other hand, abstract methods have to be defined in derivated classes.");
    }
}