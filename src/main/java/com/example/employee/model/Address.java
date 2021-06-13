package com.example.employee.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Address
{
	@JsonIgnore
	private Long id;
    private String flatNo;

    private String buildingNo;

    private String colony;

    private String city;

    private String sate;

    private String country;

    private String pinCode;

    public void setFlatNo(String flatNo){
        this.flatNo = flatNo;
    }
    public String getFlatNo(){
        return this.flatNo;
    }
    public void setBuildingNo(String buildingNo){
        this.buildingNo = buildingNo;
    }
    public String getBuildingNo(){
        return this.buildingNo;
    }
    public void setColony(String colony){
        this.colony = colony;
    }
    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((buildingNo == null) ? 0 : buildingNo.hashCode());
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((colony == null) ? 0 : colony.hashCode());
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + ((flatNo == null) ? 0 : flatNo.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((pinCode == null) ? 0 : pinCode.hashCode());
		result = prime * result + ((sate == null) ? 0 : sate.hashCode());
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
		Address other = (Address) obj;
		if (buildingNo == null) {
			if (other.buildingNo != null)
				return false;
		} else if (!buildingNo.equals(other.buildingNo))
			return false;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (colony == null) {
			if (other.colony != null)
				return false;
		} else if (!colony.equals(other.colony))
			return false;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (flatNo == null) {
			if (other.flatNo != null)
				return false;
		} else if (!flatNo.equals(other.flatNo))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (pinCode == null) {
			if (other.pinCode != null)
				return false;
		} else if (!pinCode.equals(other.pinCode))
			return false;
		if (sate == null) {
			if (other.sate != null)
				return false;
		} else if (!sate.equals(other.sate))
			return false;
		return true;
	}
	public String getColony(){
        return this.colony;
    }
    public void setCity(String city){
        this.city = city;
    }
    public String getCity(){
        return this.city;
    }
    public void setSate(String sate){
        this.sate = sate;
    }
    @Override
	public String toString() {
		return "Address [id=" + id + ", flatNo=" + flatNo + ", buildingNo=" + buildingNo + ", colony=" + colony
				+ ", city=" + city + ", sate=" + sate + ", country=" + country + ", pinCode=" + pinCode + "]";
	}
	public String getSate(){
        return this.sate;
    }
    public void setCountry(String country){
        this.country = country;
    }
    public String getCountry(){
        return this.country;
    }
    public void setPinCode(String pinCode){
        this.pinCode = pinCode;
    }
    public String getPinCode(){
        return this.pinCode;
    }
}
