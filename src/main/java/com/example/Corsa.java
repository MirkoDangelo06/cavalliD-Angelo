package com.example;

import java.util.ArrayList;

public class Corsa {
    
    private ArrayList<String> classifica; 

    public Corsa (){
        classifica = new ArrayList<>();

    }

    public void arrivato(String nomeCavallo){
        classifica.add(nomeCavallo);
    }

    public String classificaFinale(){
        return classifica.toString();
    }




}
