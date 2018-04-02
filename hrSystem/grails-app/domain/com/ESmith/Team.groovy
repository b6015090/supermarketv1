package com.ESmith

class Teams {
	String teamName
	int numberOfEmployees
	String sectionName
	String description

    static constraints = {
	teamName blank:false, nullable:false
	numberofEmployees blank:false, nullable:false
	sectionName blank:false, nullable:false
	description blank:false, nullable:false
    }
}
