package pe.edu.upeu.syscasos.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.edu.upeu.syscasos.dao.UsuarioDao;
import pe.edu.upeu.syscasos.entity.Rol;
import pe.edu.upeu.syscasos.entity.Usuario;
import pe.edu.upeu.syscasos.repository.RolRepository;
import pe.edu.upeu.syscasos.repository.UsuarioRepository;

@Component
public class UsuarioDaoImpl implements UsuarioDao{
	@Autowired
	private UsuarioRepository uRepository;
	@Autowired
	private RolRepository rolRepository;
	@Override
	public Usuario create(Usuario u) {
		// TODO Auto-generated method stub
		return uRepository.save(u);
	}

	@Override
	public Usuario update(Usuario u) {
		// TODO Auto-generated method stub
		return uRepository.save(u);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		uRepository.deleteById(id);
	}

	@Override
	public Optional<Usuario> read(Long id) {
		// TODO Auto-generated method stub
		return uRepository.findById(id);
	}

	@Override
	public List<Usuario> readAll() {
		// TODO Auto-generated method stub
		return uRepository.findAll();
	}
	
	public Usuario registrarUsuarioRol(Long usuarioId, Long rolId) {
		// TODO Auto-generated method stub
		Usuario us = uRepository.findById(usuarioId).get();
		Rol rol = rolRepository.findById(rolId).get();
		
		us.getRoles().add(rol);
		rol.getUsuarios().add(us);
		
		return uRepository.save(us);
	}

}
