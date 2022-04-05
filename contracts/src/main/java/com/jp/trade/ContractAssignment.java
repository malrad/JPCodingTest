package com.jp.trade;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class ContractAssignment {

	public static void main(String[] args) {
		
		ConcurrentHashMap<Integer, Contract>  contractMap = new ConcurrentHashMap<Integer,  Contract>();  
		List<Contract> contractListTest=new ArrayList<>();
		Contract contract1=new Contract();
		Contract testContract2=new Contract();
		testContract2.setContractId(5);
		contract1.setContractId(1);
		contract1.setOrderId(1);
		contractMap.put(contract1.getContractId(), contract1);
		contractMap.put(testContract2.getContractId(), testContract2);
		contractListTest.add(testContract2);
		contractListTest.add(contract1);
		List<Trade> tradeList=new ArrayList<>();
		List<Trade> tradeListWithOrder=new ArrayList<>();
		Trade trade1=new Trade();
		Trade trade2=new Trade();
		trade1.setTradeId(1);
		trade1.setTradeSLA(4);
		trade1.setTradeValue(10000);
		trade2.setTradeId(2);
		tradeList.add(trade1);
		tradeList.add(trade2);
		Trade trade3=new Trade();
		Trade trade4=new Trade();
		trade3.setTradeId(1);
		trade3.setTradeSLA(4);
		trade3.setTradeValue(10000);
		trade3.setOrderId(1);
		trade4.setTradeId(2);
		trade4.setOrderId(2);
		tradeListWithOrder.add(trade3);
		tradeListWithOrder.add(trade4);
		ContractAssignment contractAssignment=new ContractAssignment();
		contractAssignment.assignContracts(contractMap, tradeList);	
		contractAssignment.assignContractsWithOrderId(contractListTest, tradeListWithOrder);

	}

	/**
	 * Assign contracts to trades
	 * 
	 * @param contractListTest List of contracts to be assigned to trades
	 * @param tradeList        List of trades
	 */
	public void assignContracts(ConcurrentHashMap<Integer, Contract> contractsMap, List<Trade> tradeList) {
		if (!tradeList.isEmpty()) {

			for (Trade trade : tradeList) {
				for (Integer key : contractsMap.keySet()) {
					List<Contract> contractList = new ArrayList<>();
					contractList.add(contractsMap.get(key));
					trade.setContracts(contractList);
					contractsMap.remove(key);
					break;
				}

			}
		}
		System.out.println("Trades and their assigned contracts " );
		tradeList.forEach(tra -> System.out.println(tra.toString()));
	}

	public void assignContractsWithOrderId(List<Contract> contracts, List<Trade> trades) {

		if (null != trades && trades.size() > 0) {
			for (Trade trade : trades) {
				if (null != contracts && contracts.size() > 0) {
					for (Contract contract : contracts) {
						if (trade.getOrderId() == contract.getOrderId()) {
							List<Contract> contractList = new ArrayList<>();
							contractList.add(contract);
							trade.setContracts(contractList);
						}
					}
				}
			}
			System.out.println("Trades with orderId and their assigned contracts " );
			trades.forEach(tra -> System.out.println(tra.toString()));
		}
	}

}
