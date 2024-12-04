public class ListaUsuarios {
    private String user;
    private String cedula;

    public ListaUsuarios(String user, String cedula) {
        this.user = user;
        this.cedula = cedula;
    }

    public String getUser() {
        return user;
    }

    public String getCedula() {
        return cedula;
    }

    @Override
    public String toString() {
        return "Nombre: " + user + ", Cédula: " +cedula;
}

}
