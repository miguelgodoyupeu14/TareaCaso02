package pe.edu.upeu.syscasos.dao;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.syscasos.entity.Acceso;
import pe.edu.upeu.syscasos.entity.Usuario;


public interface UsuarioDao {

	Usuario create(Usuario u);
	Usuario update(Usuario u);
	void delete(Long id);
	Optional<Usuario> read(Long id);
	List<Usuario> readAll();
	Usuario registrarUsuarioRol(Long usaurioId, Long rolId);
}
