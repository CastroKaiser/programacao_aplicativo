/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_7;
/**
 *
 * @author c.nunes
 */
import java.util.Scanner;

public class Projeto_7 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Insira o peso do usuario:");
        float peso = ler.nextFloat();
        
        System.out.println("Insira a altura do usuario:");
        float altura = ler.nextFloat();
        
        float IMC = peso/(altura * altura);
        
        if(IMC <= 18.8){
            System.out.println("Abaixo do peso normal");
        }else if(IMC <= 24.9){
            System.out.println("Peso Normal");
        }else if(IMC <= 29.9){
            System.out.println("Excesso de Peso");
        }else if(IMC <= 34.9){
            System.out.println("Obesidade Classe I");
        }else if(IMC <= 39.9){
            System.out.println("Obesidade Classe II");
        }else if(IMC >= 40.0){
            System.out.println("Obesidade Classe III");
        }
    }
}
