package pe.edu.upeu.syscasos.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.edu.upeu.syscasos.dao.RolDao;
import pe.edu.upeu.syscasos.entity.Rol;
import pe.edu.upeu.syscasos.repository.RolRepository;

@Component
public class RolDaoImpl implements RolDao{
	@Autowired
	private RolRepository rolRepository;
	@Override
	public Rol create(Rol o) {
		// TODO Auto-generated method stub
		return rolRepository.save(o);
	}

	@Override
	public Rol update(Rol o) {
		// TODO Auto-generated method stub
		return rolRepository.save(o);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		rolRepository.deleteById(id);
	}

	@Override
	public Optional<Rol> read(Long id) {
		// TODO Auto-generated method stub
		return rolRepository.findById(id);
	}

	@Override
	public List<Rol> readAll() {
		// TODO Auto-generated method stub
		return rolRepository.findAll();
	}

}
