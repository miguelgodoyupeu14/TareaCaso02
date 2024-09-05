package pe.edu.upeu.syscasos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.syscasos.entity.Acceso;
import pe.edu.upeu.syscasos.entity.Rol;
import pe.edu.upeu.syscasos.repository.AccesoRepository;
import pe.edu.upeu.syscasos.repository.RolRepository;

@Service
public class AccesoService {

	@Autowired
	private AccesoRepository repository1;
	
    @Autowired
    private RolRepository repository2;
	
	public List<Acceso> readAll(){
		return repository1.findAll();
	}
	
	public Acceso createAccesoRol(Long accesoId, Long rolId) {
		Acceso acceso = repository1.findById(accesoId).get();
		Rol rol = repository2.findById(rolId).get();
		acceso.getRoles().add(rol);
		rol.getAccesos().add(acceso);
		return repository1.save(acceso);
				
	}
}
