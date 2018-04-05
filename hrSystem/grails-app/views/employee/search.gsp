<!doctype html>
<html>
<head>
	<meta name="layout" content="main"/>
	<title> Search. Welcome to the Supermarket</title>


	<asset: link rel="icon" href="favicon.ico" type=image/x-ico" />
</head>
<body>
	<div class="row">
		<h1>Supermarket</h1>
		<formset>
			<legend>Search for something simple</legend>
			<g:form action="results">
			<label for="name">Student Name</label>
				<g:textField name="name"/>
				<g:submitButton name="search" value="Search"/>
				</g:form>
		</formset>
	</div>
</body>
</html>
