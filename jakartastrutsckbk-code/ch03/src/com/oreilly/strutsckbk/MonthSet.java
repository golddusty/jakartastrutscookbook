package com.oreilly.strutsckbk;

public class MonthSet {
	
	static Month[] months = new Month[] {
			new Month("January", "Jan"),
			new Month("February", "Feb"), 
			new Month("March", "Mar"),
			new Month("April", "Apr"),
			new Month("May", "May"),
			new Month("June", "Jun"),
			new Month("July", "Jul"),
			new Month("August", "Aug"),
			new Month("September", "Sept"), 
			new Month("October", "Oct"),
			new Month("November", "Nov"), 
			new Month("December", "Dec")
	};
	
	public Month getMonth(int index) {
		return months[index];
	}
	
	public void setMonth(int index, Month month) {
		months[index] = month;
	}

	public Month[] getMonths() {
		return months;
	}
}
