package pe.edu.upeu.syscasos.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.edu.upeu.syscasos.dao.ClienteDao;
import pe.edu.upeu.syscasos.entity.Cliente;
import pe.edu.upeu.syscasos.repository.ClienteRepository;

@Component
public class ClienteDaoImpl implements ClienteDao {
	@Autowired
	private ClienteRepository cRepository;
	@Override
	public Cliente create(Cliente c) {
		// TODO Auto-generated method stub
		return cRepository.save(c);
	}

	@Override
	public Cliente update(Cliente c) {
		// TODO Auto-generated method stub
		return cRepository.save(c);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		cRepository.deleteById(id);
	}

	@Override
	public Optional<Cliente> read(Long id) {
		// TODO Auto-generated method stub
		return cRepository.findById(id);
	}

	@Override
	public List<Cliente> readAll() {
		// TODO Auto-generated method stub
		return cRepository.findAll();
	}

}
