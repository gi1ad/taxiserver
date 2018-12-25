package com.gi1ad.taxiserver;

import com.gi1ad.taxiserver.entity.Taxi;
import com.gi1ad.taxiserver.service.TaxiServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaxiserverApplicationTests {

    @Autowired
    private TaxiServiceImpl service;

    @Test
    public void saveTest() {

    }


}





