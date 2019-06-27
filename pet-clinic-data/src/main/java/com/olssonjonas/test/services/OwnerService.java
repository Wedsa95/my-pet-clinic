package com.olssonjonas.test.services;

import java.util.Set;

import com.olssonjonas.test.model.Owner;

public interface OwnerService {
	
	Owner findByLastName(String lastName);
	
	Owner save(Owner owner);
	
	Owner findById(long id);
	
	Set<Owner> findAll();
}
