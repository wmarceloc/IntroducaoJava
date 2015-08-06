
package introducaojava;

public class Animal {
String nome = null;
int idade;
double peso;
String CorOlhos;

public String Comer (String mensagem ){
    System.out.println("Quero Comer");
    
    String resultado = "mais";
    if(mensagem != "mais"){
        System.out.println("Estou satisfeito");
        resultado = "Obrigado";
        
    }else{
    
            System.out.println("Ola, estou com fome, quero comer");
    }
    return resultado;   
    
    
    
 
}       

public int Dormir (){
    System.out.println("Bucho cheio, agora vou JIBOIAR");
    return 1;
}

}
