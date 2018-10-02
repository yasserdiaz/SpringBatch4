package com.yasser.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yasser.entity.Users;

public interface UsersRepository extends JpaRepository<Users, Long> {
}
