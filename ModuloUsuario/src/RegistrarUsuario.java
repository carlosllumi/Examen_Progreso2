import java.util.ArrayList;

public class RegistrarUsuario {
    private ArrayList<ListaUsuarios> usuarios;

    public RegistrarUsuario() {
        usuarios = new ArrayList<>();
    }


    public void registrar(String nombre, String correo) {
        ListaUsuarios nuevoUsuario = new ListaUsuarios(nombre, correo);
        usuarios.add(nuevoUsuario);
        System.out.println("Usuario registrado exitosamente: " + nombre);
    }

    public ArrayList<ListaUsuarios> getUsuarios() {
        return usuarios;
    }
}


