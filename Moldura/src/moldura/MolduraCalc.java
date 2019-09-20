/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moldura;

import javax.swing.JOptionPane;

/**
 *
 * @author paulo
 */
public class MolduraCalc {

    private float baseMaior;
    private float baseMenor;
    private float alturaMaior;
    private float alturaMenor;
    private float espessura;
    private float areaMaior;
    private float areaMenor;
    private float moldura;
    
    
    
    public MolduraCalc(float b, float alt, float esp) {
        
        baseMaior = b;
        alturaMaior = alt;
        espessura = esp;
        areaMaior = baseMaior * alturaMaior;

        
    }
    
    public void CalculaMold(){
        
        espessura *= 2;
        baseMenor = baseMaior - espessura;
        alturaMenor = alturaMaior - espessura;
        //Calculo da area menor
        areaMenor = baseMenor * alturaMenor;
        //Calculo da moldura
        moldura =  areaMaior - areaMenor ;
        
        
        JOptionPane.showMessageDialog(null, "A area da muldura é: " + moldura);
        
    }
    
    
}
