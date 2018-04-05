<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Supermarket Homepage</title>
</head>
<body>
    

    <div id="content" role="main">
	<div class ="row">
		<div class="first">
			<h3>Courses Management</h3>
			<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam memini etiam quae nolo, oblivisci non possum quae volo. Haec igitur Epicuri non probo, inquam. Quis est autem dignus nomine hominis, qui unum diem totum velit esse in genere isto voluptatis? Egone quaeris, inquit, quid sentiam? Duo Reges: constructio interrete. Simus igitur contenti his. Quid est igitur, inquit, quod requiras? Non pugnem cum homine, cur tantum habeat in natura boni; Qui autem voluptate vitam effici beatam putabit, qui sibi is conveniet, si negabit voluptatem crescere longinquitate? Nam aliquando posse recte fieri dicunt nulla expectata nec quaesita voluptate.</p>


		
			<button type="button" class"btn btn-success">
			<g:link controller="manager" action="create">Add Manager</g:link>
			</button>
			<button type="button" class"btn btn-success">
				<g:link controller="employee" action="create"> Employee</g:link>
			</button>
			
			<button type="button" class"btn btn-success">
				<g:link controller="teamLeader" action="create"> Team Leader</g:link>
			</button>
			<button type="button" class"btn btn-success">
				<g:link controller="team" action="create"> Team</g:link>
			</button>
			<button type="button" class"btn btn-success">
				<g:link controller="task" action="create"> Task</g:link>
			</button>
			<button type="button" class"btn btn-success">
				<g:link controller="shift" action="create"> Shift</g:link>
			</button>
	</div>
    </div>

</body>
</html>
