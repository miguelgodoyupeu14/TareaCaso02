package pe.edu.upeu.syscasos.service;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.syscasos.entity.Rol;

public interface RolService {

	Rol create(Rol o);
	Rol update(Rol o);
	void delete(Long id);
	Optional<Rol> read(Long id);
	List<Rol> readAll();
}
