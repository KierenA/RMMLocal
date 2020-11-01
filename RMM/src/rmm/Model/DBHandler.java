/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmm.Model;

import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author kiere
 */

public class DBHandler
{
    private Connection con;
    private Boolean loggedIn = false;
    private String EMPRole;
       
    public DBHandler()
    {

        try
        {
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/RMMDB"); 
            

        } catch (SQLException e)
        {
            System.err.println(e);
            System.exit(0);
        }
    }
    
    public void checkCred(String Username, String Password){
        try{
        String sl = "SELECT EMPRole FROM Users WHERE Username = ? and Password = ?";
        PreparedStatement stmt = con.prepareStatement(sl, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
        
        stmt.clearParameters();
        stmt.setString(1, Username);
        stmt.setString(2, Password);
        
        ResultSet rs = stmt.executeQuery();
        if(rs.next()){
            System.out.println("Match found!");
            EMPRole = rs.getString("EMPRole");
            loggedIn = true;
            }
        else{
            System.out.println("No match");
            }
        }
        catch(SQLException e){
            System.err.println(e);
        }
    }
    public boolean loggedIn(){
        return loggedIn;
    }
    
    public ArrayList<String[]> getIngTable(){
        ResultSet rs = null;
        ArrayList<String[]> tableContents = new ArrayList<String[]>();
        try{
            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            rs = stmt.executeQuery("Select * from Ingredient");
            String[] tableLine = new String[2];
            
            while (rs.next()){
                tableLine[0] = rs.getString("INAME");
                tableLine[1] = rs.getString("UOM");
                tableContents.add(tableLine);
            }
           
        }catch (SQLException e){
            System.err.println(e);
        }
        return tableContents;
    }
}