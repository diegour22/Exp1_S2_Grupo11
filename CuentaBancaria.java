package BancoBoston;

public abstract class CuentaBancaria {
    protected String numeroCuenta;
    protected double saldo;

    // Constructor sin saldo inicial
    public CuentaBancaria(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = 0;
    }

    // Constructor con saldo inicial
    public CuentaBancaria(String numeroCuenta, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public abstract void realizarOperacion(double monto);

    public void depositar(double monto) {
        saldo += monto;
    }

    public void retirar(double monto) {
        if (saldo >= monto) {
            saldo -= monto;
        } else {
            System.out.println("Fondos insuficientes.");
        }
    }

    public void mostrarSaldo() {
        System.out.println("Saldo actual: $" + saldo);
    }
}
