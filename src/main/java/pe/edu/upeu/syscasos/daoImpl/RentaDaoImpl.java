package pe.edu.upeu.syscasos.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.edu.upeu.syscasos.dao.RentaDao;
import pe.edu.upeu.syscasos.entity.Renta;
import pe.edu.upeu.syscasos.repository.RentaRepository;

@Component
public class RentaDaoImpl implements RentaDao{
	@Autowired
	private RentaRepository rentaRepository;
	@Override
	public Renta create(Renta r) {
		// TODO Auto-generated method stub
		return rentaRepository.save(r);
	}

	@Override
	public Renta update(Renta r) {
		// TODO Auto-generated method stub
		return rentaRepository.save(r);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		rentaRepository.deleteById(id);
	}

	@Override
	public Optional<Renta> read(Long id) {
		// TODO Auto-generated method stub
		return rentaRepository.findById(id);
	}

	@Override
	public List<Renta> readAll() {
		// TODO Auto-generated method stub
		return rentaRepository.findAll();
	}

}
