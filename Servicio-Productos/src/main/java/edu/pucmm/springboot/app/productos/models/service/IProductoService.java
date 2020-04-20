package edu.pucmm.springboot.app.productos.models.service;

import java.util.List;

import edu.pucmm.springboot.app.productos.models.entity.Producto;

public interface IProductoService {
	
	public List<Producto> findAll();
	public Producto findById(Long Id);

}
