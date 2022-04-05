package com.jp.trade;
import java.util.List;

public class Trade {

	private int tradeId;
	private long tradeValue;
	private int tradeSLA;
	private int orderId;
	List<Contract> contracts;

	public int getTradeId() {
		return tradeId;
	}

	public void setTradeId(int tradeId) {
		this.tradeId = tradeId;
	}

	public long getTradeValue() {
		return tradeValue;
	}

	public void setTradeValue(long tradeValue) {
		this.tradeValue = tradeValue;
	}

	public int getTradeSLA() {
		return tradeSLA;
	}

	public void setTradeSLA(int tradeSLA) {
		this.tradeSLA = tradeSLA;
	}

	public List<Contract> getContracts() {
		return contracts;
	}

	public void setContracts(List<Contract> contracts) {
		this.contracts = contracts;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	@Override
	public String toString() {
		return "Trade [tradeId=" + tradeId + ", tradeValue=" + tradeValue + ", tradeSLA=" + tradeSLA + ", orderId="
				+ orderId + ", contracts=" + contracts + "]";
	}

	
	
	

}
