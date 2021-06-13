package com.example.employee.model;

import java.util.List;

public class Data
{
    private List<Dept> dept;

    public void setDept(List<Dept> dept){
        this.dept = dept;
    }
    public List<Dept> getDept(){
        return this.dept;
    }
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dept == null) ? 0 : dept.hashCode());
		return result;
	}
	@Override
	public String toString() {
		return "Data [dept=" + dept + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Data other = (Data) obj;
		if (dept == null) {
			if (other.dept != null)
				return false;
		} else if (!dept.equals(other.dept))
			return false;
		return true;
	}
}
