public class CuentaAhorros extends CuentaBancaria{
    private double tasaInteresMensual;
    private double saldoMinimo;

    public CuentaAhorros(String numeroCuentas, String titular, double saldo, double tasaInteres, double saldoMinimo) {
        super(numeroCuentas, titular, saldo);
        this.tasaInteresMensual = tasaInteres;
        this.saldoMinimo = saldoMinimo;
    }

    @Override
    public String describir() {
        return "Tasa Mensual: " + tasaInteresMensual;
    }

    public double calcularComision(){
        if (getSaldo() >= saldoMinimo){
            return 0.0;
        }else {
            return 12000.0;
        }
    }

    public void realizarRetiro(double monto, boolean esUrgente){}

    public double calcularInteresDelMes(){
        return getSaldo() * tasaInteresMensual / 100;
    }
}
