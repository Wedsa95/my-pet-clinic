package com.olssonjonas.test.services;

import java.util.Set;

import com.olssonjonas.test.model.Pet;

public interface PetService {
	
	Pet save(Pet pet);
	
	Pet findById(long id);
	
	Set<Pet> findAll();

}
