package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Persona persona = new Persona();

        persona.setEdad(36);
        persona.setNombre("Cacho");
        persona.setTelefono(223456562);
        System.out.println("Nombre: "+ persona.getNombre() + " Edad: "+ persona.getEdad() + " Telefono: "+ persona.getTelefono());


    }
}

   class Persona{
        private int edad;
        private String nombre;
        private long telefono;

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public long getTelefono() {
            return telefono;
        }

        public void setTelefono(long telefono) {
            this.telefono = telefono;
        }
    }

