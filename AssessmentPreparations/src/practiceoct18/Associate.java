package practiceoct18;
import java.util.Scanner;
public class Associate {
	
	private int associateid;
	private String associateName;
	private String workStatus;
	
	public Associate(int associateid, String associateName, String workStatus) {
		this.associateid=associateid;
		this.associateName=associateName;
		this.workStatus=workStatus;
		
	}

	public int getAssociateid() {
		return associateid;
	}

	public void setAssociateid(int associateid) {
		this.associateid = associateid;
	}
	public String getAssociateName() {
		return associateName;
	}

	public void setAssociateName(String associateName) {
		this.associateName = associateName;
	}

	public String getWorkStatus() {
		return workStatus;
	}
	public void setWorkStatus(String workStatus) {
		this.workStatus = workStatus;
	}
	
	public void trackAssociateStatus(int days) {
		
		if(days<=20)
			setWorkStatus("Learning Core Skills");
		else if(days>20 && days<=40)
			setWorkStatus("Learning Advanced Modules");
		else if(days>40 && days<=60)
			setWorkStatus("Reached Project Phase");
		else 
			setWorkStatus("Deployed in Project");
		
		
		
	}	
}
	

	