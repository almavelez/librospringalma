package com.example.democrudmongo.dao.api;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.democrudmongo.model.Libro;

public interface LibroRepository extends MongoRepository<Libro, Long>{

}
