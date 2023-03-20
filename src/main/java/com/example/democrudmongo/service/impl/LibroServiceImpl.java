package com.example.democrudmongo.service.impl;

import com.example.democrudmongo.model.Libro;
import com.example.democrudmongo.service.api.LibroServiceAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.example.democrudmongo.commons.GenericServiceImpl;
import com.example.democrudmongo.commons.GenericserviceAPI;
import com.example.democrudmongo.dao.api.LibroRepository;


@SuppressWarnings("unused")
@Service
public class LibroServiceImpl extends GenericServiceImpl<Libro, Long> implements LibroServiceAPI{

	@Autowired
	private LibroRepository  libroRepository;
	
	@Override
	public CrudRepository<Libro, Long> getDao() {
		return libroRepository;
		
	}
}
