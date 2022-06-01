package com.assetmanagement.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.assetmanagement.entity.WarehouseAsset;



public interface WarehouseAssetRepository extends JpaRepository<WarehouseAsset, Integer>{
	
}
