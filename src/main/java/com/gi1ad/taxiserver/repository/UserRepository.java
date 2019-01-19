package com.gi1ad.taxiserver.repository;

import com.gi1ad.taxiserver.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User,Long> {
}
