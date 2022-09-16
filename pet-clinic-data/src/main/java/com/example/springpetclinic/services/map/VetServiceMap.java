package com.example.springpetclinic.services.map;

import com.example.springpetclinic.model.Pet;
import com.example.springpetclinic.model.Vet;
import com.example.springpetclinic.services.CrudService;

import java.util.Set;

public class VetServiceMap extends AbbstractMapService<Vet, Long> implements CrudService<Vet, Long> {

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public Vet findById(Long id) {
        return super.findByID(id);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }
}
