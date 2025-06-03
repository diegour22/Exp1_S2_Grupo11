package BancoBoston;
public class CuentaCorriente extends CuentaBancaria {
    public CuentaCorriente(String numeroCuenta) {
        super(numeroCuenta);
    }

    public CuentaCorriente(String numeroCuenta, double saldo) {
        super(numeroCuenta, saldo);
    }

    @Override
    public void realizarOperacion(double monto) {
        depositar(monto);
        System.out.println("Depósito realizado en cuenta corriente.");
    }
}
