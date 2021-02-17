package com.jpa.jpaminiproject.entity.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.jpaminiproject.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
