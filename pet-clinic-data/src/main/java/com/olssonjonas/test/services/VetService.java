package com.olssonjonas.test.services;

import java.util.Set;

import com.olssonjonas.test.model.Vet;

public interface VetService {
	
	Vet save(Vet vet);
	
	Vet findById(long id);
	
	Set<Vet> findAll();

}
