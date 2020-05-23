
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import oracle.jdbc.pool.OracleDataSource;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hitea
 */
public class DatabaseConnection {

    public DatabaseConnection() {
        
        try {
            OracleDataSource ds = new oracle.jdbc.pool.OracleDataSource();
            ds.setURL("jdbc:oracle:thin:@castor.cc.binghamton.edu:1521:acad111");
            Connection conn = ds.getConnection("hnikam1", "KK332424b");
            System.out.println("Database Connection Successful");
            
            /* Statement stmt = conn.createStatement ();

            // Save result
            ResultSet rset;
            rset = stmt.executeQuery ("SELECT * FROM students");
            */
        } 
        
        catch (SQLException ex) {
            System.out.println("Error occured via SQLException");
            Logger.getLogger(DisplayPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (Exception ex) {
            System.out.println("Error occured via Exception");
            Logger.getLogger(DisplayPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
