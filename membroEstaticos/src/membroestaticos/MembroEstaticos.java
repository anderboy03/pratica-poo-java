
package membroestaticos;


public class MembroEstaticos {

    
    public static void main(String[] args) {
        boolean trabalho1= true;
        boolean trabalho2=false;
       
        
        boolean comprouTv50= trabalho1 && trabalho2;//ou
        boolean comprouTv32= trabalho1 ^ trabalho2; //or
        boolean comprouTv20= trabalho1 || trabalho2;//e
        System.out.println("comprou TV 50\"?" + comprouTv50);
        System.out.println("comprou TV 32\"?" + comprouTv32);
        System.out.println("comprou TV 20\"?" + comprouTv20);
        //unario
        System.out.println("mais saudavel?" + !comprouTv20);
        
        
                
                
    }
    
}
