package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        suma3(3,6,2);

        Coche auto = new Coche();
        auto.incrementarPuertas();
        System.out.println(auto.puertas);

    }
    public static void suma3(int a, int b, int c){
        System.out.println(a+b+c);
    }

    public static class Coche{
        public int puertas=0;


        public void incrementarPuertas(){
            puertas++;
        }

    }
}
