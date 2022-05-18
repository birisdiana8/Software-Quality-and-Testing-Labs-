package memento;

import java.util.ArrayList;

public class ManagerContractVersions {

	private ArrayList<ContractVersion> listContractVersions = new ArrayList<>();
	
	public void addContractVersion(ContractVersion contractVersion) {
		this.listContractVersions.add(contractVersion);
	}
	
	public ContractVersion recoverContractFromSpecificVersion(int i) {
		return this.listContractVersions.get(i);
	}
	
}
