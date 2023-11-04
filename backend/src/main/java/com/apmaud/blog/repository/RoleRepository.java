package com.apmaud.blog.repository;

import com.apmaud.blog.model.ERole;
import com.apmaud.blog.model.Role;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface RoleRepository extends MongoRepository<Role, String> {
    Optional<Role> findByName(ERole name);
}
