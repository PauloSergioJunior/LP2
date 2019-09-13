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
public class Exercicio3 {
    
    Scanner sc = new Scanner(System.in);
    private int valorVerificar;
    
    public void Ex3Run(){
    
        System.out.println("Digite um numero para verificarmos se é PAR ou IMPAR: ");
        valorVerificar = sc.nextInt();
        
        if(valorVerificar % 2 == 0){
            System.out.println(valorVerificar+" é um numero PAR!");
        }else{
            System.out.println(valorVerificar+" é um numero IMPAR!");
        }
    
    }
}
