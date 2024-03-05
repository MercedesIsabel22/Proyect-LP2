package edu.cibertec.proyecto.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="tb_ventas")
public class VentaEntity {

	@Id
	private String ventas;
	@ManyToOne
	@JoinColumn(name = "cliente")
	private ClienteEntity cliente;
	private Double precio;
	private Date fecha;
	private int estado;


}
