
package com.mycompany.somarnumeros;

import java.util.Scanner;

/**
 *
 * @author Natã
 * Método para calcular a soma de dois números
 */
public class SomarNumeros {

    public static void main(String[] args) {
        
        /*Scanner teclado = new Scanner (System.in);
        System.out.println("Digite o primeiro número: ");
        int num1 = teclado.nextInt();
        
        System.out.println("Digite o segundo número: ");
        int num2 = teclado.nextInt();
        
        System.out.println("A soma é: " + soma (num1, num2));
        
        }
    public static int soma (int num1, int num2){
        return num1 + num2;*/
        
        Scanner teclado = new Scanner (System.in);
        System.out.println("Soma = 1\n"
                + "Subtrair = 2\n"
                + "Multiplicar = 3\n"
                + "Dividir = 4\n");
        System.out.println("Escolha seu método de calculo: ");
        
        
        int escolhas = teclado.nextInt();
        
        System.out.println("Digite o primeiro número: ");
        double num1 = teclado.nextDouble();
                
        System.out.println("Digite o segundo número: ");
        double num2 = teclado.nextDouble();
        
        switch(escolhas){
            case 1:
                System.out.println("Resultado da soma é: " + soma (num1, num2));
                break;
            case 2:
                System.out.println("Resultado da subtração é: " + subtração (num1, num2));
                break;
            case 3:
                System.out.println("Resultado da multiplicação é: " + multiplicação (num1, num2));
                break;
            case 4:
                System.out.println("Resultado da divisão é: " + divisão (num1, num2));
                break;
            default:
                System.out.println("Número inexistente");
                break;
        }
     
    }
        public static double soma (double num1, double num2){
        return num1 + num2;                     
        }
        public static double subtração (double num1, double num2){
        return num1 - num2;
        }
        public static double multiplicação (double num1, double num2){
        return num1 * num2;
        }
        public static double divisão (double num1, double num2){
        return num1 / num2;
        }
}  

    

