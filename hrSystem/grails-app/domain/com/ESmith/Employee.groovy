package com.ESmith

class Employee {
	String fullName
	String dateOfBirth
	String residence
	double hourlyRate
	String employeeID
	String taxCode
	String contract

	static belongsTo = [Team]
	static hasMany = [teams:Team, tasks:Task]

	String toString(){
		return fullName
	}

    static constraints = {
	fullName blank:false, nullable:false
	dateOfBirth blank:false, nullable:false
	residence blank:false, nullable:false
	hourlyRate blank:false, nullable:false
	employeeID blank:false, nullable:false
	taxCode blank:false, nullable:false
	contract blank:false, nullable:false

	teams blank:true, nullable:true
	tasks blank:true, nullable:true
    }
}
