//import java.io.*;
import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
	// Quiz3 programa que lea velocidades y las guarde en un archivo ATTT.txt
        String nombre, archivo1 = "ATTT.txt";
        double vl = 0;
        int i = 0, x = 0, z = 0;
        int a = 20, b = 50, c = 150, d = 0 , aa=0, bb=0, cc=0;
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Integer> mapA = new HashMap<>();

        System.out.println("Veremos que multa te tocara");
        System.out.println("Mayor a 60 Kilometros B/.20.00");
        System.out.println("Mayor a 120 Kilometros B/.50.00");
        System.out.println("Mayor a 160 Kilometros B/.150.00");
        System.out.print("Introduce tu nombre: ");
        nombre = leer.readLine();

        System.out.println("Introduce la velocidad en Kilometros.");
        do {
            System.out.print("Cero (0) para detener->");
           // vl = Double.parseDouble(leer.readLine());
            try
            {
                vl = Double.parseDouble(leer.readLine());
            }
            catch (NumberFormatException e)
            {
                System.out.print("Entrada invalida...");
                vl = 1;
            }

            if(vl >= 60 && vl < 120){
                System.out.println(" multa de B/.20.00");
                FileWriter na = new FileWriter(archivo1, true);
                BufferedWriter nt = new BufferedWriter(na);
                nt.write (Double.toString(vl));
                nt.write ("K/h Multa de 20 Balboas");
                nt.newLine();
                nt.flush();
                i++;
            }else if (vl >= 120 && vl < 160){
                System.out.println(" multa de B/.50.00");
                FileWriter na = new FileWriter(archivo1, true);
                BufferedWriter nt = new BufferedWriter(na);
                nt.write (Double.toString(vl));
                nt.write ("K/h Multa de 50 Balboas");
                nt.newLine();
                nt.flush();
                x++;
            } else if (vl >= 160){
                System.out.println(" multa de B/.150.00");
                FileWriter na = new FileWriter(archivo1, true);
                BufferedWriter nt = new BufferedWriter(na);
                nt.write (Double.toString(vl));
                nt.write ("K/h Multa de 150 Balboas");
                nt.newLine();
                nt.flush();
                z++;
            }else{
                System.out.println(" No aplica multa");
                FileWriter na = new FileWriter(archivo1, true);
                BufferedWriter nt = new BufferedWriter(na);
                nt.write (Double.toString(vl));
                nt.write ("K/h No aplica multa");
                nt.newLine();
                nt.flush();
            }
        }while(vl != 0);
        aa = a*i;
        bb = b*x;
        cc = c*z;
        d = aa+bb+cc;
        mapA.put(nombre, (int) d);
        for(Object ll : mapA.keySet()){
            Object va = mapA.get(ll);
            System.out.println(ll + " Tiene una multa de B/." + va+".00");
        }
        //System.out.println(nombre+ " Usted tiene una multa de B/."+d+".00");
        FileWriter na = new FileWriter(archivo1, true);
        BufferedWriter nt = new BufferedWriter(na);
        nt.write (nombre+" usted tiene una multa de B/."+(int)d + ".00");
        nt.newLine();
        nt.flush();
        /*for(Object ll : mapA.keySet()){
            Object va = mapA.get(ll);
            System.out.println(ll + " Tiene una multa de B/." + va+".00");
        }*/
    }
}

//PROGRAMA ELABORADO POR:
// - ANDRES ABADIA PE-14-1273
// - JOSE CHIARI 2-716-1561