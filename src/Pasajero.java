public class Pasajero {

    private String nombre;
    private String dni;
    private String destino;
    private String fecha;
    private String hora;
    private int asiento;

    public Pasajero(String nombre, String dni, String destino, String fecha, String hora, int asiento) {
        this.nombre = nombre;
        this.dni = dni;
        this.destino = destino;
        this.fecha = fecha;
        this.hora = hora;
        this.asiento = asiento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public String getDestino() {
        return destino;
    }

    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    public int getAsiento() {
        return asiento;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nDNI: " + dni + "\nDestino: " + destino + "\nFecha: " + fecha + "\nHora: " + hora + "\nAsiento: " + asiento;
    }
}
