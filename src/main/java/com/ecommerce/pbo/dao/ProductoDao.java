package com.ecommerce.pbo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.pbo.model.producto;

@Repository
public interface ProductoDao extends JpaRepository<producto, Integer>{
	

}
