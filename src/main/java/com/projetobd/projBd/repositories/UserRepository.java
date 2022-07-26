package com.projetobd.projBd.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetobd.projBd.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
