/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula12;

/**
 *
 * @author User
 */
public class Reptil extends Animal {
    private String corEscama;

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    

    @Override
    public void Locomover() {
        System.out.println("rastejando");
    }

    @Override
    public void Alimentar() {
        System.out.println("comendo vegetal");
    }

    @Override
    public void emitirSom() {
        System.out.println("som de reptil");
    }
    
}
