package com.gi1ad.taxiserver.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping ("/taxi")
public class TaxiController {

    @RequestMapping (value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public String getTaxi (ModelMap model){
        return "Taxi";
    }


}
