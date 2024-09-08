package pe.edu.upeu.syscasos.dao;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.syscasos.entity.Acceso;


public interface AccesoDao {

	Acceso create(Acceso a);
	Acceso update(Acceso a);
	void delete(Long id);
	Optional<Acceso> read(Long id);
	List<Acceso> readAll();
	Acceso registrarAccesoRol(Long accesoId, Long rolId);
}
