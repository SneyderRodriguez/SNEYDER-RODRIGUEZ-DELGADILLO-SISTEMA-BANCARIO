public class CuentaBancaria {
    private String numeroCuentas;
    private String titular;
    private double saldo;

    public CuentaBancaria(String numeroCuentas, String titular, double saldo){
        this.numeroCuentas = numeroCuentas;
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getNumeroCuentas() {
        return numeroCuentas;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public String describir(){
        return "| Cuenta " + numeroCuentas + " | Titular "+ titular +"| Saldo: $" + saldo;
    }
    public double calcularComision(){
        return 0.0;
    }
    public void realizarRetiro(double monto){
        setSaldo(saldo-monto);
    }
}