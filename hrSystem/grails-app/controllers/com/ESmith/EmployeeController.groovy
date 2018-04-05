package com.ESmith

class EmployeeController {

    def scaffold= Employee

def search(){
}

def results(String name){
	def employee=Employee.where{
		fullName=~fullName
	}.list()
return[emplpoyees:employees,
	term:params.fullName,
	totalemployees: Employee.count()]

}
}
