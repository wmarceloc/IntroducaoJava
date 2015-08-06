
package introducaojava;

public class Animal {
String nome = null;
int idade;
double peso;
String CorOlhos;

public String Comer ( ){
    int valorComida = 10;
    String mensagem = "Ainda com fome";
    System.out.println("Ola, estou com fome, quero comer");
    return mensagem;
 
}       

public int Dormir (){
    System.out.println("Bucho cheio, agora vou JIBOIAR");
    return 1;
}

}
