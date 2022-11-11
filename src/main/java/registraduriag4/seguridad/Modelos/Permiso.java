package registraduriag4.seguridad.Modelos;

import org.springframework.data.annotation.Id;

public class Permiso {

    @Id
    private String _id;
    private String url;
    private String metodo;

    public Permiso(String url, String metodo) {
        this.url = url;
        this.metodo = metodo;
    }

    public String get_id() {
        return _id;
    }

    public String getUrl() {
        return url;
    }

    public String getMetodo() {
        return metodo;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }
}