package com.olssonjonas.test.services;

import java.util.Set;

public interface CrudService<T, ID> {

	T save(T pet);
	
	T findById(ID id);
	
	Set<T> findAll();
	
	void delete(T object);
	
	void deleteById(ID id);
}
