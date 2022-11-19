package registraduriag4.seguridad.Repositorios;

import registraduriag4.seguridad.Modelos.Permiso;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import registraduriag4.seguridad.Modelos.PermisosRoles;


public interface RepositorioPermisoRol extends MongoRepository<PermisosRoles,String> {
        @Query("{'rol.$id': ObjectId(?0),'permiso.$id': ObjectId(?1)}")
        PermisosRoles getPermisoRol(String id_rol,String id_permiso);
    }
