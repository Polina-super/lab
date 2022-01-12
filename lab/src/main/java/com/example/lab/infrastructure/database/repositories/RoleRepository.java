package com.example.lab.infrastructure.database.repositories;

import com.example.lab.infrastructure.database.entities.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<UserRole, Long> {
}