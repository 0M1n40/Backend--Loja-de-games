package com.generation.lojaDeGames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.generation.lojaDeGames.model.Classe;

public interface ClasseRepository extends JpaRepository<Classe, Long> {

	public List<Classe> findAllByNomeContainingIgnoreCase(@Param("nome") String nome);
}
