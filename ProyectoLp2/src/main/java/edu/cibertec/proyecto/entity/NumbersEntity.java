package edu.cibertec.proyecto.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="tb_number")
public class NumbersEntity {
	@Id
	private int idnumber;
	private String prefij;
	private int numeracion;

	public String codigoconPrefijo() {
		String cod = getPrefij() + getNumeracion();
		return cod;
	}

}
