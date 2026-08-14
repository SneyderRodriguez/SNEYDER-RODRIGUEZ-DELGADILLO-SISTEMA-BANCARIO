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
        System.out.println(c3.getSaldo());
    }
}

/*¿Por qué fue necesario usar CuentaBancaria como tipo de variable en lugar de cada tipo especifico?
RTA: Porque CuentaBancaria es la clase padre de las demás clases.
¿Qué vemtaja concreta me dio?
RTA: Es que pude llamar con una sola cuenta todos los diferentes tipos de cuentas.
=====================================================================================================
El banco decide agregar un cuarto tipo de cuenta CuentaNomina con sus propias reglas de comisión y retiro.
¿Tendrías que modificar el código de Main para que funcione con las variables que ya declaraste?
RTA: NO
¿Por qué?
RTA: Por que la nueva cuenta ya estaria heredando lo de cuentaBancaria.
======================================================================================================
Si Main solo conoce el tipo CuentaBancaria y llama métodos que existen en el padre.
¿Qué tendría que cambiar cuando aparece una hija nueva?
RTA: Tecnicamente nada, porqué la nueva cuenta hereda los metodos y atributos de CuentaBancaria, además de que tendria sus propios atributos.
En el main se seguiria manejando la misma estructura CuentaBancaria c4 = new cuentaNieva(sus parametros). etc.. etc.. etc..*/