package com.gi1ad.taxiserver.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;


@Entity
@Table (name = "taxi")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})

public class Taxi {

    @Id
    @GeneratedValue (generator = "increment")
    @GenericGenerator(name = "increment" , strategy = "increment")
    private long id;

    @Column (name = "taxi_number", nullable = false, length = 50)
    private String taxiNumber;

    @Column (name = "phone_number", nullable = false)
    private long phoneNumber;

    @Column (name = "passport_number", nullable = false)
    private String passportNumber;

    @Column (name = "car_brand", nullable = false)
    private String carBrand;


    public Taxi() {

    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
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
