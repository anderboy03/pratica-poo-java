/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula13b;

/**
 *
 * @author User
 */
public class Aula13b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cachorro x = new Cachorro();
        x.reagir("Ola");
        x.reagir("vai apanhar");
        x.reagir(11,45);
        x.reagir(21, 00);
        x.reagir(false);
        x.reagir("falso");
        x.reagir(2, 12.5f);
        x.reagir(17, 4.5f);
    }
    
}
