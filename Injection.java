public class Injection{
    public static void main ( String[] args){

        Database mysqlDB = new MySQL();
        Database oracle = new Oracle();

        Database db = new Database();
        // working with single DB instance

        db.setDatabase( mysqlDB );
        // it connects to MySQL DB
        db.connect();

        db.setDatabase( oracle );
        // connects to oracle DB
        db.connect();
    }
}

// this is managing class
class Database{
    // in this class I am only calling methods based on their type

    // only calling connect on currently stored DB type
    public void connect(){ this.currentClass.connect(); }
    // setting what type of DB should be currently in use
    public void setDatabase( Database x ) { this.currentClass = x; };

    private Database currentClass;
}

// each DB and its implementation is below

class MySQL extends Database{
    public void connect(){
        System.out.println("Here could be code to connect to a MySQL DB.");
    }
}

class Oracle extends Database{
    public void connect(){
        System.out.println("Here could be code to connect to an Oracle DB.");
    }
}