package com.ecommerce.pbo.services;

import java.util.Optional;

import com.ecommerce.pbo.model.producto;

public interface ProductoServicio {

	//Metodos CRUD (Create , Read, Update , Delete)
	public producto save(producto Producto);
	public Optional<producto> get(Integer id); //Esto es pa buscar
	public void update(producto Producto);
	public void delete(Integer id);
}
