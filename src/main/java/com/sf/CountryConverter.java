package com.sf;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter(value = "CountryConverter")
public class CountryConverter implements Converter {

	public Object getAsObject(FacesContext arg0, UIComponent arg1, String arg2) {
		AutoCompleteMBean autoCompleteMBean = new AutoCompleteMBean();
		for (Country country : autoCompleteMBean.getCountries()) {
			if (String.valueOf(country.getId()).equalsIgnoreCase(arg2)) {
				return country;
			}
		}
		return null;
	}

	public String getAsString(FacesContext arg0, UIComponent arg1, Object arg2) {
		// TODO Auto-generated method stub
		if (arg2 == null)return null;;
		if( !(arg2 instanceof Country))
			return arg2.toString();
		return String.valueOf(((Country) arg2).getId());
	}
}
