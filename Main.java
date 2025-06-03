package BancoBoston;
public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Diego Ulloa", "12.345.678-9", "Santiago");
        cliente1.mostrarDatosCliente();

        CuentaBancaria cuenta = new CuentaCorriente("123456789", 500000);
        cuenta.mostrarSaldo();
        cuenta.realizarOperacion(200000);
        cuenta.mostrarSaldo();

        CuentaBancaria ahorro = new CuentaAhorro("987654321");
        ahorro.realizarOperacion(1500000); // Excede el límite
        ahorro.realizarOperacion(500000);
        ahorro.mostrarSaldo();

        CuentaBancaria credito = new CuentaCredito("111222333", 1000000);
        credito.realizarOperacion(300000);
        credito.mostrarSaldo();
    }
}
