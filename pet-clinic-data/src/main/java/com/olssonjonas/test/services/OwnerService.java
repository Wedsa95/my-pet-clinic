package com.olssonjonas.test.services;

import com.olssonjonas.test.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
	
	Owner findByLastName(String lastName);
	
}
