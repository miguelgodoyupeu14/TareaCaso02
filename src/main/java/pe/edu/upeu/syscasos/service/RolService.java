package pe.edu.upeu.syscasos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.syscasos.entity.Rol;
import pe.edu.upeu.syscasos.repository.RolRepository;

@Service
public class RolService {

	@Autowired
	private RolRepository repository;
	
	public List<Rol> readAll(){
		return repository.findAll();
	}
}
