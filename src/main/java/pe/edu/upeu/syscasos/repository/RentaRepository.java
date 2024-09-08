package pe.edu.upeu.syscasos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.syscasos.entity.Renta;

@Repository
public interface RentaRepository extends JpaRepository<Renta, Long>{

}
