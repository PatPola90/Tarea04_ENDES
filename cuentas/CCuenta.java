package cuentas;

/** 
 *Clase cuenta con atributos privados de la clase CCuenta de tipo String:
 * nombre y cuenta de tipo double: saldo y tipo de interes
 * Esta clase contiene métodos para operar con cuentas bancarias
 * @author Patricia Pola Caballero
 * @version 1 12/02/2023
 */
public class CCuenta {

    /**
     * Atributo para para el alojar el nombre del propietario de la cuenta
     * 
     */
    private String nombre;
    /**
     * Atributo cuenta que aloja el número de cuenta
     */
    private String cuenta;
    /**
     * Atributo que aloja el saldo de la cuenta bancaria
     */
    private double saldo;
    /**
     * Atributo para alojar el tipo de interés de la cuenta bancaria
     */
    private double tipoInterés;

    /**
     * Constructor vacío
     * No recibe ningún parámetro
     */
    public CCuenta() {
    }

    /**
     * Método constructor con parámetros
     *
     * @param nom nombre del usuario de la cuenta
     * @param cue numero de cuenta
     * @param sal saldo de la cuenta
     * @param tipo tipo de interés de la cuenta bancaria
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
    }
/**
 * Método getter para obtener el estado de la cuenta
 * @return saldo de la cuenta bancaria
 */      
    public double estado() {
        return getSaldo();
    }

    /**
     * Método Getter 
     * @return nombre de la persona titular de la cuenta bancaria
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método setter del atributo de tipo String nombre
     * @param nombre asigna el nombre de la cuenta bancaría
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método Getter
     * @return numero de cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Método setter del atributo de tipo String cuenta
     * @param cuenta asigna numero de cuenta bancaría
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Método getter para obtener el saldo
     * @return saldo de la cuenta bancaria
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Método setter del atributo de tipo double saldo
     * @param saldo asigna el saldo a la cuenta bancaria
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Método getter del tipoInterés
     * @return tipo de interés de la cuenta bancaría
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Método setter del atributo de tipo double tipoInterés
     * @param tipoInterés asigna el tipo de interés de la cuenta bancaría
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
/**
 * Método que tiene como parámetro cantidad de tipo double
 * comprueba que la cantidad es menor a 0 y si se cumple
 * lanza una excepción con un mensaje, finalmente settea el saldo 
 * sumandole al saldo actual la cantidad que se le pasa por parámetro
 * 
 * @param cantidad a ingresar o retirar en la cuenta bancaria
 * @throws Exception que genera un mensaje para indicar que no se puede ingresar una cantidad negativa
 * 
 */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        setSaldo(getSaldo() + cantidad);
    }
/**
 * Método que tiene como parámetro cantidad de tipo double 
 * Compueba que el dato introducido como argumento es menor o igual a 0
 * si se cumple lanza una excepción con un mensaje
 * si no se cumple, comprueba que el método estado es menor a la cantidad 
 * si se cumple lanza otra excepción con otro mensaje
 * finalmente calcula el saldo, restando la cantidad que se le pasa por parámetro al saldo actual
 * @param cantidad a ingresar o retirar de la cuenta bancaria
 * @throws Exception lanza una excepción 
 * 
 */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (estado() < cantidad) {
            throw new Exception("No se hay suficiente saldo");
        }
        setSaldo(getSaldo() - cantidad);
    }

    
    

}
