
package introducaojava;

public class Aves extends Animal {
    String CorPenas = null;
    int TamanhoPernas;
    
    public int BotarOvo (){
        return 1;
    }

    @Override
    public String Comer(String mensagem) {
        return super.Comer(mensagem); //To change body of generated methods, choose Tools | Templates.
    }

    
    @Override
    public int Dormir() {
        return super.Dormir(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
