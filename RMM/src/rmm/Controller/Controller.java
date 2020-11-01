/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmm.Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.ArrayList;
import rmm.Model.DBHandler;
import rmm.views.View;

/**
 *
 * @author kiere
 */
public class Controller {
    
    private View screen;
    private DBHandler dbh;
    
    public Controller(View view, DBHandler model){
        this.screen = view;
        this.dbh = model;
        this.screen.addSubmitListener(new SubmitListener());
    }
    
    public class SubmitListener implements ActionListener{
  
        @Override
        public void actionPerformed(ActionEvent e){
            String user, pass;
            
                user = screen.getUser();
                pass = screen.getPass();
                dbh.checkCred(user, pass);
                if(dbh.loggedIn()){
                    screen.showMainMenu();
                }
                
        }
        
    }
    
    public class IngListener implements ActionListener{
  
        @Override
        public void actionPerformed(ActionEvent e){
                ArrayList<String[]> tableContents = dbh.getIngTable();
                screen.showIngTable(tableContents);
                
        }
        
    }
    
    
    
    
    
    
        //if (DBHandler.checkCred(user, pass)){
}
