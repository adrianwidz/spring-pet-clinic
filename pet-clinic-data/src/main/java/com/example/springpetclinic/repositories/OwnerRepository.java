package com.example.springpetclinic.repositories;

import com.example.springpetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {

    public Owner findByLastName(String lastName);

}
