package com.sf;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@RequestScoped
@ManagedBean(name="autoCompleteSimpleMBean")
public class AutoCompleteSimpleMBean {

	List<String> countries;
	String selectedCountry;
	
	
	
	public AutoCompleteSimpleMBean() {
		super();
		init();
	}

	public void init(){
		countries=new ArrayList<String>();		
		countries.add("Greece");
		countries.add("France");
		countries.add("Austria");
		countries.add("Belgium");
		countries.add("Bulgaria");
		countries.add("Croatia");
		countries.add("Cyprus");
		countries.add("Croatia");
		countries.add("Czech Republic");
		countries.add("Denmark");
		countries.add("Estonia");
		countries.add("Finland");
		countries.add("Germany");
		countries.add("Hungary");
		countries.add("Italy");
		countries.add("Ireland");
		countries.add("Latvia");
		countries.add("Luxembourg");
		countries.add("Lithuania");
		countries.add("Malta");
		countries.add("Netherlands");
		countries.add("Poland");
		countries.add("Portugal");
		countries.add("Romania");
		countries.add("Slovakia");
		countries.add("Slovenia");
		countries.add("Spain");
		countries.add("Sweden");
		countries.add("United Kingdom");
	}

	public List<String> query(String query){
		List<String> result=new LinkedList<String>();
		if(query==null||"".equalsIgnoreCase(query))return result;
		for(String country:countries){
			if(country.toLowerCase().contains(query.toLowerCase())){
				result.add(country);
			}
		}
		return result;
	}

	public List<String> getCountries() {
		return countries;
	}

	public void setCountries(List<String> countries) {
		this.countries = countries;
	}

	public String getSelectedCountry() {
		return selectedCountry;
	}

	public void setSelectedCountry(String selectedCountry) {
		this.selectedCountry = selectedCountry;
	}		
}

