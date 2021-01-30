package model;

public class Alldattesformat {

	private String datesimple ; 
	private String datewithmonthdisabled ; 
	private String datepickerallchangeandtwomonth;
	private String datepickermax;
	
	public Alldattesformat() {}


	public Alldattesformat(String datesimple, String datewithmonthdisabled , String datepickerallchangeandtwomonth
			,String datepickermax) {
		this.datesimple = datesimple;
		this.datewithmonthdisabled = datewithmonthdisabled;
		this.datepickerallchangeandtwomonth = datepickerallchangeandtwomonth;
		this.datepickermax = datepickermax;
	}
	


	public String getDatepickermax() {
		return datepickermax;
	}


	public void setDatepickermax(String datepickermax) {
		this.datepickermax = datepickermax;
	}


	public String getDatepickerallchangeandtwomonth() {
		return datepickerallchangeandtwomonth;
	}


	public void setDatepickerallchangeandtwomonth(String datepickerallchangeandtwomonth) {
		this.datepickerallchangeandtwomonth = datepickerallchangeandtwomonth;
	}


	public String getDatesimple() {
		return datesimple;
	}


	public void setDatesimple(String datesimple) {
		this.datesimple = datesimple;
	}


	public String getDatewithmonthdisabled() {
		return datewithmonthdisabled;
	}


	public void setDatewithmonthdisabled(String datewithmonthdisabled) {
		this.datewithmonthdisabled = datewithmonthdisabled;
	};
	
	
	
	
	
	
	
	
}
