package org.farmaciagrupo2.farmaciaGrupo2.repository;

import java.util.List;

import org.farmaciagrupo2.farmaciaGrupo2.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

	public List <Categoria> findAllByDescricaoContainingIgnoreCase(String descricao);
}