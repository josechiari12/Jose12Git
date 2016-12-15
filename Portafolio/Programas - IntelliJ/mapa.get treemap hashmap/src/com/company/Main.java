package com.company;
import java.util.HashMap;
import java.util.Map;
public class Main {

    public static void main(String[] args) {
	    Map<String, Integer> mapA = new HashMap<String, Integer>();
        //Map mapA = new HashMap(); //no tiene la data ordenada y mantiene el orden como viene

        //Map mapA = new TreeMap();//se hace un sort y asegura que la data esta en orden

        //mapA.put("key1", "value1");
        //mapA.put("key2", "value2");
        //mapA.put("key3", "value3");

        mapA.put("Abuelo", 100);
        mapA.put("Padre", 50);
        mapA.put("Hijo", 25);

        int elemento = mapA.get("Abuelo");//.get a traves de el se consigue lo que contiene el registro
        System.out.println("Abuelo: " + elemento);

        mapA.remove("Padre");

        for (/*Object*/ String llave : mapA.keySet())
        {
            /*Object*/int valor = mapA.get(llave);
            System.out.println(/*valor*/ llave + ": " + valor);
        }

    }
}
