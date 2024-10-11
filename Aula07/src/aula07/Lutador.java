
package aula07;

public class Lutador {
    //atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitoria;
    private int derrota;
    private int empate;
    
    //metodos especias constructor e getter e setters

   
    
    
    
    
    //metodos
    public void  apresentar(){
        System.out.println("----------------------------------------------------------");
        System.out.println("CHEGOU A HORA ! APRESENTAMOS O LUTADOR "+this.getNome());
        System.out.println("DIRETAMENTE DE "+this.getNacionalidade());
        System.out.println("COM "+this.getIdade()+ "anos de "+this.getAltura());
        System.out.println("PESANDO "+this.getPeso()+"kg");
        System.out.println(this.getVitoria()+ " VITORIAS");
        System.out.println(this.getDerrota()+ " DERROTAS");
        System.out.println(this.getEmpate()+"  EMPATES");
        System.out.println("------------------------------------------------------------");
        
        
        
    }
    public void status(){
        System.out.println(this.getNome()+" é um peso " +this.getCategoria());
        System.out.println("GANHOU "+ this.getVitoria()+ " vezes");
        System.out.println("PERDEU" + this.getDerrota()+ " VEZES" );
        System.out.println("EMPATOU "+ this.getEmpate() + " VEZES");
        
        
    }
    public void ganharLuta(){
        this.setVitoria(this.getVitoria()+1);
        
        
    }
    public void perderLuta(){
        this.setDerrota(this.getDerrota()+1);
        
        
    }
    public void empatarLuta(){
        this.setEmpate(getEmpate() + 1);
        
        
    }
//construtor
    public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso (pe);
        this.vitoria = vi;
        this.derrota = de;
        this.empate = em;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria( ) {
        if (this.peso<=52.2){
            this.categoria = "INVALIDO";
        }else if(this.peso<=70.3){
            this.categoria = "LEVE";
        }else if( this.peso<=83.9){
            this.categoria="MEDIO";            
        }else if(this.peso<=120.2){
            this.categoria="PESADO";
    }else{
            this.categoria="INVALIDO";
        }
    }

    public int getVitoria() {
        return vitoria;
    }

    public void setVitoria(int vitoria) {
        this.vitoria = vitoria;
    }

    public int getDerrota() {
        return derrota;
    }

    public void setDerrota(int derrota) {
        this.derrota = derrota;
    }

    public int getEmpate() {
        return empate;
    }

    public void setEmpate(int empate) {
        this.empate = empate;
    }
    
    
    
    
    
    
    
}
