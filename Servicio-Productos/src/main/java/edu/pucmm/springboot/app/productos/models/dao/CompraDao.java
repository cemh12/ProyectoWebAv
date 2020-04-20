package edu.pucmm.springboot.app.productos.models.dao;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import edu.pucmm.springboot.app.productos.models.entity.Compra;

@RepositoryRestResource(path="compras")
public interface CompraDao extends PagingAndSortingRepository<Compra, Long>{

}
