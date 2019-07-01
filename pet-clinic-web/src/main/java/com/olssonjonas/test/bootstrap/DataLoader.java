package com.olssonjonas.test.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.olssonjonas.test.model.Owner;
import com.olssonjonas.test.model.Vet;
import com.olssonjonas.test.services.OwnerService;
import com.olssonjonas.test.services.VetService;

@Component
public class DataLoader implements CommandLineRunner{
	
	private final OwnerService ownerService;
	private final VetService vetService;
	
	public DataLoader(OwnerService ownerService, VetService vetService) {
		this.ownerService = ownerService;
		this.vetService = vetService;
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("STARTING BOOTSTRAPING");
		Owner owner1 = new Owner();
		owner1.setFirstName("Sam");
		owner1.setLastName("Barry");
		
		ownerService.save(owner1);
		
		Owner owner2 = new Owner();
		owner2.setFirstName("Gaile");
		owner2.setLastName("Sam");
		
		ownerService.save(owner2);
		
		Owner owner3 = new Owner();
		owner3.setFirstName("Teemo");
		owner3.setLastName("Talia");
		
		ownerService.save(owner3);
		
		Owner owner4 = new Owner();
		owner4.setFirstName("Frank");
		owner4.setLastName("Sam");
		
		ownerService.save(owner4);
		
		Owner owner5 = new Owner();
		owner5.setFirstName("Team");
		owner5.setLastName("Titans");
		
		ownerService.save(owner5);
		
		Vet vet1 = new Vet();
		vet1.setFirstName("DR.Sam");
		vet1.setLastName("Barry");
		
		vetService.save(vet1);
		
		Vet vet2 = new Vet();
		vet2.setFirstName("DR.Gaile");
		vet2.setLastName("Sam");
		
		vetService.save(vet2);
		
		Vet vet3 = new Vet();
		vet3.setFirstName("DR.Teemo");
		vet3.setLastName("Talia");
		
		vetService.save(vet3);
		
		Vet vet4 = new Vet();
		vet4.setFirstName("DR.Frank");
		vet4.setLastName("Sam");
		
		vetService.save(vet4);
		
		Vet vet5 = new Vet();
		vet5.setFirstName("DR.Team");
		vet5.setLastName("Titans");
		
		vetService.save(vet5);
		
		System.out.println("ENDING BOOTSTRAPING");
	} 

}
