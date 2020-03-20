package revenueService;

public class SelfEmployed extends Person{
    public SelfEmployed(){
        //set Person class deal with it
        super( "self-employed" );
    }

    public void checkTaxes(){
        System.out.println( "Self-employed has to manage his taxes by himself." );
    }
    
}