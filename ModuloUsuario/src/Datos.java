public class Datos {
    private String nombre;
    private String correo;

    public Datos(String nombre, String correo) {
        this.nombre = nombre;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Correo: " + correo;
    }
}


