package sprint1.sprint1.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Persons {
    @Id
    private int RegIdenti;
    private String RegName;
    private String RegLastN;
    private String RegEmail;
    private int RegMobile;
    private String RegDirection;
    private String RegTown;

	public int getRegIdenti() {
		return RegIdenti;
	}



	public void setRegIdenti(int regIdenti) {
		RegIdenti = regIdenti;
	}



	public String getRegName() {
		return RegName;
	}



	public void setRegName(String regName) {
		RegName = regName;
	}



	public String getRegLastN() {
		return RegLastN;
	}



	public void setRegLastN(String regLastN) {
		RegLastN = regLastN;
	}



	public String getRegEmail() {
		return RegEmail;
	}



	public void setRegEmail(String regEmail) {
		RegEmail = regEmail;
	}



	public int getRegMobile() {
		return RegMobile;
	}



	public void setRegMobile(int regMobile) {
		RegMobile = regMobile;
	}



	public String getRegDirection() {
		return RegDirection;
	}



	public void setRegDirection(String regDirection) {
		RegDirection = regDirection;
	}



	public String getRegTown() {
		return RegTown;
	}



	public void setRegTown(String regTown) {
		RegTown = regTown;
	}



	@Override
	public String toString() { 
        return "Persons [RegIdenti=" + RegIdenti + ", RegName=" + RegName + ", RegLastN=" + RegLastN + ", RegEmail=" + RegEmail + ", RegMobile=" + RegMobile + ", RegDirection=" + RegDirection + ", RegTown=" + RegTown + " ]";
	}
}
