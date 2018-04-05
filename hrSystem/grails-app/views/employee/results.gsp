<!doctype html>
<html>
<head>
	<meta name="layout" content="main"/>
	<title>Welcome to supermarket search</title>

	<asset:link rel="icon" href="favicon.ico" type="image/x-ico" />
</head>
<body>
<div class="row">
	<h1>Supermarket</h1>
	<h3>Search Results</h3>
	<p>
		Searched ${totalEmployees} records
		for items matching <em>${term}</em>.
		Found <strong${employees.size()}</strong> Employees.
	</p>
	<ul>
		<g:each var="employee" in="${Employees}">
		<li><g:link controller="employee" action"show"
		id="${employee.employeeID}">${employee.fullName}</g:link></li>
	</g:each>
	</ul>
	<button type="button" class="btn btn-success">
		<g:link action='search'>Search again</g:link>
	</button>
</div>
</body>
</html>
