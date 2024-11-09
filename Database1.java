/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package database1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String url = "jdbc:mysql://localhost:3306/Cars";
        String user = "root";
        String password = "";
        
        try {
            Connection conn =DriverManager.getConnection(url,user,password);
            System.out.println("Connected to the Database");
        }
        catch (SQLException e){
            System.out.print("Connection Failed");
            e.printStackTrace();
        }
    }
    
}
