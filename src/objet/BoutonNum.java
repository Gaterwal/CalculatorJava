/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objet;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author Obuu
 */
public class BoutonNum  extends JButton
{
    protected int value;
    protected String img;
    protected String imgPress;
    protected String imgHover;
    protected String imgLock;
    protected JButton bt;

      
   public BoutonNum(JButton bt , int pValue , String img , String imgPress ,String imgHover , String imgLock )
   {
        this.bt = bt;
        this.value = pValue;
        this.img = img;
        this.imgPress =imgPress;
        this.imgHover =imgHover;
        this.imgLock =imgLock;
        
        bt.setIcon(new javax.swing.ImageIcon(getClass().getResource(img)));   
        bt.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource(imgPress)));
        bt.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource(imgHover)));
        
        bt.setFocusable(false);
        bt.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource(imgLock)));
        bt.setFocusPainted(false);
        bt.setMargin(null);           
        bt.setBorder(BorderFactory.createEmptyBorder());
        bt.setContentAreaFilled(false);
    }

   

    public void setValue(int value) {
        this.value = value;
    }
 
 
    public void setImg(String img) {
        this.img = img;
    }


    public void setImg2(String imgPress) {
        this.imgPress = imgPress;
    }
   
  
   public void setEnabled()
   {
        bt.setEnabled(true);
   }
   
   public void setDisabled()
   {
       bt.setEnabled(false);
   }
   
    public int getValue() {
        return value;
    }
    
     public String getImgPress() {
        return imgPress;
    }
     
    public String getImg() {
        return img;
    }
    
}
