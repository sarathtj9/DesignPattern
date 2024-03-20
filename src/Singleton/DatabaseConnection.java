package Singleton;

public class DatabaseConnection {

    public static DatabaseConnection dbc=null;

    // public static DatabaseConnection dbc=new DatabaseConnection();//Eager intialization . Lot of static vars will increase the app time .
    String url;

    String username;
    String password;

    private DatabaseConnection(){

    }

    //Above method won't work for multi threading
//    public static DatabaseConnection getInstance(){
//        if(dbc==null){
//            dbc= new DatabaseConnection();
//        }
//        return dbc;
//    }


    //This works for multi threading -> DOuble check lock
    public static DatabaseConnection getInstance() { //DOuble check lock
        if (dbc == null) {
            synchronized (DatabaseConnection.class)//lock.lock()
            {
                if(dbc==null){
                    dbc= new DatabaseConnection();
                }
            }

        }
        return dbc;
    }
}
