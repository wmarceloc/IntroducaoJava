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
            
            case '4':
                int x; // know to all code within main
                x = 10;
                if (x==10){// start new scope
                    int y = 20;// known only to this block
                    
                    // x and y both known here
                    System.out.println("x and y: "+x+""+y);
                    x = y*2;
                }
            // y=100; // Error! y not known here
            // x is still known here.
            
            System.out.println("x is " + x);
                
            case '5':
                //listing 17 Demonstrate casting
                double z,y;
                byte b;
                int i;
                char ch;
                
                z=10.0;
                y=3.0;
                
                i= (int)(z/y);//cast double to int
                System.out.println("Integer outcome of z/y:" + i);
                
                i=100;
                b=(byte)i;
                System.out.println("Value of b: "+b);
                
                i= 257;
                b =(byte)i;
                System.out.println("Value of b: "+b);
                
                b=90; //ASCI code for z
                ch = (char)b;
                System.out.println("ch: "+ch);
            
                
            case '6':
               
                ch = 'A';
                System.out.println("ch contains "+ch);
                ch++; //increment ch
                System.out.println("ch is now "+ch);
                ch=90;//give ch the value Z
                System.out.println("ch is now " +ch);
             
           
             
            case '7':
                double gallons;
                double liters;
                
                gallons = 10; //start with 10 galons
                liters = gallons * 3.7854; // convert to liters
                
                System.out.println(gallons +" gallons is " + liters + " liters");
                
            case '8':
                //listing 12 demonstrate the relational and logical operator
                
                int j;
                boolean b1, b2;
                
                i = 10;
                j = 11;
                if(i<j)System.out.println("i<j");
                if(i<=j)System.out.println("i<=j");
                if(i!=j)System.out.println("i!=j");
                if(i==j)System.out.println("This won't execute");
                if(i>=j)System.out.println("This won't execute");
                if(i>j)System.out.println("This won't execute");
                
                b1=true;
                b2=false;
                
                if(b1 & b2) System.out.println("This won't execute");
                if(!(b1 & b2))System.out.println("!(b1 & b2) is true");
                if(b1 | b2) System.out.println("b1 | b2 is true");
                if(b1 ^ b2)System.out.println("b1 ^ b2 is true");
                       
            case '9':
                int k, l, m = 0;
                k=1;
                l=2;
                if(k<l)System.out.println("k is less than l");
                // this won't display anything
                if(k==l) System.out.println("you won't see this");
                
                System.out.println();
                
                System.out.println("m contains ~1");
                if(m >=0)System.out.println("m is non-negative");
                if(m <0)System.out.println("m is negative");
                System.out.println();
                
                m = l - k;//m now contains 1
                System.out.println("m contains 1");
                if(m>=0) System.out.println("m is non-negative");
                if(m<0) System.out.println("m is negative");
                
                
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
