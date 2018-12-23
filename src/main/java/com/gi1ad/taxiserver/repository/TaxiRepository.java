package com.gi1ad.taxiserver.repository;

import com.gi1ad.taxiserver.entity.Taxi;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaxiRepository extends JpaRepository<Taxi, Long> {
}
