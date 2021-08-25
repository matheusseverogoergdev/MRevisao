/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisao;

import java.text.NumberFormat;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class IMC {

    
    public static String leTexto(){
        Scanner teclado =  new Scanner(System.in);
        return teclado.nextLine();
    }
    
    public static String lePalavra(){
        Scanner teclado = new Scanner(System.in);
        return teclado.next();
    }
    
    public static void main(String[] args) {
        
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        float peso, altura, imc;
        String nome, saida = "s";
        boolean s = true;
        
        while (s) {
        
            System.out.println("----- Calculadora IMC -----");
            System.out.print("\nInforme seu nome: ");
            nome = leTexto();
            System.out.print("\nInforme seu peso: ");
            peso = ler.nextFloat();
            System.out.print("\nInforme sua altura: ");
            altura = ler.nextFloat();
            imc = peso / (altura * altura);


            System.out.println("");
            System.out.println("Resultado com IF com formatação na saída");
            if (imc < 18.5) {
                System.out.printf(nome + " seu IMC é: %.2f, e define Magreza.", imc);
            } else if (imc <= 24.9) {
                System.out.printf(nome + " seu IMC é: %.2f, e define Normal.", imc);
            } else if (imc <= 30) {
                System.out.printf(nome + " seu IMC é: %.2f, e define Sobrepeso.", imc);
            } else {
                System.out.printf(nome + " seu IMC é: %.2f, e define Obesidade.", imc);
            }

            System.out.println("\n\nNumberFormat");
            NumberFormat nf = NumberFormat.getInstance();
            nf.setMaximumFractionDigits(2);
            System.out.println(nf.format(imc));

            System.out.println("\nDecimalFormat");
            DecimalFormat df = new DecimalFormat("#,###.00");
            System.out.println(df.format(imc));
            
            System.out.println("\nVocê deseja calcular o IMC novamente?\n(s) para continuar: ");
            saida = lePalavra();
            s = saida.equalsIgnoreCase("s");
            
        }
   } 
}
