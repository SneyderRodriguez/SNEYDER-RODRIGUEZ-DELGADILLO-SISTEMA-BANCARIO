public class Main {
    public static void main(String[] args) {
        CuentaBancaria c1 = new CuentaAhorros("AH-001", "Ana Gómez", 1000000.0, 0.5, 500000.0);
        CuentaBancaria c2 = new CuentaCorriente("CC-002", "Distribuidora XYZ", 800000.0, 5000.0, 300000.0);
        CuentaBancaria c3 = new CuentaInversion("IN-003", "carlos Ruiz", 2000000.0, 8.0,12,50000.0);

        System.out.println(c1.describir());
        System.out.println(c2.describir());
        System.out.println(c3.describir());

        System.out.println(c1.calcularComision());
        System.out.println(c2.calcularComision());
        System.out.println(c3.calcularComision());

        c1.realizarRetiro(500000.0);
        c2.realizarRetiro(500000.0);
        c3.realizarRetiro(500000.0);

        System.out.println(c1.getSaldo());
        System.out.println(c2.getSaldo());
    }
}