package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int numeroIf = 3;

        System.out.println("Ejercicio if");

        if(numeroIf<0){
            System.out.println("Es Negativo");
        }
        else if(numeroIf>0){
            System.out.println("Es positivo");
        }
        else{
            System.out.println("Es Cero");
        }

        System.out.println("Ejercicio while");
        int numeroWhile= 0;

        while (numeroWhile<3){
            numeroWhile++;
            System.out.println(numeroWhile);
        }

        System.out.println("Ejercicio Do while");
    int numeroDoWhile=0;
        do{
            System.out.println(numeroDoWhile);
            numeroDoWhile++;
        }while (numeroDoWhile<1);


        System.out.println("Ejercicio for");



        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }

        System.out.println("Ejercicio switch");

        String estacion = "verano";

        switch (estacion){
            case "verano":
                System.out.println("Es verano");
                break;
            case "otoño":
                System.out.println("Es otoño");
                break;
            case "invierno":
                System.out.println("Es invierno");
                break;
            case "primavera":
                System.out.println("Es primavera");
                break;
            default:
                System.out.println("No ingreso una estacion");
        }



    }
}
