package com.jp.trade;

public class Contract {

	private int contractId;
	private String description;
	private int hours;
	private int orderId;

	public int getContractId() {
		return contractId;
	}

	public void setContractId(int contractId) {
		this.contractId = contractId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	@Override
	public String toString() {
		return "Contract [contractId=" + contractId + ", description=" + description + ", hours=" + hours + ", orderId="
				+ orderId + "]";
	}

	
	

}
