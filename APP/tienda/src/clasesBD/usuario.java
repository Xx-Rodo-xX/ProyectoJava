package clasesBD;


public class usuario {

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getNombre() {
        return Nombres;
    }

    public void setNombre(String Nombre) {
        this.Nombres = Nombre;
    }

    public String getApellido() {
        return ApellidoS;
    }

    public void setApellido(String Apellido) {
        this.ApellidoS = Apellido;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public usuario(String Email, String Nombre, String Apellido, String Password, String rol) {
        this.Email = Email;
        this.Nombres = Nombre;
        this.ApellidoS = Apellido;
        this.Password = Password;
        this.rol = rol;
    }
    private String Email;
    private String Nombres;
    private String ApellidoS;
    private String Password;
    private String rol;

}
