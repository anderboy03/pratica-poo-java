
package aula02;


public class Aula02 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Caneta c1 = new Caneta();//instanciar classe caneta 1
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.destampar();
        c1.carga=80;
        c1.modelo="bic";
        c1.rabiscar();
        c1.status();//chamada de metodos
        
        Caneta c2 = new Caneta();//instanciar classe caneta 2
        c2.cor = "Preta";
        c2.modelo = "Hort";
        c2.ponta = 1.0f;
        c2.carga=50;
        c2.rabiscar();
        c2.tampar();
        c2.status();//chamada de metodos caneta c2
        
    }
    
}
