package edu.cibertec.proyecto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.cibertec.proyecto.entity.ProveedorEntity;
import java.util.List;

@Repository
public interface ProveedoresRepository extends JpaRepository<ProveedorEntity, Integer>{

	
	List<ProveedorEntity> findByEstado(int estado);
	
}
