/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;
import java.sql.*;

/**
 *
 * @author Shahbaaz
 */
public class Database {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javadb?zeroDateTimeBehavior=convertToNull","root","");
            System.err.println("Database Connected Successfully.");
            
          //  System.err.println("enter the roll no:");
            //System.err.println("enter the name:");
            
            PreparedStatement stmt=con.prepareStatement("INSERT INTO data(RollNo , Name, Address)\n" +
"VALUES (2016,\"shaz\",\"jhansi\");");
            
            int i=stmt.executeUpdate();
            
            if(i>0)
            {
                System.err.println("updated!!");
            }
            else
                System.out.println("sorry ! update failed !");
            
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    
}
