package com.sf;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@RequestScoped
@ManagedBean(name = "autoCompleteMBean")
public class AutoCompleteMBean {
	List<Country> countries;
	Country selectedCountry;

	public AutoCompleteMBean() {
		super();
		init();
	}

	public void init() {
		countries = new ArrayList<Country>();
		countries.add(new Country(0, "Greece", "Europe"));
		countries.add(new Country(2, "France", "Europe"));
		countries.add(new Country(3, "Austria", "Europe"));
		countries.add(new Country(4, "Belgium", "Europe"));
		countries.add(new Country(5, "Bulgaria", "Europe"));
		countries.add(new Country(6, "Croatia", "Europe"));
		countries.add(new Country(7, "Cyprus", "Europe"));
		countries.add(new Country(8, "Croatia", "Europe"));
		countries.add(new Country(9, "Czech Republic", "Europe"));
		countries.add(new Country(10, "Denmark", "Europe"));
		countries.add(new Country(11, "Estonia", "Europe"));
		countries.add(new Country(12, "Finland", "Europe"));
		countries.add(new Country(13, "Germany", "Europe"));
		countries.add(new Country(14, "Hungary", "Europe"));
		countries.add(new Country(15, "Italy", "Europe"));
		countries.add(new Country(16, "Ireland", "Europe"));
		countries.add(new Country(17, "Latvia", "Europe"));
		countries.add(new Country(18, "Luxembourg", "Europe"));
		countries.add(new Country(19, "Lithuania", "Europe"));
		countries.add(new Country(20, "Malta", "Europe"));
		countries.add(new Country(21, "Netherlands", "Europe"));
		countries.add(new Country(22, "Poland", "Europe"));
		countries.add(new Country(23, "Portugal", "Europe"));
		countries.add(new Country(24, "Romania", "Europe"));
		countries.add(new Country(25, "Slovakia", "Europe"));
		countries.add(new Country(26, "Slovenia", "Europe"));
		countries.add(new Country(27, "Spain", "Europe"));
		countries.add(new Country(28, "Sweden", "Europe"));
		countries.add(new Country(29, "United Kingdom", "Europe"));
	}

	public List<Country> query(String query) {
		List<Country> result = new LinkedList<Country>();
		if (query == null || "".equalsIgnoreCase(query))
			return result;
		for (Country country : countries) {
			if (country.getName().toLowerCase().contains(query.toLowerCase())) {
				result.add(country);
			}
		}
		return result;
	}

	public List<Country> getCountries() {
		return countries;
	}

	public void setCountries(List<Country> countries) {
		this.countries = countries;
	}

	public Country getSelectedCountry() {
		return selectedCountry;
	}

	public void setSelectedCountry(Country selectedCountry) {
		this.selectedCountry = selectedCountry;
	}

}
