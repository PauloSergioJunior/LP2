/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import javax.swing.JOptionPane;
import moldura.MolduraCalc;

/**
 *
 * @author paulo
 */
public class MolduraRun {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        float b;
        float alt;
        float esp;
        
        String bS, altS, espS;
        
        JOptionPane.showMessageDialog(null, "Vamos calcular a area da sua moldura. ", "Bem vindo!", 1);
        
        bS = JOptionPane.showInputDialog(null, "Insira o tamanho do comprimento da moldura em centimetros: ");
        b = Float.parseFloat(bS);
        
        altS = JOptionPane.showInputDialog(null, "Insira o tamanho da altura da moldura em centimetros: ");
        alt = Float.parseFloat(altS);
        
        espS = JOptionPane.showInputDialog(null, "Agora digite o tamanho da espesura da moldura em centimetros");
        esp = Float.parseFloat(espS);
        
        MolduraCalc mc = new MolduraCalc(b, alt, esp);
        
        mc.CalculaMold();
        
    }
    
}
