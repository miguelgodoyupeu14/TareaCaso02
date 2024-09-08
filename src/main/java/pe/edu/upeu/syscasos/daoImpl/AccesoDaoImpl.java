package pe.edu.upeu.syscasos.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.edu.upeu.syscasos.dao.AccesoDao;
import pe.edu.upeu.syscasos.entity.Acceso;
import pe.edu.upeu.syscasos.entity.Rol;
import pe.edu.upeu.syscasos.repository.AccesoRepository;
import pe.edu.upeu.syscasos.repository.RolRepository;

@Component
public class AccesoDaoImpl implements AccesoDao{
	@Autowired
	private AccesoRepository acRepository;
	@Autowired
	private RolRepository rolRepository;
	@Override
	public Acceso create(Acceso a) {
		// TODO Auto-generated method stub
		return acRepository.save(a);
	}

	@Override
	public Acceso update(Acceso a) {
		// TODO Auto-generated method stub
		return acRepository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		acRepository.deleteById(id);
	}

	@Override
	public Optional<Acceso> read(Long id) {
		// TODO Auto-generated method stub
		return acRepository.findById(id);
	}

	@Override
	public List<Acceso> readAll() {
		// TODO Auto-generated method stub
		return acRepository.findAll();
	}
	@Override
	public Acceso registrarAccesoRol(Long accesoId, Long rolId) {
		// TODO Auto-generated method stub
		Acceso ac = acRepository.findById(accesoId).get();
		Rol rol = rolRepository.findById(rolId).get();
		
		ac.getRoles().add(rol);
		rol.getAccesos().add(ac);
		
		return acRepository.save(ac);
	}

}
