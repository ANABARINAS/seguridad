package registraduriag4.seguridad.Modelos;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Data
@Document()
public class Usuario {
    @Id
    private String _id;
    private String nombre_usuario;
    private String correo;
    private String contrasena;

    public Usuario(String nombre_usuario, String correo, String contrasena) {
        this.nombre_usuario = nombre_usuario;
        this.correo = correo;
        this.contrasena = contrasena;
    }

    public String get_id() {
        return _id;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public String getCorreo() {
        return correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
}


