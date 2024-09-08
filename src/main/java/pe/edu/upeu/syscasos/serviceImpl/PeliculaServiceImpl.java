package pe.edu.upeu.syscasos.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.syscasos.dao.PeliculaDao;
import pe.edu.upeu.syscasos.entity.Pelicula;
import pe.edu.upeu.syscasos.service.PeliculaService;
@Service
public class PeliculaServiceImpl implements PeliculaService{
	@Autowired
	private PeliculaDao peliculaDao;
	@Override
	public Pelicula create(Pelicula p) {
		// TODO Auto-generated method stub
		return peliculaDao.create(p);
	}

	@Override
	public Pelicula update(Pelicula p) {
		// TODO Auto-generated method stub
		return peliculaDao.update(p);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		peliculaDao.delete(id);
	}

	@Override
	public Optional<Pelicula> read(Long id) {
		// TODO Auto-generated method stub
		return peliculaDao.read(id);
	}

	@Override
	public List<Pelicula> readAll() {
		// TODO Auto-generated method stub
		return peliculaDao.readAll();
	}

}
