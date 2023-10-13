package com.example.be.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.be.entities.AuditEntity;

@Repository
public interface SupperRepository extends JpaRepository<AuditEntity, String>, CrudRepository<AuditEntity,String>{
	
}
