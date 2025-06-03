package BancoBoston;

public class CuentaCredito extends CuentaBancaria {
    public CuentaCredito(String numeroCuenta) {
        super(numeroCuenta);
    }

    public CuentaCredito(String numeroCuenta, double saldo) {
        super(numeroCuenta, saldo);
    }

    @Override
    public void realizarOperacion(double monto) {
        retirar(monto);
        System.out.println("Giro realizado desde cuenta de crédito.");
    }
}
