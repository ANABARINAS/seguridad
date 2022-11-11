package registraduriag4.seguridad.Repositorios;

import registraduriag4.seguridad.Modelos.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RepositorioUsuario extends MongoRepository<Usuario,String>{

}
