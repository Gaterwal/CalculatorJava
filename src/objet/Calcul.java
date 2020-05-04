/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objet;

/**
 *
 * @author Obuu
 */
public class Calcul 
{
    int value1;
    boolean isValue1Set;
    int value2;
    boolean isValue2Set;
    int value3;
    boolean isValue3Set;
    boolean valuePlus;
    boolean valueEgal;
    int valueResult;
    
    
    
    public Calcul()
    {
        
    }

    
    public void setValue1(int value1) {
        this.value1 = value1;
    }

    public void setValue2(int value2) {
        this.value2 = value2;
    }
    
    public void setValue3(int value3) {
        this.value3 = value3;
    }

    public void setValuePlus(boolean valuePlus) {
        this.valuePlus = valuePlus;
    }

    public void setValueEgal(boolean valueEgal) {
        this.valueEgal = valueEgal;
    }

    public void setValueResult(int valueResult) {
        this.valueResult = valueResult;
    }
    
    public void  setIsValue1Set(boolean pIsValue1Set)
    {
        this.isValue1Set = pIsValue1Set;
    }
    
      
     public void  setIsValue2Set(boolean pIsValue2Set)
    {
        this.isValue2Set = pIsValue2Set;
    }
     
     
     public void  setIsValue3Set(boolean pIsValue3Set)
    {
        this.isValue3Set = pIsValue3Set;
    }
    
    public boolean isValue1Set()
    {
        return isValue1Set;
    }
   
    
    public boolean isValue2Set()
    {
        return isValue2Set;
    }
    
    public boolean isValue3Set()
    {
        return isValue3Set;
    }

    public int getValue1() {
        return value1;
    }

    public int getValue2() {
        return value2;
    }

    public int getValue3() {
        return value3;
    }

    public boolean isValuePlus() {
        return valuePlus;
    }

    public boolean isValueEgal() {
        return valueEgal;
    }

    public int getValueResult() {
        return valueResult;
    }
            
    
    
    
    
}

