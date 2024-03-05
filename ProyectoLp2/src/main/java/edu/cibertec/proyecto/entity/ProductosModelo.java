package edu.cibertec.proyecto.entity;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductosModelo {
	private int idProducto;
	private String name;
	private String idCliente;
	@NotNull
	private int cantidad;
	@NotNull
	private Double costo;

}
