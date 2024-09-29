package com.ecommerce.pbo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.pbo.dao.ProductoDao;
import com.ecommerce.pbo.model.producto;

@Service
public class ProductoServicioImpl implements ProductoServicio {

	@Autowired
	private ProductoDao productodao;
	
	@Override
	public producto save(producto Producto) {
		return productodao.save(Producto);
	}

	@Override
	public Optional<producto> get(Integer id) {
		return productodao.findById(id);
	}

	@Override
	public void update(producto Producto) {
		productodao.save(Producto);
	}

	@Override
	public void delete(Integer id) {
		productodao.deleteById(id);
		
	}


}
