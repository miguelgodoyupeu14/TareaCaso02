package pe.edu.upeu.syscasos.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.edu.upeu.syscasos.dao.EmpleadoDao;
import pe.edu.upeu.syscasos.entity.Empleado;
import pe.edu.upeu.syscasos.repository.EmpleadoRepository;

@Component
public class EmpleadoDaoImpl implements EmpleadoDao{
	@Autowired
	private EmpleadoRepository eRepository;
	@Override
	public Empleado create(Empleado e) {
		// TODO Auto-generated method stub
		return eRepository.save(e);
	}

	@Override
	public Empleado update(Empleado e) {
		// TODO Auto-generated method stub
		return eRepository.save(e);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		eRepository.deleteById(id);
	}

	@Override
	public Optional<Empleado> read(Long id) {
		// TODO Auto-generated method stub
		return eRepository.findById(id);
	}

	@Override
	public List<Empleado> readAll() {
		// TODO Auto-generated method stub
		return eRepository.findAll();
	}

}
