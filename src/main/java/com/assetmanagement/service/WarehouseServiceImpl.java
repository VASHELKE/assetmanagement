package com.assetmanagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assetmanagement.entity.Warehouse;
import com.assetmanagement.exception.WarehouseNotFoundException;
import com.assetmanagement.repository.WarehouseRepository;


@Service
public class WarehouseServiceImpl implements WarehouseService{
	@Autowired
	private WarehouseRepository warehouseRepository;
	

	@Override
	public Warehouse saveWarehouse(Warehouse warehouse) {
		Warehouse savedWarehouse=warehouseRepository.save(warehouse);
		return savedWarehouse;
	}

	@Override
	public Warehouse updateWarehouse(Warehouse warehouse) {
		Optional<Warehouse> optional =warehouseRepository.findById(warehouse.getWarehouseId());
		if(optional.isEmpty()) {
			throw new WarehouseNotFoundException("Warehouse not found with"+warehouse.getWarehouseId());
		}
		
		return warehouseRepository.save(warehouse);
	}

	@Override
	public void deleteWarehouse(int warehouseId) {
		Optional<Warehouse>optional=warehouseRepository.findById(warehouseId);
		if(optional.isEmpty()) {
			throw new WarehouseNotFoundException("warehouse not found with"+warehouseId);
		}
		warehouseRepository.deleteById(warehouseId);
	}

	@Override
	public List<Warehouse> getAllWarehouse() {
		
		return warehouseRepository.findAll();
	}

	@Override
	public Warehouse getWarehouseById(int warehouseId) {
		Optional<Warehouse> optional= warehouseRepository.findById(warehouseId);
		if(optional.isEmpty()) {
			throw new WarehouseNotFoundException("warehouse not found with "+warehouseId);
		}
		Warehouse warehouse=optional.get();
		return warehouse;
	}

	@Override
	public Warehouse getByWarehouseName(String warehouseName) {
		
		Optional<Warehouse> optional=warehouseRepository.findByWarehouseName(warehouseName);
		
		if(optional.isEmpty()) {
			throw new WarehouseNotFoundException("warehouse not found with"+warehouseName);
		}
		
		Warehouse warehouse=optional.get();
		return warehouse;
	}

}
