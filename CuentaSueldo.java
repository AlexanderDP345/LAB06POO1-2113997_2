import java.util.Arrays;

public class CuentaSueldo extends CuentaAhorro{
    private String nombreEmpresa;

    public CuentaSueldo(String nombreEmpresa) {
        super();
        this.nombreEmpresa = nombreEmpresa;
    }

    public CuentaSueldo() {
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
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
        return "CuentaSueldo: " + nombreEmpresa + "\nBeneficios: " + Arrays.toString(beneficios);
    }
}