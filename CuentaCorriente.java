public class CuentaCorriente {
    private final double TasaInteresAnual = 0.02;
    private final double COMISION_FIJA = 2.0;
    private final int maxRetiro;
    private int REtirosEnCajeroRealizados = 0;
    public CuentaCorriente(int maxRetiro) {
        this.maxRetiro = maxRetiro;
    }
    public boolean retirarEnCajero(double monto) {
        if (REtirosEnCajeroRealizados < maxRetiro) {
            REtirosEnCajeroRealizados++;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "CuentaCorriente{" +
                "tasaInteresAnual=" + TasaInteresAnual +
                ", COMISION_FIJA=" + COMISION_FIJA +
                ", maxRetiro=" + maxRetiro +
                '}';
    }
}
