package com.ESmith

class Manager {
	String fullName
	String username
	String password
	String managerEmail
	String office
	String department

	static hasMany = [employees:Employee, teamleaders:TeamLeader]

	String toString(){
		return fullName
	}

    static constraints = {
	fullName blank:false, nullable:false
	username blank:false, nullable:false
	password blank:false, nullable:false
	managerEmail blank:false, nullable:false
	office blank:false, nullable:false
	department blank:false, nullable:false

	employees blank:true, nullable:true
	teamleaders blank:true, nullable:true
    }
}
