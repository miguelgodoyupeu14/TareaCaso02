package pe.edu.upeu.syscasos.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.syscasos.dao.RolDao;
import pe.edu.upeu.syscasos.entity.Rol;
import pe.edu.upeu.syscasos.service.RolService;
@Service
public class RolServiceImpl implements RolService{
	
	@Autowired
	private RolDao rolDao;
	@Override
	public Rol create(Rol o) {
		// TODO Auto-generated method stub
		return rolDao.create(o);
	}

	@Override
	public Rol update(Rol o) {
		// TODO Auto-generated method stub
		return rolDao.update(o);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		rolDao.delete(id);
	}

	@Override
	public Optional<Rol> read(Long id) {
		// TODO Auto-generated method stub
		return rolDao.read(id);
	}

	@Override
	public List<Rol> readAll() {
		// TODO Auto-generated method stub
		return rolDao.readAll();
	}

}
