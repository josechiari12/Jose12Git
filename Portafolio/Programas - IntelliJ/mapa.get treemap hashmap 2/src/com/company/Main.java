package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main
{

    public static void main(String[] args) throws IOException
    {
        Map<String, Integer> persona = new TreeMap();
        String nombre;
        int edad;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 3; i > 0; i--)
        {
            System.out.print("Nombre > ");
            nombre = br.readLine();
            System.out.print("Edad > ");
            edad = Integer.parseInt(br.readLine());
            persona.put(nombre, edad);
        }

        for (String llave : persona.keySet())
        {
            int valor = persona.get(llave);
            if (valor >= 18)
            {
                System.out.println(llave + " eres mayor");
            }
            else
            {
                System.out.println(llave + " eres menor");
            }
        }

    }
}
