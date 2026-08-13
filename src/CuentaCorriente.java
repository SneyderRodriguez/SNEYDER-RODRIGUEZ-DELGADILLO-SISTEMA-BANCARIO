public class CuentaCorriente extends CuentaBancaria{
    private double comisionPorTransaccion;
    private double limiteSobregiro;

    public CuentaCorriente(String numeroCuentas, String titular, double saldo, double comisionPorTransaccion, double limiteSobregiro) {
        super(numeroCuentas, titular, saldo);
        this.comisionPorTransaccion = comisionPorTransaccion;
        this.limiteSobregiro = limiteSobregiro;
    }

    @Override
    public String describir() {
        return "Comisión por Transacción: $" + comisionPorTransaccion;
    }
    public double calcularComision(){
        return comisionPorTransaccion;
    }
    public void realizarRetiro(double monto){
        double saldoResultante = getSaldo() - monto - comisionPorTransaccion;
        if (saldoResultante < -limiteSobregiro){
            System.out.println("El retiro no es posible");
        }else {
            setSaldo(saldoResultante);
            System.out.println("Transacción exitosa");
        }
    }
}
