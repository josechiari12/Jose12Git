package com.company;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
	String nombreArchivo = "temp.txt";
    String linea = null;

    try
    {
        FileReader fr = new FileReader(nombreArchivo);
        BufferedReader br = new BufferedReader(fr);
        while((linea = br.readLine())!= null)
        {
            System.out.println(linea);
        }

        br.close();
    }
    catch (FileNotFoundException ex)
        {
            System.out.println("No se encoontro archivo");
        }
    catch (IOException ex)
        {
            System.out.println("Error leyendo archivo");
        }
    }

}
