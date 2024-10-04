package com.example;

public class Cavallo extends Thread {
    
     int durataCorsa; 
     private Corsa corsa;
     private String nomeCavallo;
     

     public String toString() {
        return nomeCavallo;
    }


    public Cavallo(int durataCorsa,Corsa corsa, String nomeCavallo){
        this.durataCorsa = durataCorsa;
        this.corsa = corsa;
        this.nomeCavallo = nomeCavallo;
     }


     @Override
     public void run() {
         for(int i = 0; i < durataCorsa; i++){
            
            try {
                Thread.sleep((int) (Math.random() * 10));
                ;
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
         }
         corsa.arrivato(nomeCavallo);
     }
}
