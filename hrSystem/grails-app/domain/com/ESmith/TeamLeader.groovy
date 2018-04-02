package com.ESmith

class TeamLeader {

	String fullName
	String departmentName
	String employeeID
	String sectionName
	int officePhone
	String leaderEmail
	String password

    static constraints = {
	fullName blank:false, nullable:false,
	department blank:false, nullable:false,
	employeeID blank:false, nullable:false,
	sectionName blank:false, nullable:false,
	officePhone blank:false, nullable:false,
	leaderEmail blank:false, nullable:false,
	password blank:false, nullable:false
    }
}
