public class CuentaCts {
    private final double TasaInteresAnual = 0.07;
    private final double puntos;
    public CuentaCts(double puntos) {
        this.puntos = puntos;
    }
    @Override
    public String toString() {
        return "CuentaCTS{" +
                "tasaInteresAnual=" + tasaInteresAnual +
                ", puntos=" + puntos +
                '}';
    }
}
