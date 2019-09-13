/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atividades;

import java.util.Scanner;

/**
 *
 * @author paulo
 */
public class Exercicio2 {
    
    private float valorQuilo;
    private int valorQuiloCon;
    Scanner sc = new Scanner(System.in);
    
    public void Ex2Run(){
    
        System.out.println("Informe o valor do quilo: ");
        valorQuilo = sc.nextFloat();
        
        System.out.println("Informe a quantidade de quilos consumidos: ");
        valorQuiloCon = sc.nextInt();
        
        float valorPago = valorQuilo * valorQuiloCon;
    
        
        System.out.println("O valor a ser pago pelos quilos consumidos é: "+valorPago+" Reais");
    }
    
}
