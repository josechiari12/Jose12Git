package com.company;
|

public class Main
{
    public static void main (String[] args) throws IOException
    {
        double cent;
        double USD;
        double EUR;

        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Introduzca la cantidad de cantavos: ");
        cent = Double.parseDouble(teclado.readLine());
        USD = cent/100;
        EUR = USD * 0.89;

        System.out.printf("La cantidad de centavos introducida equivale a: %.2f EUROS", EUR);
        // para el setprecision se debe agregar el printf y colocar el %.2(cantidad de decimales)f
    }
}
 // Elaborado por: Jose Chiari 2-716-1561 y Reynell Rodriguez 8-867-2354