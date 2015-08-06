/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introducaojava;

import java.io.IOException;
//import java.util.Scanner;
/**
 *
 * @author sabado
 */
public class IntroducaoJava {

    
    public static void main(String[] args) throws IOException{
        
     
        char choice;
        
        System.out.println("Help on");
        System.out.println(" 1.if");
        System.out.println(" 2.switch");
        System.out.println("Choose one:");
        choice = (char)System.in.read();
        System.out.println("\n");
        
        switch (choice){
            case '1':
                System.out.println("The if:\n");
                System.out.println("if(condition)statement");
                System.out.println("else statement");
                break;
            case '2':
                System.out.println("The switch:\n");
                System.out.println("switch (expression){");
                System.out.println(" case constant:");
                System.out.println(" statement sequence");
                System.out.println(" break;");
                System.out.println(" //...");
                System.out.println("}");
                break;
            case '3':
                double earthweight;
                double moonweight;
                
                earthweight = 165;
                moonweight = earthweight*0.17;
                
                System.out.println(earthweight + " earth-pounds in equivalent to " + moonweight + " moon-pounds");
                
            default:
                System.out.println("Selection not found");
                     
        }
        
    }

        //AULA DE QUARTA-FEIRA
//        Aves objetoPassaro = new Aves();
//        String resultado = objetoPassaro.Comer("mais");
//        if (resultado == "mais"){
//            System.out.println("Vou enviar mais comida");
        }
        
//    Scanner teste = new Scanner (System.in);
//    System.out.println ("Informe um valor ");
//    int retorno = teste.nextInt();
//    while (retorno !=0){
//        
//    System.out.println("Informe outro Valor ");
//    retorno = teste.nextInt();
//            }
//    System.out.println("Informado com sucesso ");
//    
      
        
        
    }
