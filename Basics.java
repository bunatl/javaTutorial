/* Test demo purpose project */

import java.util.HashSet;
import java.util.Set;

import revenueService.Employee;
import revenueService.Person;
import revenueService.SelfEmployed;

public class Basics{

    // Inicialization
    public static void main( String[] args ){

        // a set of instances of Person
        Set<Person> mySet = new HashSet<Person>();

        Person p = new Person( "Bunat" );
        System.out.println( p.getId() );
        System.out.println( p.getSurname() );

        Person e =  new Employee( "XoX" );
        System.out.println( p.getId() );
        System.out.println( e.getSurname() );

        // method overriding
        p.checkTaxes();
        e.checkTaxes();

        Person se =  new SelfEmployed();

        mySet.add( p );
        mySet.add( e );
        mySet.add( se );

        // Polymorphism
        for ( Person aPersonFromSet : mySet )
            aPersonFromSet.checkTaxes();

        Person p2 = new Person();
        p2 = e;
        System.out.println( e.getSurname() );
        System.out.println( p2.getSurname() );
    }
}