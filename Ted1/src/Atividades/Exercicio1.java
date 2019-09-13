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
public class Exercicio1 {
    
    Scanner sc = new Scanner(System.in);
    private float valorPag;
    private float valorProd;
    
    public void Ex1Run(){
        
        System.out.println("Digite o valor do pagamento: ");
        valorPag = sc.nextFloat();

        System.out.println("Agora digite o valor do produto: ");
        valorProd = sc.nextFloat();
        
        float troco = valorPag - valorProd;
        
        System.out.println("O troco a ser dado é: "+troco+" Reais");
    }
    
}
