package com.assetmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.assetmanagement.entity.WarehouseAsset;
import com.assetmanagement.service.WarehouseAssetService;



@RestController
public class WarehouseAssetController {

	@Autowired
	private WarehouseAssetService warehouseAssetService;
	
	

	/*
	 * @PostMapping("/warehouseAsset/save") public ResponseEntity<WarehouseAsset>
	 * addWarehouseAsset(@RequestBody WarehouseAsset warehouseAsset) {
	 * 
	 * WarehouseAsset newWarehouseAsset =
	 * warehouseAssetService.addWarehouseAsset(warehouseAsset);
	 * ResponseEntity<WarehouseAsset> responseEntity = new
	 * ResponseEntity<>(newWarehouseAsset,HttpStatus.CREATED); return
	 * responseEntity; }
	 */
	
	@GetMapping("/warehouseAsset/find/{warehouseAssetId}")
	public ResponseEntity<Object> fetchWarehouseAssetById(@PathVariable("warehouseAssetId") int warehouseAssetId) {
		
		ResponseEntity<Object> responseEntity = null;		
		WarehouseAsset warehouseAsset = warehouseAssetService.getWarehouseAssetById(warehouseAssetId);	
		responseEntity = new ResponseEntity<>(warehouseAsset,HttpStatus.OK);				
		return responseEntity;
	}
		
	}
