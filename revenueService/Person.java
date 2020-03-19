package revenueService;

public class Person{
    public Person( String surname, int age, int salary ){
        this.id = this.CURRENT_ID++;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
    }
    
    public Person( int id, String surname ){
        this( surname, 0, 0 );
    }

    // Since custom constructor is defined and class is extended default constrocr should be defined as well
    // https://stackoverflow.com/questions/4488716/java-default-constructor
    public Person(){
        this( "fromEmployee", 0, 0 );
    }

    // copy constructor
    public Person( Person x ){
        this.id = x.id;
        this.name = x.name;
        this.surname = x.surname;
        this.age = x.age;
        this.salary = x.salary;
        this.taxes = x.taxes;
    }
    
    // Getters, setters
    public int getId(){ return this.id; }
    public String getSurname(){ return this.surname; }
    public boolean setName( String name ){ this.name = name; return true; }
    public String getName(){ return this.name; }
    public int getAge(){ return this.age; }
    public boolean setAge( int age ){ this.age = age; return true; }
    public int getSalary(){ return this.salary; }
    public boolean setSalary( int salary ){ this.salary = salary; return true; }
        
    // Person characteristics
    private int id;
    private String name;
    private String surname;
    private int age;
    private int salary;
    private double taxes;

    private static int CURRENT_ID = 0;

    // Person's taxes have to be calculated internally
    private void calculateTaxes(){
        // logic
        int taxesToPay = 0;

        this.taxes = taxesToPay;
    }
}