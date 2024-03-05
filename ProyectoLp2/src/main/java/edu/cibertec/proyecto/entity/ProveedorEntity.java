package edu.cibertec.proyecto.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
@Table(name="tb_proveedor")
public class ProveedorEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idproveedor;
	private String rucdni;
	private String razonsocial;
	private String celular;
	private String correo;
	private int estado;

}
