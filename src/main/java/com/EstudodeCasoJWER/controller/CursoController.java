	package com.EstudodeCasoJWER.controller;
	
	import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.EstudodeCasoJWER.Service.CursoService;
import com.EstudodeCasoJWER.entitie.Curso;

import jakarta.validation.Valid;
	
	@RestController
	@RequestMapping
	public class CursoController {
	private final CursoService cursoService;
	
	public CursoController(CursoService cursoService) {
		this.cursoService = cursoService;
	}
	@GetMapping("/{id}")
	public ResponseEntity<Curso> getProductById(@PathVariable Long id) {
		Curso curso = cursoService.getCursoById(id);
		if (curso != null) {
			return ResponseEntity.ok(curso);
		} else {
			return ResponseEntity.notFound().build();
		}
	}
	@GetMapping
	public ResponseEntity<List<Curso>> getAllcurso() {
		List<Curso> curso = cursoService.getAllCurso();
		return ResponseEntity.ok(curso);
	}
	@PostMapping
	public ResponseEntity<Curso> criarcurso(@RequestBody @Valid Curso curso){
		Curso criarcurso = cursoService.salvarCurso(curso);
		return ResponseEntity.status(HttpStatus.CREATED).body(criarcurso);
	}
	@PutMapping("/{id}")
	public ResponseEntity<Curso> updateCurso(@PathVariable Long id, @RequestBody @Valid Curso curso) {
		Curso updatedCurso = cursoService.updateCurso(id, curso);
		if (updatedCurso != null) {
			return ResponseEntity.ok(updatedCurso);
		} else {
			return ResponseEntity.notFound().build();
		}
	}
	@DeleteMapping("/{id}")
	
	public ResponseEntity<String> deleteCurso(@PathVariable Long id) {
		boolean deleted = cursoService.deleteCurso(id);
		if (deleted) {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		} else {
			return ResponseEntity.notFound().build();
		}
	}
	
	}
