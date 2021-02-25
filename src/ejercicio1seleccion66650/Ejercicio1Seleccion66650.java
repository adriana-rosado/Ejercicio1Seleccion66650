/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1seleccion66650;

import java.util.Scanner;

/**
 *
 * @author Adriana
 */
public class Ejercicio1Seleccion66650 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entra = new Scanner (System.in);
        
        System.out.println("Dime tres números diferentes");
        System.out.println("Primer numero: ");
        int num1= entra.nextInt();
        System.out.println("Segundo numero: ");
        int num2= entra.nextInt();
        System.out.println("Tercer numero: ");
        int num3= entra.nextInt();
        if (num1>num2 && num1>num3){
                System.out.println("Numero con valor mayor:" + num1);
       
        } else {
            if (num2>num3){
                System.out.println("Numero con valor mayor:" + num2);
            } else {
                System.out.println("Numero con valor mayor:" + num3);
       
            }
                            
        }
    }
}
