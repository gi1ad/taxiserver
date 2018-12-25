package com.gi1ad.taxiserver.controller;


import com.gi1ad.taxiserver.entity.Taxi;
import com.gi1ad.taxiserver.service.TaxiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class TaxiController {

    @Autowired
    private TaxiService service;

    @RequestMapping(value = "/taxi", method = RequestMethod.GET)
    @ResponseBody
    public List<Taxi> getAllTaxi() {
        return service.getAll();
    }

    @RequestMapping(value = "/taxi/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Taxi getTaxi(@PathVariable("id") long taxiId) {
        return service.getById(taxiId);
    }

    @RequestMapping(value = "/taxi", method = RequestMethod.POST)
    @ResponseBody
    public Taxi saveTaxi(@RequestBody Taxi taxi) {
        return service.save(taxi);
    }

    @RequestMapping(value = "/taxi/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void delete(@PathVariable long id) {
        service.remove(id);
    }
}
