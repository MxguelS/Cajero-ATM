package Clases;

public class cuentaBancaria {

    //atributos
    private String numeroCuenta, nombreCliente;
    private double saldo;
    private int telefono;

    //utlizar metodos set & get
    public void setnumeroCuenta(String pValor) {
        numeroCuenta = pValor;

    }

    public String getnumeroCuenta() {
        return numeroCuenta;

    }

    public void setnombreCliente(String pValor) {
        nombreCliente = pValor;

    }

    public String getnombreCliente() {
        return nombreCliente;

    }

    public void setsaldo(double pValor) {

        saldo = pValor;

    }

    public double getsaldo() {
        return saldo;

    }

    public void settelefono(int pValor) {
        telefono = pValor;

    }

    public int gettelefono() {
        return telefono;
    }

    //usamos metodo contructor
    public cuentaBancaria(String numeroCuenta, String nombreCliente, double saldo, int telefono) {

        this.numeroCuenta = numeroCuenta;
        this.nombreCliente = nombreCliente;
        this.saldo = saldo;
        this.telefono = telefono;

    }//cierre de metodo contructor

    public void depositarEfectivo(double monto) {

        this.setsaldo(this.getsaldo() + monto);

    }

    public boolean retiroEfectivo(double monto) {
        boolean retirado = false;
        if (this.getsaldo() >= monto) {
            this.setsaldo(this.getsaldo() - monto);
            retirado = true;
        }
        return retirado;
    }

}//cierre de clase
