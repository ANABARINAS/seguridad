package registraduriag4.seguridad.Modelos;

import org.springframework.data.annotation.Id;

public class Rol {
    @Id
    private String _id;
    private String nombre;

    public Rol(String nombre) {
        this.nombre = nombre;
    }

    public String get_id() {
        return _id;
    }

    public String getNombre() {
        return nombre;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
