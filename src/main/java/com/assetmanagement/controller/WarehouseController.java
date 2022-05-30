package com.assetmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.assetmanagement.entity.Warehouse;
import com.assetmanagement.service.WarehouseService;


@RestController
public class WarehouseController {
	
	@Autowired
	private WarehouseService warehouseService;
	
	@GetMapping("warehouse/all")
	public List<Warehouse> fetchAllWarehouses(){
		List<Warehouse> warehouses=warehouseService.getAllWarehouse();
		return warehouses;
	}
	
	@GetMapping("find/warehouse/{Id}")
	public ResponseEntity<Object> fetchWarehouseById(@PathVariable("pId") int warehouseId){
		ResponseEntity<Object> responseEntity = null;		
		Warehouse warehouse = warehouseService.getWarehouseById(warehouseId);	
		responseEntity = new ResponseEntity<>(warehouse,HttpStatus.OK);				
		return responseEntity;
	}
	
	@GetMapping("/product/find/{pName}")
	public ResponseEntity<Object> fetchProductById(@PathVariable("pName") String warehouseName) {
		
		ResponseEntity<Object> responseEntity = null;		
		Warehouse warehouse = warehouseService.getByWarehouseName(warehouseName);
		responseEntity = new ResponseEntity<>(warehouse,HttpStatus.OK);				
		return responseEntity;
	}
	
	@PostMapping("/warehouse/save")
	public ResponseEntity<Warehouse> addWarehouse(@RequestBody Warehouse product) {
		
		Warehouse newWarehouse = warehouseService.saveWarehouse(product);		
		ResponseEntity<Warehouse> responseEntity = new ResponseEntity<>(newWarehouse,HttpStatus.CREATED);
		return responseEntity;
	}
	
	@DeleteMapping("/warehouse/delete/{warehouseId}")
	public ResponseEntity<String> removeProduct(@PathVariable("warehouseId") int warehouseId) {
		
		warehouseService.deleteWarehouse(warehouseId)	;
		ResponseEntity<String> responseEntity = new ResponseEntity<>("Warehouse Deleted Successfully.", HttpStatus.OK);
		return responseEntity;		
	}
	
	@PutMapping("/warehouse/update")
	public ResponseEntity<Warehouse> modifyProduct(@RequestBody Warehouse warehouse) {
		
		Warehouse updatedProduct = warehouseService.updateWarehouse(warehouse);
		ResponseEntity<Warehouse> responseEntity = new ResponseEntity<>(updatedProduct,HttpStatus.OK);
		return responseEntity;
	}	

}
