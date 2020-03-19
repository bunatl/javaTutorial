package revenueService;

public class Employee extends Person{
    // if no super() would be defined this constructor would be neccesery
    public Employee(){
        // calls another overload construcotr in the same class
        this( "unknown" );
    }

    public Employee( String company ){
        // invoke or call parent class constructor
        // super is called because it handles persons IDs
        super();
        // super. can also reference to super class variable or method

        this.company = company;
    }

    public String getEmployeesCompany(){ return this.company; }

    // More specific characteristic about employee, compare to Person
    private String company;

}