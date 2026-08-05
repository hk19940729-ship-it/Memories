package com.Repositories;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Entities.CALEntity;


@Repository
public interface CALRepository extends JpaRepository<CALEntity,Date> {
	
	List<CALEntity> findAllByDay(Date day);
}