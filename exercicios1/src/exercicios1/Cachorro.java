
package exercicios1;


public class Cachorro {
    //atributos do cachorro
    String raca;
    String porte;
    float tamanho;
    boolean dormindo;
    void status(){
        System.out.println(" A raça do cachorro é "+this.raca);
        System.out.println("O porte do cachorro é "+this.porte);
        System.out.println("O tamanho é "+this.tamanho);
        System.out.println("O cachorro está dormindo ? "+this.dormindo);
        
        
        
    }
    
    void chamar(){
        if(dormindo==true){
            System.out.println("O cachorro esta dormindo");
        }else{
            System.out.println("O cachorro vai correr");
        }
        
    }
    void correr(){
        this.dormindo=false;
        
        
    }
    void dormir(){
        this.dormindo=true;
        
    }
    
}

