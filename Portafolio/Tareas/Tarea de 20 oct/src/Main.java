import com.sun.org.apache.bcel.internal.generic.NEW;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.List;

import static javafx.scene.input.KeyCode.R;

//Programa que me diga que clase de multa me tocara
public class Main {

    public static void main(String[] args) throws IOException {

	    String nom = "";
        float m;
        double Mayor=0, nMayor=0, total =  0, ttotal = 0;
        float ck = (float) 1.609;
        double [] array = new double[1000];
        int i=0,x;
        int c=0;
        float res;
        String  R = null;

        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("EL PROGRAMA TE DIRA LA CLASE DE MULTA OBTENIDA");
        System.out.print("Introduzca su nombre: ");
        try{
            nom = leer.readLine();
        }catch (Exception y){
            System.out.println("Caracter invalido");
        }
        System.out.print("Introduzca velocidad en milla: ");

        //List<String> lista = new ArrayList<>();
        //lista.add(0,"m");
        //System.out.println("Si decea terminar introdusca 0.");

        do {
            m = Float.parseFloat(leer.readLine());
            if (nMayor<m){
                nMayor = m;
                Mayor = (nMayor * ck);
            }
            if (m !=0) {
                array[c] = m;
                total = (m + total);
                ttotal = (total * ck);
            }
            if (ttotal >=  80){
                R = ("\nUsted a pasado los 50Km/h \nTotal de multa: B/. 50.00");
            }else if (ttotal >=120){
                R= ("\nUsted a pasado los 120Km/h \nTotal de Multa: B/. 150.00");
            }else{
                System.out.println("Gracias");
            }
            i++;
        }while(m != 0);
        x = i;
        x = x-1;
        res = ck*(float)(total/x);
        System.out.println("Reporte de Transito");
        System.out.println("Nombre: "+ nom);
        System.out.printf("\nvelocidad maxima: %.1f",Mayor);
        System.out.printf("\nVelocidad Promedio: %.1f",res);
        System.out.println(R);

    }
}
