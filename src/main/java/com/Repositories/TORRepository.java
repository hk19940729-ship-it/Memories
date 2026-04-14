package com.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Entities.TOREntity;


@Repository
public interface TORRepository extends JpaRepository<TOREntity,String> {
}