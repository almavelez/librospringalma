package com.example.democrudmongo.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.democrudmongo.model.Libro;
import com.example.democrudmongo.service.api.LibroServiceAPI;

@RestController
@RequestMapping("/libro/api/v1")
public class LibroController {
	
	@Autowired
	private LibroServiceAPI libroServiceAPI;
	
	@GetMapping(value = "all")
	public List<Libro> getAll(){
		return libroServiceAPI.getAll();
	}
	
	@GetMapping(value = "/find/{id}")
	public Libro find(@PathVariable Long id){
		return libroServiceAPI.get(id);
	}
	
	@PostMapping(value="/save")
	public ResponseEntity<Libro> save(@RequestBody Libro libro){
		Libro obj = libroServiceAPI.save(libro);
		return new ResponseEntity<Libro>(obj, org.springframework.http.HttpStatus.OK);
	}
	
	@GetMapping(value = "/delete/{id}")
	public ResponseEntity<Libro> delete(@PathVariable Long id){
		Libro libro = libroServiceAPI.get(id);
		if (libro != null) {
			libroServiceAPI.delete(id);
		} else {
			return new ResponseEntity<Libro>(org.springframework.http.HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<Libro>(libro, org.springframework.http.HttpStatus.OK);
	}
}









