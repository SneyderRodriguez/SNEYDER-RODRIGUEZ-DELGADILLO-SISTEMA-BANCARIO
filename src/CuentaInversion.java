public class CuentaInversion extends CuentaBancaria {
    private double tasaAnual;
    private int plazoMeses;
    private double penalizacionRetiroAnticipado;

    public CuentaInversion(String numeroCuentas, String titular, double saldo, double tasaAnual, int plazoMeses, double limiteSobregiro) {
        super(numeroCuentas, titular, saldo);
    }
}
