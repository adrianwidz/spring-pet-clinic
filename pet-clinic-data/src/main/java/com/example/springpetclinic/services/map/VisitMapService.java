package com.example.springpetclinic.services.map;

import com.example.springpetclinic.model.Visit;
import com.example.springpetclinic.services.VisitService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VisitMapService extends AbbstractServiceMap<Visit, Long> implements VisitService {
    @Override
    public Set<Visit> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);

    }

    @Override
    public void delete(Visit object) {
        super.delete(object);

    }

    @Override
    public Visit save(Visit visit) {

        if (visit.getPet() == null || visit.getPet().getOwner() == null || visit.getId() == null) {
            throw new RuntimeException("Invalid visit");
        }
        return super.save(visit);
    }

    @Override
    public Visit findById(Long id) {
        return super.findByID(id);
    }
}
