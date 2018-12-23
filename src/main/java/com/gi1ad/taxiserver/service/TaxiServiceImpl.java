package com.gi1ad.taxiserver.service;


import com.gi1ad.taxiserver.entity.Taxi;
import com.gi1ad.taxiserver.repository.TaxiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TaxiServiceImpl implements TaxiService {

    @Autowired
    private TaxiRepository repository;


    public List<Taxi> getAll() {
        return repository.findAll();
    }


    public Taxi getById(long id) {
        return repository.getOne(id);
    }


    public Taxi save(Taxi taxi) {
        return repository.saveAndFlush(taxi);
    }

    public void remove(long id) {
        repository.deleteById(id);

    }
}
