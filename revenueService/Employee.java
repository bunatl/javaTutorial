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

    //override the checkTaxes function fron Person class
    public void checkTaxes(){
        System.out.println( "Empolyee doesn't pay taxes himself. Instead, his company paying taxes on his behave." );
    }

    // More specific characteristic about employee, compare to Person
    private String company;
}