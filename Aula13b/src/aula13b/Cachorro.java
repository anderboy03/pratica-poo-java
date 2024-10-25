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
public class Cachorro extends Lobo{
    @Override
    public void emitirSom(){
        System.out.println(" au au au");
        
    }
    
    public void reagir(String frase){
        if(frase.equals("toma comida") || frase.equals("ola")){
            System.out.println("abanar rabo");
            
        
    }else{
            System.out.println("rosnar");
        }
        
    }
    public void reagir (int hora, int min){
        if(hora<12){
            System.out.println("abanar");
            
        }else if(hora>=18){
            System.out.println("ignore");
        }else{
            System.out.println("latir");
        }
        
    }
    public void reagir (boolean dono){
        if(dono){
            System.out.println("ababar");
        }else{
            System.out.println("ronar e morder");
        }
        
    }
    public void reagir (int idade, float peso){
        if(idade<5){
            if(idade<10){
                System.out.println("abanar");
            }else{
                System.out.println("latir");
            }
             
       
    }else{
            if(peso<10){
                System.out.println("rosnar");
            }else{
                System.out.println("ignorar");
            }
        }
        }
}
