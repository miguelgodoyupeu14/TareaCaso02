package pe.edu.upeu.syscasos.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.edu.upeu.syscasos.dao.PeliculaDao;
import pe.edu.upeu.syscasos.entity.Pelicula;
import pe.edu.upeu.syscasos.repository.PeliculaRepository;

@Component
public class PeliculaDaoImpl implements PeliculaDao{
	@Autowired
	private PeliculaRepository pRepository;
	@Override
	public Pelicula create(Pelicula p) {
		// TODO Auto-generated method stub
		return pRepository.save(p);
	}

	@Override
	public Pelicula update(Pelicula p) {
		// TODO Auto-generated method stub
		return pRepository.save(p);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		pRepository.deleteById(id);
	}

	@Override
	public Optional<Pelicula> read(Long id) {
		// TODO Auto-generated method stub
		return pRepository.findById(id);
	}

	@Override
	public List<Pelicula> readAll() {
		// TODO Auto-generated method stub
		return pRepository.findAll();
	}

}
