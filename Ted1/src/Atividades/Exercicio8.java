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
public class Exercicio8 {
  
   private float x;
   private float valorMaior = Float.MIN_VALUE;
   private float valorMenor = Float.MAX_VALUE;
   private float media;
   private float somatorio;
   
   Scanner sc = new Scanner(System.in);
   
   public void Ex8Run(){
   
       System.out.println("Digite 5 numeros: ");
       
       for(int i = 1; i <= 5; i++){
           
           System.out.println("Valor "+i+":\n");
           x = sc.nextFloat();
       
           if(x > valorMaior){
               
               valorMaior = x;
           
           }if(x < valorMenor){
           
               valorMenor = x;
               
           }
           
           somatorio += x;
        }
       
        media = somatorio / 5;
        
        System.out.println("Maior valor: "+ valorMaior+ "  Menor valor: "+ valorMenor+ "  Media: "+ media+ "  Somatório: "+somatorio);
        
       
   }
   
   
}
