/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Form;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author acer
 */
public class DBConnect {
    //Create the connection bw the projecct and mysql database
    private static String serverName = "localhost";
    private static String userName = "root";
    private static String dbName = "librarymanagementsystem";
    private static Integer portNumber = 3307;
    private static String pass = "";
    
    //create the function to create and return the connection
    public static Connection getConnection(){
        Connection connection = null;
        MysqlDataSource datasource = new MysqlDataSource();
        datasource.setServerName(serverName);
        datasource.setUser(userName);
        datasource.setDatabaseName(dbName);
        datasource.setPortNumber(portNumber);
        datasource.setPassword(pass);
        
        try {
            connection = datasource.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return connection;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
    }
}
