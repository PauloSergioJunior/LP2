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
public class Exercicio7 {
    
    private float nota1;
    private float nota2;
    private float nota3;
    Scanner sc = new Scanner(System.in);
    
    
    public void Ex7Run(){
    
        System.out.println("Digite a primeira nota do aluno: ");
        nota1 = sc.nextFloat();
        
        System.out.println("Digite a segunda nota do aluno: ");
        nota2 = sc.nextFloat();
        
        System.out.println("Digite a terceira nota do aluno: ");
        nota3 = sc.nextFloat();
        
        float media = (nota1 + nota2 + nota3)/3;
        
        if((nota1 >= 0  && nota1 <= 10)&&(nota2 >= 0  && nota2 <= 10)&&(nota3 >= 0  && nota3 <= 10)){
            if(media >= 7.0){

                System.out.println("Foi aprovado com a media de: "+ media);

            }else if(media >= 2.6 && media<= 6.9){

                System.out.println("Ficou em Recuperação com a media de: "+ media);

            }else{

                System.out.println("Foi reprovado com a media de: "+ media);

            }
        }else{
        
            System.out.println("A nota so pode ser entre 0 a 10!");
        
        }    
    }
}
