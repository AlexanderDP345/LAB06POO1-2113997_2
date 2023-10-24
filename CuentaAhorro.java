import java.util.Arrays;

public class CuentaAhorro extends CuentaBancaria {
    protected double tasaInteresAnual = 0.03;
    protected String[] beneficios;


    public CuentaAhorro(String numCuenta, String descripcion, String cci, Cliente cliente) {
        super(numCuenta, descripcion, cci, cliente);
    }

    public CuentaAhorro() {
        super();
    }

    public double getTasaInteresAnual() {
        return tasaInteresAnual;
    }

    public void setTasaInteresAnual(double tasaInteresAnual) {
        this.tasaInteresAnual = tasaInteresAnual;
    }

    public String[] getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(String[] beneficios) {
        this.beneficios = beneficios;
    }

    @Override
    public double calcularInteresMensual() {
        double interesMensual;
        interesMensual = (saldoDisponible * tasaInteresAnual)/12;
        saldoDisponible += interesMensual;
        return interesMensual;
    }

    @Override
    public String toString() {
        return "CuentaAhorro [Tasa de Interés Anual: " + tasaInteresAnual + "\n, Beneficios: " + Arrays.toString(beneficios);
    }
}

