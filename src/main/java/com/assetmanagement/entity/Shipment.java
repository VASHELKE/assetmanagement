package com.assetmanagement.entity;

	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.Table;

	@Entity
	@Table(name = "shipment_tbl")
	public class Shipment {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "ship_id")
		private int shipmentId;
		@Column(name = "ship_assets")
		private String shipmentAssets;
		@Column(name = "ship_status")
		private String shipmentStatus;
		@Column(name = "ship_sub_location")
		private String shipmentSubLocation;
		@Column(name = "ship_location")
		private String shipmentLocation;
		@Column(name = "state")
		private String State;
		@Column(name = "country")
		private String country;
		private int fromWarehouseId;
		private int toWarehouseId;	
		
		public int getShipmentId() {
			return shipmentId;
		}
		public void setShipmentId(int shipmentId) {
			this.shipmentId = shipmentId;
		}
		public String getShipmentAssets() {
			return shipmentAssets;
		}
		public void setShipmentAssets(String shipmentAssets) {
			this.shipmentAssets = shipmentAssets;
		}
		public String getShipmentStatus() {
			return shipmentStatus;
		}
		public void setShipmentStatus(String shipmentStatus) {
			this.shipmentStatus = shipmentStatus;
		}
		public String getShipmentSubLocation() {
			return shipmentSubLocation;
		}
		public void setShipmentSubLocation(String shipmentSubLocation) {
			this.shipmentSubLocation = shipmentSubLocation;
		}
		public String getShipmentLocation() {
			return shipmentLocation;
		}
		public void setShipmentLocation(String shipmentLocation) {
			this.shipmentLocation = shipmentLocation;
		}
		public String getState() {
			return State;
		}
		public void setState(String state) {
			State = state;
		}
		public String getCountry() {
			return country;
		}
		public void setCountry(String country) {
			this.country = country;
		}
		
		public int getFromWarehouseId() {
			return fromWarehouseId;
		}
		public void setFromWarehouseId(int fromWarehouseId) {
			this.fromWarehouseId = fromWarehouseId;
		}
		public int getToWarehouseId() {
			return toWarehouseId;
		}
		public void setToWarehouseId(int toWarehouseId) {
			this.toWarehouseId = toWarehouseId;
		}

}