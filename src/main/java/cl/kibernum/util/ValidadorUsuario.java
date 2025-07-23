package cl.kibernum.util;
import cl.kibernum.modelo.Usuario;
import java.util.regex.Pattern;

public class ValidadorUsuario {

    private static final Pattern EMAIL_PATTERN = Pattern.compile("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");

    public boolean esbNombreValido(String nombre) {
        return nombre != null && !nombre.trim().isEmpty() && nombre.length() >= 3;
    }

    public boolean esbEmailValido(String email) {
        return email != null && EMAIL_PATTERN.matcher(email).matches();
    }

    public boolean esMayorDeEdad(int edad) {
        return edad >= 18;
    }

    public boolean ValidarrUsuario(Usuario usuario) {
        return esbNombreValido(usuario.getNombre()) &&
                esbEmailValido(usuario.getEmail()) &&
                esMayorDeEdad(usuario.getEdad());
    }
}