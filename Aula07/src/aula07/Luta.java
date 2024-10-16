package aula07;

import java.util.Random;


public class Luta {
    //atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovado;
    //metodos publicos
    public void marcarLuta(Lutador l1,Lutador l2){
       if(l1.getCategoria().equals(l2.getCategoria())
               && l1 != l2){
           this.aprovado =  true;
           this.desafiado = l1;
           this.desafiante = l2;
           
           
       } else{
           this.aprovado = false;
           this.desafiado = null;
           this.desafiante = null;
       }
        
        
    }
    public void lutar(){
        if(this.aprovado){
            System.out.println("#####DESAFIADO#####");
            this.desafiado.apresentar();
            System.out.println("#####DESAFIANTE#####");
            this.desafiante.apresentar();
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);//0,1,2
            switch(vencedor){
                case 0://empate
                    System.out.println("empatou");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                    
                case 1://desafiado vence]
                    System.out.println("vitoria do "+this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                    
                    
                case 2: // desafiante vence  
                    System.out.println("vitoria do "+this.desafiante.getNome());
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
                    
                
                
                
                
            }
                        
        }else{
            System.out.println("Aluta nao pode acontecer");
        }
        
        
    }
    //metodos especiais

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean getAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }
    
}
