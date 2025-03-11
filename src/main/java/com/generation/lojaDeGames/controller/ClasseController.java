package com.generation.lojaDeGames.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.generation.lojaDeGames.model.Classe;
import com.generation.lojaDeGames.repository.ClasseRepository;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/classe")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ClasseController {

	@Autowired
	private ClasseRepository classeRepository;

	@GetMapping
	public ResponseEntity<List<Classe>> getAll() {
		return ResponseEntity.ok(classeRepository.findAll());
	}

	@GetMapping("/{id}")
	public ResponseEntity<Classe> getById(@PathVariable Long id) {
		return classeRepository.findById(id).map(resposta -> ResponseEntity.ok(resposta))
				.orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
	}

	@GetMapping("/nome/{nome}")
	public  ResponseEntity<List<Classe>> getByNome(@PathVariable String nome) {
		return ResponseEntity.ok(classeRepository
				.findAllByNomeContainingIgnoreCase(nome));
	}

	@PostMapping
	public ResponseEntity<Classe> post(@Valid @RequestBody Classe classe) {
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(classeRepository.save(classe));
	}

	@PutMapping
	public ResponseEntity<Classe> put(@Valid @RequestBody Classe classe) {
		return classeRepository.findById(classe.getId())
				.map(resposta -> ResponseEntity.status(HttpStatus.CREATED).body(classeRepository.save(classe)))
				.orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());

	}

	@ResponseStatus(HttpStatus.NO_CONTENT)
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		Optional<Classe> classe = classeRepository.findById(id);

		if (classe.isEmpty())
			throw new ResponseStatusException(HttpStatus.NOT_FOUND);

		classeRepository.deleteById(id);
	}

}
