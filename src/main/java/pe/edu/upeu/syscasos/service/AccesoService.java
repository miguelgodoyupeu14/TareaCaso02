package pe.edu.upeu.syscasos.service;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.syscasos.entity.Acceso;

public interface AccesoService {
	Acceso create(Acceso a);
	Acceso update(Acceso a);
	void delete(Long id);
	Optional<Acceso> read(Long id);
	List<Acceso> readAll();
	Acceso createAccesoRol(Long accesoId, Long rolId);
}
