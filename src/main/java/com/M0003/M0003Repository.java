package com.M0003;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Entities.TOREntity;


@Repository
public interface M0003Repository extends JpaRepository<TOREntity, String> {
}

