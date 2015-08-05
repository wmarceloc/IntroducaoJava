/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introducaojava;
import java.util.Scanner;
/**
 *
 * @author sabado
 */
public class IntroducaoJava {

    public static void main(String[] args) {
    Scanner teste = new Scanner (System.in);
    System.out.println ("Informe um valor ");
    int retorno = teste.nextInt();
    while (retorno !=0){
        
    System.out.println("Informe outro Valor ");
    retorno = teste.nextInt();
            }
    System.out.println("Informado com sucesso ");
         
    }
}
