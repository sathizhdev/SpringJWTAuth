package com.example.springjwtauth.Repo;

import com.example.springjwtauth.Entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepo extends JpaRepository<Users,Long> {

    Optional<Users> findByEmail(String email);

    @Override
    <S extends Users> S save(S entity);
}
