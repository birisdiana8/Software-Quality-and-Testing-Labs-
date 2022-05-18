package memento;

public class ProgMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ManagerContractVersions manager = new ManagerContractVersions();
		
		Contract contract = new Contract("Diana");
		contract.addClause("increase salary");//
		manager.addContractVersion(contract.saveVersion());
		
		System.out.println(contract);
		//
		
		contract.addClause("work from home");//
		manager.addContractVersion(contract.saveVersion());
		System.out.println(contract);
		
		contract.addClause("Manager new role");//
		manager.addContractVersion(contract.saveVersion());
		System.out.println(contract);
		
	
		//manager.recoverContractFromSpecificVersion(0);
		contract.restoreFromVersion(manager.recoverContractFromSpecificVersion(0));
		System.out.println("-------Recover-------");
		System.out.println(contract);

	}

}
