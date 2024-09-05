package pe.edu.upeu.syscasos.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name="rentas")
public class Renta {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	@Column(name = "fecha_reg")	
	@Temporal(TemporalType.TIMESTAMP) 
	private Date fecha_reg;
	@Column(name = "fecha_entrega")	
	@Temporal(TemporalType.TIMESTAMP) 
	private Date fecha_entrega;
	@Column(name = "fecha_dev")	
	@Temporal(TemporalType.TIMESTAMP) 
	private Date fecha_dev;
	@Column(name="estado")
	private char estado;
	
	@ManyToOne
	@JoinColumn(name = "cliente_id", nullable = false)
	private Cliente cliente;
	
	@ManyToOne
	@JoinColumn(name = "pelicula_id", nullable = false)
	private Pelicula pelicula;
	
	@ManyToOne
	@JoinColumn(name = "usuario_id", nullable = false)
	private Usuario usuario;
}
