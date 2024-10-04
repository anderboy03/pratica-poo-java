/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carro;

/**
 *
 * @author User
 */
public class Carro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Uno c1 = new Uno();
       c1.modelo="Uno";
       c1.cor="laranja";
       c1.combustivel="Alcool";
       c1.potencia=1.0f;
       c1.ligado=false;
       c1.status();
       c1.entrarCarro();
    }
    
}
