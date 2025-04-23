package com.student.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.entity.Users;

public interface UssersDAO extends JpaRepository<Users, String> {
}
