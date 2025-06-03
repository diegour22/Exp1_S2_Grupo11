package BancoBoston;

public class CuentaAhorro extends CuentaBancaria {
    public CuentaAhorro(String numeroCuenta) {
        super(numeroCuenta);
    }

    public CuentaAhorro(String numeroCuenta, double saldo) {
        super(numeroCuenta, saldo);
    }

    @Override
    public void realizarOperacion(double monto) {
        if (monto > 1000000) {
            System.out.println("Depósito excede el límite permitido para cuenta de ahorro.");
        } else {
            depositar(monto);
            System.out.println("Depósito realizado en cuenta de ahorro.");
        }
    }
}
