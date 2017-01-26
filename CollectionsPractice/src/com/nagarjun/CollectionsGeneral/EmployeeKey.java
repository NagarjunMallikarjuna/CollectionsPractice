package com.nagarjun.CollectionsGeneral;

public class EmployeeKey {

	String employeeId;
	String dob;
	
	public EmployeeKey(String employeeId, String dob){
		this.employeeId=employeeId;
		this.dob=dob;
	}

	@Override
	public String toString() {
		return "EmployeeKey [employeeId=" + employeeId + ", dob=" + dob + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dob == null) ? 0 : dob.hashCode());
		result = prime * result
				+ ((employeeId == null) ? 0 : employeeId.hashCode());
		return result;
	}

	/*@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeKey other = (EmployeeKey) obj;
		if (dob == null) {
			if (other.dob != null)
				return false;
		} else if (!dob.equals(other.dob))
			return false;
		if (employeeId == null) {
			if (other.employeeId != null)
				return false;
		} else if (!employeeId.equals(other.employeeId))
			return false;
		return true;
	}*/
	

	
	
}
