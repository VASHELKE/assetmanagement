package com.assetmanagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assetmanagement.entity.Asset;
import com.assetmanagement.entity.WarehouseAsset;
import com.assetmanagement.exception.WarehouseAssetNotFoundException;
import com.assetmanagement.repository.WarehouseAssetRepository;

@Service
public class WarehouseAssetServiceImpl implements WarehouseAssetService {

	@Autowired
	private WarehouseAssetRepository warehouseAssetRepository;

	
	 @Override public WarehouseAsset addWarehouseAsset(WarehouseAsset warehouseAsset) {
	 
	 WarehouseAsset savedWarehouseAsset =
	 warehouseAssetRepository.save(warehouseAsset); return savedWarehouseAsset;
	 
	  }
	 


	@Override
	public WarehouseAsset getWarehouseAssetById(int warehouseAssetId)  {
		
			Optional<WarehouseAsset> optionalWarehouseAsset = warehouseAssetRepository.findById(warehouseAssetId);		
			
			if(optionalWarehouseAsset.isEmpty()) {
				
				throw new WarehouseAssetNotFoundException("WarehouseAsset Not found with id: "+warehouseAssetId);
			}
			
			WarehouseAsset warehouseAsset = optionalWarehouseAsset.get();
			return warehouseAsset;
			
		}
		
	
	@Override
	public List<WarehouseAsset> getAllWarehouseAsset() {
		
		
			List<WarehouseAsset> warehouseAsset = warehouseAssetRepository.findAll();
			return warehouseAsset;
		
			
		}



	

	


	
}