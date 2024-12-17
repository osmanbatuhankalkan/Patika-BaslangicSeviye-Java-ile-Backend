package core;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {//singleton desing pattern

    private static Database instance=null;
    private Connection connection=null;
    private final String DB_URL= "jdbc:mysql://localhost:3306/customermanage";
    private final String DB_USERNAME= "root";
    private final String DB_PASSWORD="59184072";

    private Database(){
        try {
            this.connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
        }catch (SQLException exception){
            exception.printStackTrace();
        }

    }
    private Connection getConnection(){
        return connection;
    }
    public static Connection getInstance(){
        try{
            if(instance==null||instance.getConnection().isClosed()){
                instance=new Database();
            }
        }catch (SQLException exception){
            exception.printStackTrace();
        }
        return instance.getConnection();
    }
}
