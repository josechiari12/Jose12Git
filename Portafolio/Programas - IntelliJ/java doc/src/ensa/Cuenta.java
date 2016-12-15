/**
 * Provee las clases necesarias para
 * crear una cunta de consumo de electricidad
 * en la empresa ENSA.
 *
 * @since 1.0
 */

package ensa;

/**
 * Esta es la clase para la creacion de cuentas ENSA
 *
 * @author JOSE CHIARI
 * @version 1.0
 */
public class Cuenta {
    /**
     * Esta {@link String} es el nombre del dueño de la cuenta.
     */
    private String nombre;
    private String numero_cuenta;
    private double saldo;
    private  double consumo_mensual;

    /**
     * Este constructor inicializa la centa recien creada.
     * @param n Este parametro indica el nombre de la cuenta
     * @param nc Este parametro es para indicar el numero de cuenta
     */
    public Cuenta(String n, String nc){
        this.nombre = n;
        this.numero_cuenta = nc;
        this.saldo = 0.0;
        this.consumo_mensual = 0.0;
    }

    /**
     * Este metodo se encarga de cargar la informacion del cliente en una variable.
     * @return Esta cadena representa la informacion del cliente
     */
    public String  mostrar(){
        String mensaje = "INFORMACION DEL CLIENTE";
        mensaje +="\nnombre: "+ this.nombre;
        mensaje +="\ncuenta: "+ this.numero_cuenta;
        mensaje +="\nsaldo: "+ this.saldo;
        mensaje +="\nconsumo: "+ this.consumo_mensual;
        return mensaje;
    }

    /**
     * @deprecated Esta variable dice que en algun momento lo dejara de usar
     * @param pago
     * @return
     */
    public double pagar(double pago){
        this.saldo -= pago;
        return this.saldo;
    }
    public double calcular(double consumo){
        this.consumo_mensual = consumo;
        this.saldo = this.consumo_mensual * 0.057;
        return this.saldo;
    }
}
