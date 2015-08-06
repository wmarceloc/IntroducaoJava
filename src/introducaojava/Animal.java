
package introducaojava;

public class Animal {
String nome = null;
int idade;
double peso;
String CorOlhos;

public String Comer (String mensagem ){
    System.out.println("Quero Comer");
    String resultado = "Mais";
    if(this.mensagem != "Ainda com fome"){
        System.out.println("Estou satisfeito");
        resultado = "Obrigado";
        
    }else{
    
    System.out.println("Ola, estou com fome, quero comer");
    return resultado;   
    }
    return null;
    
 
}       

public int Dormir (){
    System.out.println("Bucho cheio, agora vou JIBOIAR");
    return 1;
}

}
