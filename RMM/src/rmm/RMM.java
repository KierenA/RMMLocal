/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmm;

import rmm.Controller.Controller;
import rmm.Model.DBHandler;
import rmm.views.View;

/**
 *
 * @author kiere
 */
public class RMM {

    public static void main(String[] args) {
        
        DBHandler dbh = new DBHandler();
        View view = new View();
        Controller theController = new Controller(view, dbh);
        view.setVisible(true);
        
    }
    
}
