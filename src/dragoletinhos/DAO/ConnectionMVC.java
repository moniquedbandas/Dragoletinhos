package dragoletinhos.DAO;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionMVC {
    
    public Connection getConnection(){
        Connection conn = null;
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch(ClassNotFoundException e){
        }
        try{
            //conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dragoletinhosteste", "root", ""); //esse banco é para testes somente
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dragoletinhos", "root", "");
        }catch(SQLException e){
        }
        return conn;
    }
}
