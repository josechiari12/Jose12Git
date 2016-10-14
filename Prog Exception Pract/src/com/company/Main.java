package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main
{

    public static void main(String[] args)
    {
        int calif;
        String nom;

        BufferedReader t1 = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Su nombre es: ");

        try
        {
            nom = (t1.readLine());
        }
        catch (IOException e)
        {
            System.out.print("Error en lectura...");
        }

        System.out.print("Ingrese su calificacion: ");

        try
        {
            calif = Integer.parseInt(t1.readLine());
        }
        catch (IOException e)
        {
            System.out.print("Error en lectura...");
            calif = -2;
        }

        if (calif < 101 && calif > 90)
        {
            System.out.println("Tu calificacion es A");
        }
        else if (calif < 91 && calif > 80)
        {
            System.out.println("Tu calificacion es B");
        }
        else if (calif < 81 && calif > 70)
        {
            System.out.println("Tu calificacion es C");
        }
        else
        {
            System.out.println("Reprobaste, matriculela nuevamente!");
        }
    }
}
