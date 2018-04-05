package com.ESmith

class Team {
	String teamName
	int numberOfEmployees
	String sectionName
	String description

	TeamLeader teamleader
	static hasMany = [employees:Employee, shifts:Shift, tasks:Task]

	String toString(){
	return teamName
	}


    static constraints = {
	teamName blank:false, nullable:false
	numberOfEmployees blank:false, nullable:false
	sectionName blank:false, nullable:false
	description blank:false, nullable:false

	teamleader blank:true, nullable:true
	employees blank:true, nullable:true
	shifts blank:true, nullable:true
	tasks blank:true, nullable:true
    }
}
