package SisHotel;

/*Clase que permite leer un archivo de texto*/

        //Importamos clases a usar
        import java.io.FileReader;
        import java.io.BufferedReader;
public class Leer
{
    public static void main(String arg[])
    {
        //Creamos un String que va a contener todo el texto del archivo
        String texto="";

        try
        {
            //Creamos un archivo FileReader que obtiene lo que tenga el archivo
            FileReader lector=new FileReader("texto.txt");

            //El contenido de lector se guarda en un BufferedReader
            BufferedReader contenido=new BufferedReader(lector);

            //Con el siguiente ciclo extraemos todo el contenido del objeto "contenido" y lo mostramos
            while((texto=contenido.readLine())!=null)
            {
                System.out.println(texto);
            }
        }

        //Si se causa un error al leer cae aqui
        catch(Exception e)
        {
            System.out.println("Error al leer");
        }
    }
}
