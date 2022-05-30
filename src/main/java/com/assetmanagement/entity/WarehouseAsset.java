package com.assetmanagement.entity;


import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

@Entity
@Table(name = "warehouse_asset_tbl")
public class WarehouseAsset {

	@EmbeddedId
	private WarehouseAssetKey id;

	@ManyToOne
	@MapsId("warehouseId")
	@JoinColumn(name = "warehouse_id")
	private Warehouse warehouse;

	@ManyToOne
	@MapsId("assetId")
	@JoinColumn(name = "asset_id")
	private Asset asset;

	@Column(name = "no_of_items")
	private int noOfItems;

	public WarehouseAssetKey getId() {
		return id;
	}

	public void setId(WarehouseAssetKey id) {
		this.id = id;
	}

	public Warehouse getWarehouse() {
		return warehouse;
	}

	public void setWarehouse(Warehouse warehouse) {
		this.warehouse = warehouse;
	}

	public Asset getAsset() {
		return asset;
	}

	public void setAsset(Asset asset) {
		this.asset = asset;
	}

	public int getNoOfItems() {
		return noOfItems;
	}

	public void setNoOfItems(int noOfItems) {
		this.noOfItems = noOfItems;
	}

	

	
}