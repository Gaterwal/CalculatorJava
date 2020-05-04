/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import java.util.Random;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.Timer;
import objet.*;

/**
 *
 * @author Obuu 1st VERSION
 */
public class Fenetre extends javax.swing.JFrame {
    
    
    BoutonNum but0; BoutonNum but1;BoutonNum but2;BoutonNum but3;BoutonNum but4;
    BoutonNum but5;BoutonNum but6;BoutonNum but7;BoutonNum but8;BoutonNum but9;
    BoutonNum butPlus;BoutonNum butEgal;
    Calcul calcul;
    boolean etape1 = false ;       
    boolean etape2 = false ; 
    int minute=0,seconde=0;
    Timer timer;  
    int chiffre1Random;
    int chiffre2Random;
    
    
    public Fenetre() 
    {    
        initComponents();   
        init();
        createButton();
        calcul = new Calcul();   
        
    }
    
  
    public void init()
    {  
        //Fenetre transparente
        getContentPane().setBackground(new Color(1.0f,1.0f,1.0f,0.0f));
        setBackground(new Color(1.0f,1.0f,1.0f,0.0f));
        jPanel1.setBackground(new Color(0, 0, 0, 0));
        jPanel1.setOpaque(false);    
        setButtonLien(butX);     
        setButtonLien(butAleatoire);     
        setButtonLien(butNormal);              
    }

    
    public void createButton()
    {
        but0    = new BoutonNum(jBut0 , 0, "/ressources/img/but0.png" , "/ressources/img/but0_1.png" , "/ressources/img/but0_2.png" ,  "/ressources/img/but0_3.png");
        but1    = new BoutonNum(jBut1 , 1, "/ressources/img/but1.png" , "/ressources/img/but1_1.png" , "/ressources/img/but1_2.png" ,  "/ressources/img/but1_3.png");
        but2    = new BoutonNum(jBut2 , 2, "/ressources/img/but2.png" , "/ressources/img/but2_1.png" , "/ressources/img/but2_2.png" ,  "/ressources/img/but2_3.png");
        but3    = new BoutonNum(jBut3 , 3, "/ressources/img/but3.png" , "/ressources/img/but3_1.png" , "/ressources/img/but3_2.png" ,  "/ressources/img/but3_3.png");
        but4    = new BoutonNum(jBut4 , 4, "/ressources/img/but4.png" , "/ressources/img/but4_1.png" , "/ressources/img/but4_2.png" ,  "/ressources/img/but4_3.png");
        but5    = new BoutonNum(jBut5 , 5, "/ressources/img/but5.png" , "/ressources/img/but5_1.png" , "/ressources/img/but5_2.png" ,  "/ressources/img/but5_3.png");
        but6    = new BoutonNum(jBut6 , 6, "/ressources/img/but6.png" , "/ressources/img/but6_1.png" , "/ressources/img/but6_2.png" ,  "/ressources/img/but6_3.png");        
        but7    = new BoutonNum(jBut7 , 7, "/ressources/img/but7.png" , "/ressources/img/but7_1.png" , "/ressources/img/but7_2.png" ,  "/ressources/img/but7_3.png");
        but8    = new BoutonNum(jBut8 , 8, "/ressources/img/but8.png" , "/ressources/img/but8_1.png" , "/ressources/img/but8_2.png" ,  "/ressources/img/but8_3.png");
        but9    = new BoutonNum(jBut9 , 9, "/ressources/img/but9.png" , "/ressources/img/but9_1.png" , "/ressources/img/but9_2.png" ,  "/ressources/img/but9_3.png");
        butPlus = new BoutonNum(jButPlus , 9, "/ressources/img/butPlus.png" , "/ressources/img/butPlus_1.png", "/ressources/img/butPlus_2.png" ,  "/ressources/img/butPlus_3.png");
        butEgal = new BoutonNum(jButEgal , 9, "/ressources/img/butEgal.png" , "/ressources/img/butEgal_1.png", "/ressources/img/butEgal_2.png" ,  "/ressources/img/butEgal_3.png");
        
    }
    
    
    public void setButtonLien(JButton jbut)
    {
        jbut.setFocusPainted(false);
        jbut.setMargin(null);           
        jbut.setBorder(BorderFactory.createEmptyBorder());
        jbut.setContentAreaFilled(false);
    
    }
    
    
    public void whichLockNumber()
    {       
        int value1 = calcul.getValue1();

        for(int i = 0 ; i<=10 ; i++)
        {
            if ( i+value1 <= 10)
            {
               unlockButtonNumber(i);
            }else{
                lockButtonNumber(i);
            }
        }   
    }
    
    
    public void unlockAllNumber()
    {
       but0.setEnabled();but1.setEnabled(); but2.setEnabled();but3.setEnabled();but4.setEnabled();
       but5.setEnabled();but6.setEnabled();but7.setEnabled();but8.setEnabled();but9.setEnabled();      
    }
    
    
    public void lockAllNumber()
    {
       but0.setDisabled();but1.setDisabled(); but2.setDisabled();but3.setDisabled();but4.setDisabled();
       but5.setDisabled();but6.setDisabled();but7.setDisabled();but8.setDisabled();but9.setDisabled();       
    }
    
    
    public void unlockButtonNumber(int but)
    {
        switch(but)
        {
           case 0:
           but0.setEnabled();
           break; 
           case 1:
           but1.setEnabled();
           break;
           case 2:
           but2.setEnabled();
           break;
           case 3:
           but3.setEnabled();
           break;
           case 4:
           but4.setEnabled();
           break;
           case 5:
           but5.setEnabled();
           break;
           case 6:
           but6.setEnabled();
           break;
           case 7:
           but7.setEnabled();
           break;
           case 8:
           but8.setEnabled();
           break;
           case 9:
           but9.setEnabled();
           break;
                            
       }
    }
     
    
     public void lockButtonNumber(int but)
    {
        switch(but)
        {
           case 0:
           but0.setDisabled();
           break; 
           case 1:
           but1.setDisabled();
           break;
           case 2:
           but2.setDisabled();
           break;
           case 3:
           but3.setDisabled();
           break;
           case 4:
           but4.setDisabled();
           break;
           case 5:
           but5.setDisabled();
           break;
           case 6:
           but6.setDisabled();
           break;
           case 7:
           but7.setDisabled();
           break;
           case 8:
           but8.setDisabled();
           break;
           case 9:
           but9.setDisabled();
           break;
                            
       }
    }
     
     
    public void affichage(int chiffre)
    { 
        String text = screenField.getText();
  
        if (!etape1)
        {
            if(!calcul.isValue1Set())
            {
                screenField.setText( Integer.toString(chiffre));
                calcul.setValue1(chiffre);
                calcul.setIsValue1Set(true);
                if (chiffre  == 1)
                {
                    lockAllNumber();
                    etapePlus();
                    unlockButtonNumber(0);                   
                }   
                else
                {                                        
                    etapePlus();                 
                }                
                    
            }
            else if(calcul.isValue1Set()&& calcul.getValue1() == 1)
            {
                screenField.setText("1"+Integer.toString(chiffre));
                calcul.setValue1(10);             
                etapePlus();
            }
        }
        else if(etape1 && !etape2)
        {
            if(!calcul.isValue2Set() )
            {                
                screenField.setText(text + Integer.toString(chiffre));
                calcul.setValue2(chiffre);
                calcul.setIsValue2Set(true);
                if (chiffre == 1)
                {
                    lockAllNumber();
                    etapeEgal();
                    if(calcul.getValue1() == 0 )
                        unlockButtonNumber(0);
                    
                }   
                else                                      
                    etapeEgal();                                   
                           
            }
            else if(calcul.isValue2Set()&& calcul.getValue2() == 1)
            {
                if(chiffre== 0)
                {
                    calcul.setValue2(10);
                    screenField.setText(text + Integer.toString(chiffre));
                    etapeEgal();   
                }                  
            }       
        }
        else if(etape1 && etape2)
        {
            if(!calcul.isValue3Set())
            { 
                screenField.setText(text + Integer.toString(chiffre));
                calcul.setValue3(chiffre);
                calcul.setIsValue3Set(true);
                lockAllNumber();
                if(chiffre == 1)
                {
                    unlockButtonNumber(0);
                    timerStop(3);
                }else
                {
                    butNormal.setEnabled(false);
                    butAleatoire.setEnabled(false);
                    timerStop(10);
                    
                }
               
            }
            else if(calcul.isValue3Set()&& calcul.getValue3() == 1)
            {
                if(chiffre== 0)
                {                    
                    calcul.setValue3(10);
                    screenField.setText(text + Integer.toString(chiffre));     
                    but0.setDisabled();   
                }  
            }               
        }

    }
    
         
    public void randomMode()
    {
        unlockAllNumber();
        
        chiffre1Random =createRandom(11,0);       
        int randChiffre2 = 10 - chiffre1Random ;
        if (randChiffre2 != 0 )
            chiffre2Random =createRandom(randChiffre2,0);
        else 
             chiffre2Random=0;
        
        screenField.setText(chiffre1Random + " + " + chiffre2Random + " =  " );  // ? afaire

    }
    
    
    public void resultRandom(int chiffre)
    {
        String text =   screenField.getText();
        screenField.setText(text + chiffre );  

        calcul.setValue3(chiffre);
        calcul.setIsValue3Set(true);
        lockAllNumber();
        if(chiffre == 1)
        {
            unlockButtonNumber(0);
            timerStop(3);
            
        }else
        {
            timerStop(10);
            butNormal.setEnabled(false);
            butAleatoire.setEnabled(false);
        }
    }
    
    
    public static int createRandom(int max ,int min)
    {    
        Random random = new Random();
        int chiffreRandom = random.nextInt(max-min)+min;
        return chiffreRandom;    
    }
    
    
    public void etapePlus()
    {
        lockAllNumber();
        butPlus.setEnabled();
    }
    
    
    public void etapeEgal()
    {
        lockAllNumber();
        butEgal.setEnabled();
    }
    
   
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jBut0 = new javax.swing.JButton();
        jBut1 = new javax.swing.JButton();
        jBut2 = new javax.swing.JButton();
        jBut3 = new javax.swing.JButton();
        jBut4 = new javax.swing.JButton();
        jBut5 = new javax.swing.JButton();
        jBut6 = new javax.swing.JButton();
        jButPlus = new javax.swing.JButton();
        jBut7 = new javax.swing.JButton();
        jBut8 = new javax.swing.JButton();
        jBut9 = new javax.swing.JButton();
        jButEgal = new javax.swing.JButton();
        screenField = new javax.swing.JLabel();
        bgLabel = new javax.swing.JLabel();
        butX = new javax.swing.JButton();
        butNormal = new javax.swing.JButton();
        butAleatoire = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculetto ");
        setUndecorated(true);
        setResizable(false);

