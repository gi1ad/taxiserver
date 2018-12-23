package com.gi1ad.taxiserver.service;

import com.gi1ad.taxiserver.entity.Taxi;

import java.util.List;

public interface TaxiService {

    List<Taxi> getAll();
    Taxi getById(long id);
    Taxi save (Taxi taxi);
    void remove (long id);

}
