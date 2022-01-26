package org.farmaciagrupo2.farmaciaGrupo2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository<Categoria> extends JpaRepository<Categoria, Long> {
	public List <Categoria> findAllByIdContainingIgnoreCase(String id);
}