        jPanel1.setLayout(null);

        jBut0.setMaximumSize(new java.awt.Dimension(116, 116));
        jBut0.setMinimumSize(new java.awt.Dimension(116, 116));
        jBut0.setName(""); // NOI18N
        jBut0.setPreferredSize(new java.awt.Dimension(116, 116));
        jBut0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBut0ActionPerformed(evt);
            }
        });
        jPanel1.add(jBut0);
        jBut0.setBounds(240, 590, 116, 116);

        jBut1.setMaximumSize(new java.awt.Dimension(0, 0));
        jBut1.setMinimumSize(null);
        jBut1.setPreferredSize(new java.awt.Dimension(116, 116));
        jBut1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBut1ActionPerformed(evt);
            }
        });
        jPanel1.add(jBut1);
        jBut1.setBounds(370, 590, 116, 116);

        jBut2.setMaximumSize(new java.awt.Dimension(0, 0));
        jBut2.setMinimumSize(null);
        jBut2.setPreferredSize(new java.awt.Dimension(116, 116));
        jBut2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBut2ActionPerformed(evt);
            }
        });
        jPanel1.add(jBut2);
        jBut2.setBounds(500, 590, 116, 116);

        jBut3.setMaximumSize(new java.awt.Dimension(0, 0));
        jBut3.setMinimumSize(null);
        jBut3.setPreferredSize(new java.awt.Dimension(116, 116));
        jBut3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBut3ActionPerformed(evt);
            }
        });
        jPanel1.add(jBut3);
        jBut3.setBounds(630, 590, 116, 116);

        jBut4.setMaximumSize(new java.awt.Dimension(0, 0));
        jBut4.setMinimumSize(null);
        jBut4.setPreferredSize(new java.awt.Dimension(116, 116));
        jBut4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBut4ActionPerformed(evt);
            }
        });
        jPanel1.add(jBut4);
        jBut4.setBounds(240, 730, 116, 116);

        jBut5.setMaximumSize(new java.awt.Dimension(0, 0));
        jBut5.setMinimumSize(null);
        jBut5.setPreferredSize(new java.awt.Dimension(116, 116));
        jBut5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBut5ActionPerformed(evt);
            }
        });
        jPanel1.add(jBut5);
        jBut5.setBounds(370, 730, 116, 116);

        jBut6.setMaximumSize(new java.awt.Dimension(0, 0));
        jBut6.setMinimumSize(null);
        jBut6.setPreferredSize(new java.awt.Dimension(116, 116));
        jBut6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBut6ActionPerformed(evt);
            }
        });
        jPanel1.add(jBut6);
        jBut6.setBounds(500, 730, 116, 116);

        jButPlus.setEnabled(false);
        jButPlus.setMaximumSize(new java.awt.Dimension(0, 0));
        jButPlus.setMinimumSize(null);
        jButPlus.setPreferredSize(new java.awt.Dimension(116, 116));
        jButPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButPlusActionPerformed(evt);
            }
        });
        jPanel1.add(jButPlus);
        jButPlus.setBounds(630, 730, 116, 116);

        jBut7.setMaximumSize(new java.awt.Dimension(0, 0));
        jBut7.setMinimumSize(null);
        jBut7.setPreferredSize(new java.awt.Dimension(116, 116));
        jBut7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBut7ActionPerformed(evt);
            }
        });
        jPanel1.add(jBut7);
        jBut7.setBounds(240, 860, 116, 116);

        jBut8.setMaximumSize(new java.awt.Dimension(0, 0));
        jBut8.setMinimumSize(null);
        jBut8.setPreferredSize(new java.awt.Dimension(116, 116));
        jBut8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBut8ActionPerformed(evt);
            }
        });
        jPanel1.add(jBut8);
        jBut8.setBounds(370, 860, 116, 116);

        jBut9.setMaximumSize(new java.awt.Dimension(0, 0));
        jBut9.setMinimumSize(null);
        jBut9.setPreferredSize(new java.awt.Dimension(116, 116));
        jBut9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBut9ActionPerformed(evt);
            }
        });
        jPanel1.add(jBut9);
        jBut9.setBounds(500, 860, 116, 116);

        jButEgal.setEnabled(false);
        jButEgal.setMaximumSize(new java.awt.Dimension(0, 0));
        jButEgal.setMinimumSize(null);
        jButEgal.setPreferredSize(new java.awt.Dimension(116, 116));
        jButEgal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButEgalActionPerformed(evt);
            }
        });
        jPanel1.add(jButEgal);
        jButEgal.setBounds(630, 860, 116, 116);

        screenField.setBackground(new java.awt.Color(255, 255, 255));
        screenField.setFont(new java.awt.Font("Adobe Arabic", 1, 36)); // NOI18N
        screenField.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        screenField.setText("Bienvenue");
        screenField.setToolTipText("");
        jPanel1.add(screenField);
        screenField.setBounds(230, 340, 520, 150);

        bgLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/img/bg.png"))); // NOI18N
        jPanel1.add(bgLabel);
        bgLabel.setBounds(200, 230, 610, 800);

        butX.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/img/butX.png"))); // NOI18N
        butX.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                butXMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                butXMouseExited(evt);
            }
        });
        butX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butXActionPerformed(evt);
            }
        });
        jPanel1.add(butX);
        butX.setBounds(660, 160, 113, 150);

        butNormal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/img/butNormal.png"))); // NOI18N
        butNormal.setSelected(true);
        butNormal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                butNormalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                butNormalMouseExited(evt);
            }
        });
        butNormal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butNormalActionPerformed(evt);
            }
        });
        jPanel1.add(butNormal);
        butNormal.setBounds(780, 320, 120, 70);

        butAleatoire.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/img/butAleatoire.png"))); // NOI18N
        butAleatoire.setText("jButton2");
        butAleatoire.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                butAleatoireMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                butAleatoireMouseExited(evt);
            }
        });
        butAleatoire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butAleatoireActionPerformed(evt);
            }
        });
        jPanel1.add(butAleatoire);
        butAleatoire.setBounds(730, 400, 120, 70);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1004, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1232, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBut0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBut0ActionPerformed
        if (butNormal.isSelected())
            affichage(0);
        else if (butAleatoire.isSelected())
            resultRandom(0);
    }//GEN-LAST:event_jBut0ActionPerformed

    private void jBut1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBut1ActionPerformed
        if (butNormal.isSelected())
            affichage(1);
        else if (butAleatoire.isSelected())
            resultRandom(1);
    }//GEN-LAST:event_jBut1ActionPerformed

    private void jBut2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBut2ActionPerformed
        if (butNormal.isSelected())
            affichage(2);
        else if (butAleatoire.isSelected())
            resultRandom(2);
    }//GEN-LAST:event_jBut2ActionPerformed

    private void jBut3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBut3ActionPerformed
        if (butNormal.isSelected())
            affichage(3);
        else if (butAleatoire.isSelected())
            resultRandom(3);
    }//GEN-LAST:event_jBut3ActionPerformed

    private void jBut4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBut4ActionPerformed
        if (butNormal.isSelected())
            affichage(4);
        else if (butAleatoire.isSelected())
            resultRandom(4);
    }//GEN-LAST:event_jBut4ActionPerformed

    private void jBut5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBut5ActionPerformed
        if (butNormal.isSelected())
            affichage(5);
        else if (butAleatoire.isSelected())
            resultRandom(5);
    }//GEN-LAST:event_jBut5ActionPerformed

    private void jBut6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBut6ActionPerformed
        if (butNormal.isSelected())
            affichage(6);
        else if (butAleatoire.isSelected())
            resultRandom(6);
    }//GEN-LAST:event_jBut6ActionPerformed

    private void jBut7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBut7ActionPerformed
        if (butNormal.isSelected())
            affichage(7);
        else if (butAleatoire.isSelected())
            resultRandom(7);
    }//GEN-LAST:event_jBut7ActionPerformed

    private void jBut8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBut8ActionPerformed
        if (butNormal.isSelected())
            affichage(8);
        else if (butAleatoire.isSelected())
            resultRandom(8);
    }//GEN-LAST:event_jBut8ActionPerformed

    private void jBut9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBut9ActionPerformed
        if (butNormal.isSelected())
            affichage(9);
        else if (butAleatoire.isSelected())
            resultRandom(9);
    }//GEN-LAST:event_jBut9ActionPerformed

    private void jButPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButPlusActionPerformed
        etape1=true;
        butPlus.setDisabled();
        String text = screenField.getText();
        screenField.setText(text + " + " );
        whichLockNumber();
    }//GEN-LAST:event_jButPlusActionPerformed

    private void jButEgalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButEgalActionPerformed
        etape2=true;
        butEgal.setDisabled();
        String text = screenField.getText();
        screenField.setText(text + " = " );
        unlockAllNumber();
    }//GEN-LAST:event_jButEgalActionPerformed

    private void butXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butXActionPerformed
        System.exit(0);
    }//GEN-LAST:event_butXActionPerformed

    private void butXMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butXMouseEntered
       butX.setBounds(660, 155, 113, 150);
    }//GEN-LAST:event_butXMouseEntered

    private void butXMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butXMouseExited
       butX.setBounds(660, 170, 113, 150);
    }//GEN-LAST:event_butXMouseExited

    private void butAleatoireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butAleatoireActionPerformed
        randomMode();
        butPlus.setDisabled();
        butEgal.setDisabled();
        
        butNormal.setSelected(false);
        butAleatoire.setSelected(true);
        butAleatoire.setBounds(790, 400, 120, 70);
        butNormal.setBounds(730, 320, 120, 70);

    }//GEN-LAST:event_butAleatoireActionPerformed

    
    private void butAleatoireMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butAleatoireMouseExited
        if(!butAleatoire.isSelected())
            butAleatoire.setBounds(730, 400, 120, 70);
    }//GEN-LAST:event_butAleatoireMouseExited

    private void butAleatoireMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butAleatoireMouseEntered
        if(!butAleatoire.isSelected())
            butAleatoire.setBounds(790, 400, 120, 70);
    }//GEN-LAST:event_butAleatoireMouseEntered

    private void butNormalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butNormalActionPerformed
        calcul = new Calcul();
        etape1 = false ;       
        etape2 = false ; 
        butNormal.setSelected(true);
        butAleatoire.setSelected(false);
        screenField.setText("");
        butAleatoire.setBounds(730, 400, 120, 70);
        butNormal.setBounds(780, 320, 120, 70);

    }//GEN-LAST:event_butNormalActionPerformed

    private void butNormalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butNormalMouseEntered
        if(!butNormal.isSelected())
            butNormal.setBounds(780, 320, 120, 70);
    }//GEN-LAST:event_butNormalMouseEntered

    private void butNormalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butNormalMouseExited
        if(!butNormal.isSelected())
            butNormal.setBounds(730, 320, 120, 70);
    }//GEN-LAST:event_butNormalMouseExited

    
    
    private void timerStop(int stopTimer)
    {         
        int delais=1000;
        ActionListener tache_timer;
                      
 
        tache_timer= new ActionListener()  
        {                     
            public void actionPerformed(ActionEvent e1)  
            {               
                seconde++;
                 if(seconde==60)  
                {
                      seconde=0;
                      minute++;
                }
                if(minute==60) 
                {
                    minute=0;               
                }
             
                System.out.println(seconde + " sec");
                if(seconde == stopTimer && stopTimer == 3 )
                {                                                        
                    but0.setDisabled();         
                    butNormal.setEnabled(false);
                    butAleatoire.setEnabled(false);
                   
                }
                else if(seconde == 3)
                {
                    System.exit(0);        
                }
            }
        };
     
        timer=new Timer(delais,tache_timer);
        timer.start();
    
    }
    
    
    
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bgLabel;
    private javax.swing.JButton butAleatoire;
    private javax.swing.JButton butNormal;
    private javax.swing.JButton butX;
    private javax.swing.JButton jBut0;
    private javax.swing.JButton jBut1;
    private javax.swing.JButton jBut2;
    private javax.swing.JButton jBut3;
    private javax.swing.JButton jBut4;
    private javax.swing.JButton jBut5;
    private javax.swing.JButton jBut6;
    private javax.swing.JButton jBut7;
    private javax.swing.JButton jBut8;
    private javax.swing.JButton jBut9;
    private javax.swing.JButton jButEgal;
    private javax.swing.JButton jButPlus;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel screenField;
    // End of variables declaration//GEN-END:variables
}
