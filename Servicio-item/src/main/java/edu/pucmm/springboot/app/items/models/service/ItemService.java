package edu.pucmm.springboot.app.items.models.service;

import java.util.List;

import edu.pucmm.springboot.app.items.models.Item;

public interface ItemService {

	public List<Item> findAll();
	public Item findById(Long id, Integer cantidad);
}
