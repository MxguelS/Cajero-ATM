package Clases;

import javax.swing.JOptionPane;

public class MenuCuentaBancaria {

    public MenuCuentaBancaria() {
        this.ojbCuenta = new cuentaBancaria(
                JOptionPane.showInputDialog("Ingrese su número de cuenta: "),
                JOptionPane.showInputDialog("Ingrese su nombre: "),
                0, 0
        );
    }

    private cuentaBancaria ojbCuenta;

    public void mostrarMenu() {

        String opcionMenu = " Elija una Opcion: \n";
        opcionMenu += "1.  Retirar Efectivo\n";
        opcionMenu += "2.  Realizar Deposito\n";
        opcionMenu += "3.  Modificar telefono\n";
        opcionMenu += "4.  Mostrar Informacion\n";
        opcionMenu += "5.  Salir\n";

        String dato = "";
        int opcion = 0;

        this.ojbCuenta.setnombreCliente(this.ojbCuenta.getnombreCliente());
        this.ojbCuenta.setnumeroCuenta(this.ojbCuenta.getnumeroCuenta());
        this.ojbCuenta.setsaldo(0);
        this.ojbCuenta.settelefono(000000);

        do {

            dato = JOptionPane.showInputDialog(opcionMenu);
            opcion = Integer.parseInt(dato);

            switch (opcion) {

                case 1: //retiro de efectivo
                    double montoRetiro = 0;
                    dato = JOptionPane.showInputDialog("Digite el monto a retirar :");
                    montoRetiro = Double.parseDouble(dato);
                    if (this.ojbCuenta.retiroEfectivo(montoRetiro)) {
                        JOptionPane.showInternalMessageDialog(null, "Retiro Realizado");
                    } else {
                        JOptionPane.showMessageDialog(null, "Fondos Insuficientes");
                    }
                    break;
                case 2: //Deposito de saldo
                    double MontoDeposito = 0;
                    dato = JOptionPane.showInputDialog("Digite el monto a depositar :");
                    MontoDeposito = Double.parseDouble(dato);
                    this.ojbCuenta.depositarEfectivo(MontoDeposito);
                    JOptionPane.showMessageDialog(null, "Deposito realizado");

                    break;
                case 3: //Modificar el # de telefono
                    int cel = 0;
                    dato = JOptionPane.showInputDialog("Digite el nuevo numero de telefono :");
                    cel = Integer.parseInt(dato);
                    this.ojbCuenta.settelefono(cel);
                    JOptionPane.showMessageDialog(null, "Telefono modificado");
                    break;
                case 4: //Mostrar informacion del cliente
                    JOptionPane.showMessageDialog(null, "Numero de cuenta : " + this.ojbCuenta.getnumeroCuenta() + "\nNombre de Cliente : " + this.ojbCuenta.getnombreCliente() + "\nSaldo : " + this.ojbCuenta.getsaldo() + "\n Telefono : " + this.ojbCuenta.gettelefono()
                    );
                    break;
                case 5: //retiro de efectivo
                    JOptionPane.showMessageDialog(null, "Cerrando la cuenta numero: #" + this.ojbCuenta.getnumeroCuenta() + "\nCliente : " + this.ojbCuenta.getnombreCliente());
                    break;
            }

        } while (opcion != 5);

        JOptionPane.showMessageDialog(null, "Seleccione opciones validas");

    }

}//cierre de clase
