/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmm.views;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kiere
 */
public class View extends javax.swing.JFrame {

    /**
     * Creates new form LoginScreen
     */
    public View() {
        initComponents();
        panelMainMenu.setVisible(false);
        panelLogin.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        panelLogin = new javax.swing.JPanel();
        textTitle = new javax.swing.JLabel();
        buttonSubmit = new javax.swing.JButton();
        fieldUserName = new javax.swing.JTextField();
        fieldPassword = new javax.swing.JTextField();
        panelMainMenu = new javax.swing.JPanel();
        labelMM = new javax.swing.JLabel();
        buttonIng = new javax.swing.JButton();
        buttonRec = new javax.swing.JButton();
        buttonDem = new javax.swing.JButton();
        buttonStock = new javax.swing.JButton();
        buttonOrd = new javax.swing.JButton();
        buttonGen = new javax.swing.JButton();
        textTitleMM = new javax.swing.JLabel();
        panelIngTable = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableIng = new javax.swing.JTable();
        textIngTitle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1200, 600));
        setMinimumSize(new java.awt.Dimension(1200, 600));
        setPreferredSize(new java.awt.Dimension(1200, 600));
        setSize(new java.awt.Dimension(800, 600));

        Background.setBackground(new java.awt.Color(51, 255, 204));
        Background.setLayout(new java.awt.CardLayout());

        panelLogin.setBackground(new java.awt.Color(255, 153, 153));
        panelLogin.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelLogin.setMaximumSize(new java.awt.Dimension(1200, 600));
        panelLogin.setMinimumSize(new java.awt.Dimension(1200, 600));
        panelLogin.setPreferredSize(new java.awt.Dimension(1200, 600));

        textTitle.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        textTitle.setText("RESTAURANT MATERIALS MANAGEMENT");
        textTitle.setToolTipText("");

        buttonSubmit.setText("SUBMIT");

        fieldUserName.setText("ENTER USERNAME");

        fieldPassword.setText("ENTER PASSWORD");

        javax.swing.GroupLayout panelLoginLayout = new javax.swing.GroupLayout(panelLogin);
        panelLogin.setLayout(panelLoginLayout);
        panelLoginLayout.setHorizontalGroup(
            panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLoginLayout.createSequentialGroup()
                .addGap(496, 496, 496)
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(panelLoginLayout.createSequentialGroup()
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLoginLayout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(textTitle))
                    .addGroup(panelLoginLayout.createSequentialGroup()
                        .addGap(526, 526, 526)
                        .addComponent(buttonSubmit)))
                .addContainerGap(175, Short.MAX_VALUE))
        );
        panelLoginLayout.setVerticalGroup(
            panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLoginLayout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(textTitle)
                .addGap(282, 282, 282)
                .addComponent(fieldUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(fieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(buttonSubmit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Background.add(panelLogin, "card2");

        panelMainMenu.setBackground(new java.awt.Color(204, 255, 255));
        panelMainMenu.setMaximumSize(new java.awt.Dimension(1200, 600));
        panelMainMenu.setMinimumSize(new java.awt.Dimension(1200, 600));
        panelMainMenu.setPreferredSize(new java.awt.Dimension(1200, 600));

        labelMM.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        labelMM.setText("Main Menu");

        buttonIng.setText("Ingredients Manager");

        buttonRec.setText("Recipe Manager");
        buttonRec.setMaximumSize(new java.awt.Dimension(177, 29));
        buttonRec.setMinimumSize(new java.awt.Dimension(177, 29));
        buttonRec.setPreferredSize(new java.awt.Dimension(177, 29));

        buttonDem.setText("Demand Manager");
        buttonDem.setMaximumSize(new java.awt.Dimension(177, 29));
        buttonDem.setMinimumSize(new java.awt.Dimension(177, 29));
        buttonDem.setPreferredSize(new java.awt.Dimension(177, 29));

        buttonStock.setText("Stock Manager");
        buttonStock.setMaximumSize(new java.awt.Dimension(177, 29));
        buttonStock.setMinimumSize(new java.awt.Dimension(177, 29));
        buttonStock.setPreferredSize(new java.awt.Dimension(177, 29));

        buttonOrd.setText("Order Manager");
        buttonOrd.setMaximumSize(new java.awt.Dimension(177, 29));
        buttonOrd.setMinimumSize(new java.awt.Dimension(177, 29));
        buttonOrd.setPreferredSize(new java.awt.Dimension(177, 29));

        buttonGen.setText("Generate Order Plan");

        textTitleMM.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        textTitleMM.setText("RESTAURANT MATERIALS MANAGEMENT");
        textTitleMM.setToolTipText("");

        javax.swing.GroupLayout panelMainMenuLayout = new javax.swing.GroupLayout(panelMainMenu);
        panelMainMenu.setLayout(panelMainMenuLayout);
        panelMainMenuLayout.setHorizontalGroup(
            panelMainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainMenuLayout.createSequentialGroup()
                .addGroup(panelMainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMainMenuLayout.createSequentialGroup()
                        .addGap(498, 498, 498)
                        .addGroup(panelMainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(buttonIng)
                            .addComponent(buttonRec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonGen)
                            .addComponent(buttonDem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonOrd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelMainMenuLayout.createSequentialGroup()
                        .addGap(465, 465, 465)
                        .addComponent(labelMM))
                    .addGroup(panelMainMenuLayout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(textTitleMM)))
                .addContainerGap(163, Short.MAX_VALUE))
        );
        panelMainMenuLayout.setVerticalGroup(
            panelMainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainMenuLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(textTitleMM)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelMM)
                .addGap(38, 38, 38)
                .addComponent(buttonIng)
                .addGap(18, 18, 18)
                .addComponent(buttonRec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(buttonDem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonOrd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(buttonGen)
                .addContainerGap(98, Short.MAX_VALUE))
        );

        Background.add(panelMainMenu, "card3");

        jScrollPane1.setViewportView(tableIng);

        textIngTitle.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        textIngTitle.setText("Ingredient Manager");

        javax.swing.GroupLayout panelIngTableLayout = new javax.swing.GroupLayout(panelIngTable);
        panelIngTable.setLayout(panelIngTableLayout);
        panelIngTableLayout.setHorizontalGroup(
            panelIngTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelIngTableLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(textIngTitle)
                .addGap(385, 385, 385))
            .addGroup(panelIngTableLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 873, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(264, Short.MAX_VALUE))
        );
        panelIngTableLayout.setVerticalGroup(
            panelIngTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelIngTableLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(textIngTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        Background.add(panelIngTable, "card4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public String getUser(){
        return fieldUserName.getText();
    }
    public String getPass(){
        return fieldPassword.getText();
    }
    
    public void addSubmitListener(ActionListener listenForSubmit){
        buttonSubmit.addActionListener(listenForSubmit);
    }
    
    public void addIngredientsListener(ActionListener listenForIng){
        buttonIng.addActionListener(listenForIng);
    }
    
    public void showMainMenu(){
        panelMainMenu.setVisible(true);
        panelLogin.setVisible(false);
    }
    public void showIngTable(ArrayList<String[]> tableContents){
        panelMainMenu.setVisible(false);
        panelLogin.setVisible(false);
        panelIngTable.setVisible(true);
        
        for(int i=0; i < tableContents.size() ;i++){

            String[] temp = tableContents.get(i);
            String name = temp[0];
            String UOM = temp[1];
            DefaultTableModel model = (DefaultTableModel)panelIngTable.getModel();
            model.setValueAt((Object)name, i, 0);
            
           
        }
    }
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JButton buttonDem;
    private javax.swing.JButton buttonGen;
    private javax.swing.JButton buttonIng;
    private javax.swing.JButton buttonOrd;
    private javax.swing.JButton buttonRec;
    private javax.swing.JButton buttonStock;
    private javax.swing.JButton buttonSubmit;
    private javax.swing.JTextField fieldPassword;
    private javax.swing.JTextField fieldUserName;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelMM;
    private javax.swing.JPanel panelIngTable;
    private javax.swing.JPanel panelLogin;
    private javax.swing.JPanel panelMainMenu;
    private javax.swing.JTable tableIng;
    private javax.swing.JLabel textIngTitle;
    private javax.swing.JLabel textTitle;
    private javax.swing.JLabel textTitleMM;
    // End of variables declaration//GEN-END:variables
}