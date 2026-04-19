package com.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Entities.TOKEntity;


@Repository
public interface TOKRepository extends JpaRepository<TOKEntity,String> {
}