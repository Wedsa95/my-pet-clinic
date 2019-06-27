package com.olssonjonas.test.services;

import java.util.Set;

public interface CrudService<T, ID> {
	
	T findById(ID id);
	
	Set<T> findAll();
	
	void delete(T object);
	
	void deleteById(ID id);

	T save(T object);
}
