package org.iesfm.example28;

public class Main {
    public static void main(String[] args) {
        Thread hola = new Thread(new PrintNTimes("hola", 100, 1000 ));
        hola.start();

        Thread adios = new Thread(new PrintNTimes("Adios", 50, 1000));
        adios.start();
    }
}
