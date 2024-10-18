
package aula12;


public class Peixe extends Animal{
    private String corEscama;

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    

    @Override
    public void Locomover() {
        System.out.println("nadando");
    }

    @Override
    public void Alimentar() {
        System.out.println("comendo substancia");
    }

    @Override
    public void emitirSom() {
        System.out.println("peixe nao faz som");
    }
    public void soltarBolha(){
        System.out.println("soltou uma bolha");
    }
    
    
}
