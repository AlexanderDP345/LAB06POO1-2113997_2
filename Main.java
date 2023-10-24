import java.util.ArrayList;
import java.util.Date;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        //5to y 6to post-it
        CuentaSueldo cuentaSueldo = new CuentaSueldo();
        cuentaSueldo.setSaldoDisponible(1500);

        CuentaFree cuentaFree = new CuentaFree();
        cuentaFree.setSaldoDisponible(20000);

        cuentaSueldo.setTasaInteresAnual(0.03);
        cuentaFree.setTasaInteresAnual(0.03);

        for (int mes = 1; mes <= 12; mes++) {
            double interesSueldo = cuentaSueldo.calcularInteresMensual();
            double interesFree = cuentaFree.calcularInteresMensual();
            System.out.println("\nMes " + mes + ": Interés Cuenta Sueldo: " + interesSueldo + ", Saldo: " + cuentaSueldo.getSaldoDisponible());
            System.out.println("Mes " + mes + ": Interés Cuenta Free: " + interesFree + ", Saldo: " + cuentaFree.getSaldoDisponible());
        }

        CuentaSueldo cuenta = new CuentaSueldo();
        String[] beneficios = {"ropa", "restaurante", "gym", "conciertos", "vuelos", "hotel"};
        cuenta.setBeneficios(beneficios);
        System.out.println(cuenta);
        //7to y 8to post-it

        Cliente cliente = new Cliente("12345", "Juan", "Perez", "123 street", 555123456, 123456789);

        List<EventoBancario> eventos = new ArrayList<>();
        eventos.add(new EventoBancario(new Date(), "FIESTA BANCARIA", "BLAKDAYFRIDAY"));
        eventos.add(new EventoBancario(new Date(), "RETIROAFP", "Depósito mensual del salario."));
        eventos.add(new EventoBancario(new Date(), "RETIRODEGRATI", "Se retiraron $5000 en efectivo de un cajero."));
        eventos.add(new EventoBancario(new Date(), "FESTBANK", "Se pagó una factura de servicios públicos."));
        eventos.add(new EventoBancario(new Date(), "NAVIDAD", "Se recibió una transferencia de $200."));
        eventos.add(new EventoBancario(new Date(), "NAVIDAD2", "Se recibió una transferencia de $200."));
        for (EventoBancario evento : eventos) {
            cliente.agregarEventoBancario(evento);

        }
        System.out.println("Eventos del Cliente :");
        for (EventoBancario evento : eventos) {

            System.out.println("Título: " + evento.getTituloEvento());
            System.out.println("Descripción: " + evento.getDescripcionEvento());
            System.out.println("---------------");

        }
        CuentaFree cuentaFree2 = new CuentaFree(true);


        String[] beneficiosCuentaFree2 = {"Teatro", "Restaurante", "Cursos"};
        cuentaFree2.setBeneficios(beneficiosCuentaFree2);

        System.out.println("\nBeneficios de la cuenta Free :");
        for (String beneficio : cuentaFree2.getBeneficios()) {
            System.out.println(beneficio);
        }
    }


}