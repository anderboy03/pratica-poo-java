
package aula12;


public class Aula12 {

    
    public static void main(String[] args) {
        // instanciar os animais que nao seja abstrata
        Mamifero m =new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        
        
        
        Canguru c  = new Canguru();
        Cachorro K =new Cachorro();
        Cobra j = new Cobra();
        Tartaruga t = new Tartaruga();
        Goldfish g =new Goldfish();
        Arara ar = new Arara();
        
        c.Locomover();
        c.usarBolsa();
        K.Locomover();
        K.emitirSom();
        
        
        
    }
    
}
