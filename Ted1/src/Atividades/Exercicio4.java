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
public class Exercicio4 {
    
    Scanner sc = new Scanner(System.in);
    private float ladoA;
    private float ladoB;
    private float ladoC;
    
    public void Ex4Run(){
    
        System.out.println("Informe o lado A do triangulo: ");
        ladoA = sc.nextFloat();
        System.out.println("Agora informe o lado B do triangulo: ");
        ladoB = sc.nextFloat();
        System.out.println("Por fim informe o lado C do triangulo: ");
        ladoC = sc.nextFloat();
        
    
        if((ladoA == 0 || ladoB == 0 || ladoC == 0)||(ladoA > ladoB +ladoC || ladoB > ladoA +ladoC || ladoC > ladoB +ladoA)){
            
            System.out.println("Com esses dados é impossivel formar um triangulo!");
            
        }else{
            
            if(ladoA == ladoB && ladoB == ladoC && ladoC == ladoA){
                
                System.out.println("Esse triangulo é EQUILÁTERO");
                
            }else if(ladoA == ladoB || ladoB == ladoC || ladoC == ladoA){
            
                System.out.println("Esse triangulo é ISÓSCELES");
                
            }else{
            
                System.out.println("Esse triangulo é ESCALENO");
                
            }
        
        }
    }
    
}
