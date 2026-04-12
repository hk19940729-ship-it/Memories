package com.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Entities.ANYCODEEntity;


@Repository
public interface ANYCODERepository extends JpaRepository<ANYCODEEntity, String> {
}