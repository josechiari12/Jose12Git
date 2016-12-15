package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        String nombreArchivo = "temp.txt";
        String linea = null;

        try {
            File archivo = new File("archivo.txt");

            if (archivo.createNewFile()) {
                System.out.println("Archivo creado");
            } else {
                System.out.println("Archivo ya existe");
            }
        }
        catch (IOException e)
        {
            System.out.println("Error de lectura/escritura");
        }

    }
}
