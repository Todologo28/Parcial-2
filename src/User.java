public class User {
    private String nombre;
    private String apellido;
    private String cedula;
    private String correo;
    private String contrase;

    public User(String nombre, String apellido, String cedula, String correo, String contrase) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.correo = correo;
        this.contrase = contrase;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public String getCorreo() {
        return correo;
    }

    public String getContrase() {
        return contrase;
    }

    public boolean validar() {
        return ValidadorContra.validarNombre(nombre) &&
                ValidadorContra.validarApellido(apellido) &&
                ValidadorContra.validarCedula(cedula) &&
                ValidadorContra.validarCorreo(correo) &&
                ValidadorContra.validarContraseña(contrase);
    }
}