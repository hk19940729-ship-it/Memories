package com.M0099;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Entities.ANYCODEEntity;
import com.Entities.AnyCodeKey;

@Repository
public interface M0099Repository extends JpaRepository<ANYCODEEntity, AnyCodeKey> {
}
