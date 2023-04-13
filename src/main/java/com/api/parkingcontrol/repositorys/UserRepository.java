package com.api.parkingcontrol.repository;

import com.api.parkingcontrol.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<Users, UUID> {

    Optional<Users> findByUsername(String username);
}
