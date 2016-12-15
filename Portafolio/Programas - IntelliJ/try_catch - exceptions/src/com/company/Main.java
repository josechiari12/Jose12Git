package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{

    public static void main(String[] args)
    {
	int edad;
        BufferedReader t1 = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Edad: ");

    try
    {
        edad = Integer.parseInt(t1.readLine());
    }
    catch (IOException e)
    {
        System.out.print("Error en lectura...");
        edad = -2;
    }
    catch (NumberFormatException e)
    {
        System.out.println("Valor invalido...");
        edad = -1;
    }
    if (edad < 0 || edad > 150)
    {
        System.out.println("NO sigue instrucciones.");
    }
    else
    {
        System.out.println("Tienes " + edad + " años.");
    }

    }
}
