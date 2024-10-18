
package aula12;

public class Mamifero extends Animal{
    private String CorPelo;

    public String getCorPelo() {
        return CorPelo;
    }

    public void setCorPelo(String CorPelo) {
        this.CorPelo = CorPelo;
    }
    

    @Override
    public void Locomover() {
        System.out.println("correndo");
    }

    @Override
    public void Alimentar() {
        System.out.println("mamando");
    }

    @Override
    public void emitirSom() {
        System.out.println("som de mamifero");
    }
            
}
