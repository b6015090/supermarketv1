<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Supermarket</title>
</head>
<body>
    

    <div id="content" role="main">
        <section class="row colset-2-its">
            <h1> Welcome to the Supermarket</h1>
		<div class="row">
<table>
	<tr>
		<th>Department:</th>
		<th>Add:</th>
		<th>View:</td>
	</tr>
	<tr>
		<td>Manager</td>
		<td><button type="button" class"btn btn-success">
			<g:link controller="manager" action="create">Add Manager</g:link>
			</button></td>
		<td><button type="button" class"btn btn-success">
				<g:link controller="manager" action="index">View Managers</g:link>
			</button></td>
	</tr>
	<tr>
		<td>Employee</td>
		<td><button type="button" class"btn btn-success">
				<g:link controller="employee" action="create"> Add Employee</g:link>
			</button></td>
		<td><button type="button" class"btn btn-success">
				<g:link controller="employee" action="index"> View Employees</g:link>
			</button></td>
	</tr>
	<tr>
		<td>Team Leader</td>
		<td><button type="button" class"btn btn-success">
				<g:link controller="teamLeader" action="create">Add Team Leader</g:link>
			</button></td>
		<td><button type="button" class"btn btn-success">
				<g:link controller="teamLeader" action="index">View Team Leader</g:link>
			</button></td>
	</tr>
	<tr>
		<td>Team</td>
		<td><button type="button" class"btn btn-success">
				<g:link controller="team" action="create"> Add Team</g:link>
			</button></td>
		<td><button type="button" class"btn btn-success">
				<g:link controller="team" action="index"> View Teams</g:link>
			</button></td>
	</tr>
	<tr>
		<td>Task</td>
		<td><button type="button" class"btn btn-success">
				<g:link controller="task" action="create"> Add Task</g:link>
			</button></td>
		<td><button type="button" class"btn btn-success">
				<g:link controller="task" action="index"> View Tasks</g:link>
			</button></td>
	</tr>
	<tr>
		<td>Shift</td>
		<td><button type="button" class"btn btn-success">
				<g:link controller="shift" action="create"> Add Shift</g:link>
			</button></td>
		<td><button type="button" class"btn btn-success">
				<g:link controller="shift" action="index"> View Shifts</g:link>
			</button></td>
	</tr>
		
</table>

			
			
				

		</div>
            
        </section>
    </div>

</body>
</html>
