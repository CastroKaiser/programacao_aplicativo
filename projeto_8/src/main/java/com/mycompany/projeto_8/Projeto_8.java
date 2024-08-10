/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_8;

/**
 *
 * @author c.nunes
 */
import java.util.Scanner;

public class Projeto_8 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Insira a quantidade de medalhas de ouro:");
        int medalha_ouro = ler.nextInt();
        
        System.out.println("Insira a quantidade de medalha de prata:");
        int medalha_prata = ler.nextInt();
        
        System.out.println("Insira a quantidade de medalha de bronze:");
        int medalha_bronze = ler.nextInt();
        
        int medalha_totais = medalha_ouro + medalha_prata + medalha_bronze;
        
        if(medalha_ouro >= 10){
            System.out.println("Otimo desempenho");
        }else if(medalha_ouro >= 5 && medalha_ouro <= 10){
            System.out.println("Bom desempenho");
        }else if(medalha_ouro <= 5 && medalha_totais > 20){
            System.out.println("Desepenho regular");
        }else if(medalha_totais <= 20){
            System.out.println("Desempenho fraco");
        }
    }
}
