/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carro;


public class Uno {
String modelo;     
String cor;
float potencia;
String combustivel;
boolean ligado;
void status(){
    System.out.println(" O modelo do carro e "+this.modelo);
    System.out.println(" A cor  e " + this.cor);
    System.out.println(" A potencia e "+this.potencia);
    System.out.println("o combustivel e "+this.combustivel);
    
}

void entrarCarro(){
    if(ligado==true){
        System.out.println("Acelerar");
    }else{
        System.out.println("Sair do carro");
    }
    
    
    
}
void ligarCarro(){
    this.ligado=true;
    
    
}
void desligarCarro(){
    this.ligado=false;
    
    
}
    
}



