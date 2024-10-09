
package aula05;


public class Aula05 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        ContaBanco p1 = new ContaBanco();//instancie novo objeto
        p1.setNumConta(1111);
        p1.setDono("Anderson");
        p1.estadoAtual();
        p1.abriConta("CC");
        
        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(2222);
        p2.setDono("Fernanda");
        p2.abriConta("CP");
        p2.estadoAtual();
        
        p1.depositar(100);
        p2.depositar(500);
        
        p2.sacar(100);
        
        p1.fecharConta();
        
        
    }
    
}
