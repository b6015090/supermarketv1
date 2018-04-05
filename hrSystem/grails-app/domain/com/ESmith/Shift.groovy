package com.ESmith

class Shift {
	String timeOfDay
	String dayOfWeek
	int numberOfHours
	String startingTime
	
	static belongsTo = [Task,Team]
	static hasMany = [teams:Team, tasks:Task, employees:Employee]

	String toString(){
		return timeOfDay
	}


    static constraints = {
	timeOfDay blank:false, nullable:false
	dayOfWeek blank:false, nullable:false
	numberOfHours blank:false, nullable:false
	startingTime blank:false, nullable:false

	teams blank:true, nullable:true
	tasks blank:true, nullable:true
    }
}
