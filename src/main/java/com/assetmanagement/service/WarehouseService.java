package com.assetmanagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.assetmanagement.entity.Warehouse;

@Service
public interface WarehouseService {
	 public Warehouse saveWarehouse(Warehouse warehouse);
	 
	 public Warehouse updateWarehouse(Warehouse warehouse);
	 
	 public void deleteWarehouse(int warehouseId);
	 
	 public List<Warehouse> getAllWarehouse();
	 
	 public Warehouse getWarehouseById(int warehouseId);
	 
	 Warehouse getByWarehouseName(String WarehouseName);

}
