package edu.uspg.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.uspg.model.Alumno;
import edu.uspg.service.IAlumnoService;

@RestController
@RequestMapping("/alumno")
public class AlumnoController {

	@Autowired
	private IAlumnoService service;
	
	@GetMapping(produces= MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Alumno>> listar(){
		return new ResponseEntity<List<Alumno>>(service.listar(), HttpStatus.OK);
	}
	
	@GetMapping(value ="/{id}", produces= MediaType.APPLICATION_JSON_VALUE)
	public Optional<Alumno> listarPorId(@PathVariable("id") Integer id){
		return service.listarPorId(id);
	}
	
	@PostMapping(produces= MediaType.APPLICATION_JSON_VALUE,  
			consumes= MediaType.APPLICATION_JSON_VALUE)
	public Alumno registrar(@RequestBody Alumno alu) {
		return service.registrar(alu);
	}
	
	@PutMapping(produces= MediaType.APPLICATION_JSON_VALUE,  
			consumes= MediaType.APPLICATION_JSON_VALUE)
	public Alumno modificar(@RequestBody Alumno alumno){
		return service.modificar(alumno);
		
	}
	
	@DeleteMapping(value="/{id}")
	public void eliminar(@PathVariable("id") Integer id) {
		service.eliminar(id);
	}
	
	
	
}
