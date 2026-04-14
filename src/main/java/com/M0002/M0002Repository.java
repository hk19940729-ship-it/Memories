package com.M0002;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Entities.TOREntity;


@Repository
public interface M0002Repository extends JpaRepository<TOREntity, String> {
}

