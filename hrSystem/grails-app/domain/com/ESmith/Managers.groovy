package com.ESmith

class Managersa {
	String fullName
	String username
	String password
	String managerEmail
	String office
	String department

    static constraints = {
	fullName blank:false, nullable:false
	username blank:false, nullable:false
	password blank:false, nullable:false
	managerEmail blank:false, nullable:false
	office blank:false, nullable:false
	department blank:false, nullable:false
    }
}
