package com.ESmith

class BootStrap {

    def init = { servletContext ->	

	def manager1 = new
	Manager(
		fullName:'Joanne K Rowling',
		username:'jkRowling',
		password:'chamberOfSecrets',
		managerEmail:'jkRowling@email.com',
		office:'R101',
		department:'Electronics'
	).save()
	def manager2 = new
	Manager(
		fullName:'Cassandra Clare',
		username:'cClare',
		password:'password101',
		managerEmail:'cClare@email.com',
		office:'R102',
		department:'Stationary'
	).save()	

	def teamLeader1 = new
	TeamLeader(
		fullName:'Hannah Baker',
		departmentName:'Entertainment',
		employeeID:'EHP13W1',
		sectionName:'Movies',
		officePhone: 1977123456,
		leaderEmail: 'hannahbaker123@email.com',
		password: 'password123'
	).save()
	def teamLeader2 = new
	TeamLeader(
		fullName: 'Clay Jenson',
		departmentName: 'Grocery',
		employeeID:'EHP13W2',
		sectionName:'Frozen Food',
		officePhone:1977234567,
		leaderEmail:'clayjenson123@email.com',
		password: 'password123'
	).save()

	def employee1 = new
	Employee(
		fullName:'Harry Potter',
		dateOfBirth: '31/07/1981',
		residence: 'Godricks Hollow',
		hourlyRate: 7.50,
		employeeID: 'EHP123',
		dateEmployed: '05/05/2017',
		taxCode: 'TC123',
		contract: 'full-time'
	).save()
	def employee2 = new
	Employee(
		fullName:'Ron Weasley',
		dateOfBirth: '30/03/1981',
		residence: 'The Burrow',
		hourlyRate: 7.50,
		employeeID: 'EHP456',
		dateEmployed: '05/05/2017',
		taxCode: 'TC456',
		contract: 'full-time'
	).save()

	def team1 = new
	Team(
		teamName:'Team Checkout',
		numberOfEmployees:20,
		sectionName:'Checkout',
		description:'Employees trained to use the checkouts correctly'

	).save()
	def team2 = new
	Team(
		teamName:'Team Trolley',
		numberOfEmployees:8,
		sectionName:'Carpark',
		description:'Employees available to collect rouge trollies'

	).save()

	def task1 = new
	Task(
		taskName:'Merchandising',
		numberOfPeople:5,
		sectionName:'Entertainment',
		department: 'Electronics',
		timeRequired:'2 Hours',
		description: 'Add new stock to the display and scan for discounted items',
		taskCompleted:'false'
	).save()
	def task2 = new
	Task(
		taskName:'Merchandising',
		numberOfPeople:5,
		sectionName:'Ready Meals',
		department: 'Frozen',
		timeRequired:'4 Hours',
		description: 'Add new stock to the display and scan for discounted items',
		taskCompleted:'true'
	).save()

	def shift1 = new
	Shift(
		timeOfDay:'Morning',
		dayOfWeek:'Monday',
		numberOfHours:8,
		startingTime:'13:00'
	).save()
	def shift2 = new
	Shift(
		timeOfDay:'Afternoon',
		dayOfWeek:'Tuesday',
		numberOfHours:8,
		startingTime:'06:00'
	).save()
    }
    def destroy = {
    }
}
