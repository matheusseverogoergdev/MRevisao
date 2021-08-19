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
public class Revisao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        boolean verifica; // var booleana | true or false | 0 or 1
        int num1; // var do tipo inteiro | 11 posições
        short num2; // var do tipo small int | inteiro pequeno | 4 posições
        long num3; // big int | inteiro grande | contador do youtube
        double num4; // decimal, numeric com casas decimais valor maior que o float
        float num5; // decimal, numeric com casas decimais
        byte b; // num inteiro, valor máximo 127
        String texto; // aceita tudo em formato texto
        String textoCurto;
        char sexo;
        
        System.out.println("Revisão manhã");
        System.out.print("Informe um número inteiro: ");
        num1 = ler.nextInt();
        System.out.print("Informe um número inteiro pequeno: ");
        num2 = ler.nextShort();
        System.out.print("Informe um número inteiro grande: ");
        num3 = ler.nextLong();
        System.out.print("Informe um número decimal double: ");
        num4 = ler.nextDouble();
        System.out.print("Informe um número decimal: ");
        num5 = ler.nextFloat();
        System.out.print("Informe um valor do tipo byte: ");
        b = ler.nextByte();
        System.out.print("Informe seu nome completo: ");
        ler.nextLine();
        texto = ler.nextLine();
        System.out.print("Informe o primeiro nome de sua mãe: ");
        textoCurto = ler.next();
        System.out.print("Digite seu sexo: ");
        sexo = ler.next().charAt(0);
        
        System.out.println("--- Impressão ---");
        System.out.println("int (num1): " + num1);
        System.out.println("byte: " + b);
        System.out.println("short (num2): " + num2);
        System.out.println("long (num3): " + num3);
        System.out.println("double (num4): " + num4);
        System.out.println("float (num5): " + num5);
        System.out.println("Seu nome é: " + texto);
        System.out.println("O nome de sua mãe é: " + textoCurto);
        System.out.println("Seu sexo é: " + sexo);
        
        verifica = num1 >= num2;
        
        if (verifica) {
            System.out.println("num1 é maior ou igual a num2");
        } else {
            System.out.println("num2 é maior que o num1");
        }
    }
    
}
