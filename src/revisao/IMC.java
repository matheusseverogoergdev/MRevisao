/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisao;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class IMC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        float peso, altura, imc;
        String nome;
        
        System.out.println("----- Calculadora IMC -----");
        System.out.println("");
        System.out.print("Informe seu nome: ");
        //ler.nextLine();
        nome = ler.nextLine();
        System.out.println("");
        System.out.print("Informe seu peso: ");
        peso = ler.nextFloat();
        System.out.println("");
        System.out.print("Informe sua altura: ");
        altura = ler.nextFloat();
        imc = peso / (altura * altura);
        
        
        System.out.println("");
        System.out.println("Resultado com IF");
        if (imc < 18.5) {
            System.out.println(nome + " seu IMC é: " + imc + ", e define Magreza.");
        } else if (imc <= 24.9) {
            System.out.println(nome + " seu IMC é: " + imc + ", e define Normal.");
        } else if (imc <= 30) {
            System.out.println(nome + " seu IMC é: " + imc + ", e define Sobrepeso.");
        } else {
            System.out.println(nome + " seu IMC é: " + imc + ", e define Obesidade.");
        }
   } 
}
