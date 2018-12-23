package com.gi1ad.taxiserver.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;


@Entity
@Table (name = "taxi")


public class Taxi {

    @Id
    @GeneratedValue (generator = "increment")
    @GenericGenerator(name = "increment" , strategy = "increment")
    private long id;

    @Column (name = "taxi_number", nullable = false, length = 50)
    private String taxiNumber;

    @Column (name = "phone_number", nullable = false)
    private long phoneNumber;



    public Taxi (){

    }















    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTaxiNumber() {
        return taxiNumber;
    }

    public void setTaxiNumber(String taxiNumber) {
        this.taxiNumber = taxiNumber;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
