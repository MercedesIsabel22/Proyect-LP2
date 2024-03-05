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
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_usuarios")
public class UsuarioEntity {
@Id
private int idusuario;
private String nombre;
private String usuario;
private String clave;
private int estado;

}
