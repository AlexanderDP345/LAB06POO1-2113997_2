public class Cliente {
    private String idCliente;
    private String nombre;
    private String apellido;
    private String direccion;
    private int telefono;
    private int dni;
    private CuentaBancaria[] cuentas;
    private EventoBancario[] eventoBancarios;
    private int eventosAsistidos;

    public Cliente(String idCliente, String nombre, String apellido, String direccion, int telefono, int dni) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.dni = dni;
        this.eventosAsistidos = 0;
        this.eventoBancarios = new EventoBancario[5];
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public CuentaBancaria[] getCuentas() {
        return cuentas;
    }

    public void setCuentas(CuentaBancaria[] cuentas) {
        this.cuentas = cuentas;
    }
    public void agregarEventoBancario(EventoBancario evento) {
        if (eventosAsistidos < 5) {
            eventoBancarios[eventosAsistidos] = evento;
            eventosAsistidos++;
        } else {
            System.out.println("Se ha alcanzado el límite de 5 eventos bancarios anuales.");
        }
    }






    @Override
    public String toString() {
        return "Cliente [idCliente=" + idCliente +
                ", nombre=" + nombre +
                ", apellido=" + apellido +
                ", direccion=" + direccion +
                ", telefono=" + telefono +
                ", dni=" + dni +
                "]";
    }
}