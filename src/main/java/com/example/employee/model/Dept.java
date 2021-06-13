package com.example.employee.model;
import java.util.List;


public class Dept
{
    private String deptId;

    @Override
	public String toString() {
		return "Dept [deptId=" + deptId + ", department=" + department + ", employees=" + employees + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((department == null) ? 0 : department.hashCode());
		result = prime * result + ((deptId == null) ? 0 : deptId.hashCode());
		result = prime * result + ((employees == null) ? 0 : employees.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dept other = (Dept) obj;
		if (department == null) {
			if (other.department != null)
				return false;
		} else if (!department.equals(other.department))
			return false;
		if (deptId == null) {
			if (other.deptId != null)
				return false;
		} else if (!deptId.equals(other.deptId))
			return false;
		if (employees == null) {
			if (other.employees != null)
				return false;
		} else if (!employees.equals(other.employees))
			return false;
		return true;
	}
	private String department;

    private List<Employees> employees;

    public void setDeptId(String deptId){
        this.deptId = deptId;
    }
    public String getDeptId(){
        return this.deptId;
    }
    public void setDepartment(String department){
        this.department = department;
    }
    public String getDepartment(){
        return this.department;
    }
    public void setEmployees(List<Employees> employees){
        this.employees = employees;
    }
    public List<Employees> getEmployees(){
        return this.employees;
    }
}
