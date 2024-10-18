
package aula12;


public class Ave extends Animal{
    private String corPena;

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
    

    @Override
    public void Locomover() {
        System.out.println("voando");
    }

    @Override
    public void Alimentar() {
        System.out.println("comendo frutas");
    }

    @Override
    public void emitirSom() {
        System.out.println("soms de aves");
    }
    public void fazerNinho(){
        System.out.println("construiu um ninho");
    }
    
}
