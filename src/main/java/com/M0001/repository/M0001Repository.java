package com.M0001.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Entities.HINEntity;


@Repository
public interface M0001Repository extends JpaRepository<HINEntity, String> {
}