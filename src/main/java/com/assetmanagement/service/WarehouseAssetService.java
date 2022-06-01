package com.assetmanagement.service;

import java.util.List;

import com.assetmanagement.entity.Asset;
import com.assetmanagement.entity.WarehouseAsset;



public interface WarehouseAssetService {

	WarehouseAsset addWarehouseAsset(WarehouseAsset warehouseAsset);
	
	WarehouseAsset getWarehouseAssetById(int warehouseAssetId);
	
	List<WarehouseAsset> getAllWarehouseAsset();
	
	
}
