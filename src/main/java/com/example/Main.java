package com.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Corsa corsa = new Corsa();
        ArrayList <Cavallo> cavalli = new ArrayList<>();

        for(int i = 0;  i < 20; i++){
            cavalli.add(new Cavallo(1000, corsa , "" + (i+1)));
        }

        for(int i = 0; i< cavalli.size(); i++){
            cavalli.get(i).start();
        }

        for(Cavallo c : cavalli){
            c.join();
        }

System.out.println(corsa.classificaFinale());

    }
}