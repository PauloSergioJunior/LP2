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
public class Exercicio6 {
   Scanner sc = new Scanner(System.in);
    private int valorVerificar;
    
    
    public void Ex6Run(){
    
        while(valorVerificar != -1){
            
            System.out.println("Digite um numero para verificarmos se é PAR ou IMPAR: ");
            valorVerificar = sc.nextInt();

            if(valorVerificar != -1){
            
                if(valorVerificar % 2 == 0){
                    System.out.println(valorVerificar+" é um numero PAR!\n");
                }else{
                    System.out.println(valorVerificar+" é um numero IMPAR!\n");
                }

                System.out.println("Para finalizar a execução digite -1\n");
                            
            }
        }    
        
    } 
        
}
