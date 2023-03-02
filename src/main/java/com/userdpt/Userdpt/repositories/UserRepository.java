package com.userdpt.Userdpt.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.userdpt.Userdpt.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
