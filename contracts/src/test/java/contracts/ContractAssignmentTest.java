package contracts;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

import org.junit.Test;

import com.jp.trade.Contract;
import com.jp.trade.ContractAssignment;
import com.jp.trade.Trade;

public class ContractAssignmentTest {

	@Test
	public void assignContractsTest(){
			
		ConcurrentHashMap<Integer, Contract>  contractMap = new ConcurrentHashMap<Integer,  Contract>();   
		Contract contract1=new Contract();
		Contract testContract2=new Contract();
		testContract2.setContractId(5);
		contract1.setContractId(1);
		contractMap.put(contract1.getContractId(), contract1);
		contractMap.put(testContract2.getContractId(), testContract2);
		List<Trade> tradeList=new ArrayList<>();
		Trade trade1=new Trade();
		Trade trade2=new Trade();
		trade1.setTradeId(1);
		trade1.setTradeSLA(4);
		trade1.setTradeValue(10000);
		trade2.setTradeId(2);
		tradeList.add(trade1);
		tradeList.add(trade2);
		ContractAssignment contractAssignment=new ContractAssignment();
		contractAssignment.assignContracts(contractMap, tradeList);		
		//contractAssign.assignContracts(contractList1, tradeList);
	}
	
	@Test
	public void assignContractsTestWithOrderId(){
		List<Contract> contractListTest=new ArrayList<>();
		
		Contract contract1=new Contract();
		Contract testContract2=new Contract();
		testContract2.setContractId(5);
		contract1.setContractId(1);
		contract1.setOrderId(1);
		contractListTest.add(contract1);
		List<Trade> tradeList=new ArrayList<>();
		Trade trade1=new Trade();
		Trade trade2=new Trade();
		trade1.setTradeId(1);
		trade1.setTradeSLA(4);
		trade1.setTradeValue(10000);
		trade1.setOrderId(1);
		trade2.setTradeId(2);
		trade2.setOrderId(2);
		tradeList.add(trade1);
		tradeList.add(trade2);
		ContractAssignment contractAssignment=new ContractAssignment();
		contractAssignment.assignContractsWithOrderId(contractListTest, tradeList);
		
		//contractAssign.assignContracts(contractList1, tradeList);
	}
}
