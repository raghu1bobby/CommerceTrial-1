<!DOCTYPE html>
<!--[if lt IE 7 ]> <html lang="en" class="no-js ie6"> <![endif]-->
<!--[if IE 7 ]>    <html lang="en" class="no-js ie7"> <![endif]-->
<!--[if IE 8 ]>    <html lang="en" class="no-js ie8"> <![endif]-->
<!--[if IE 9 ]>    <html lang="en" class="no-js ie9"> <![endif]-->
<!--[if (gt IE 9)|!(IE)]><!--> <html lang="en" class="no-js"><!--<![endif]-->
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
		<title><g:layoutTitle default="Grails"/></title>
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<link rel="shortcut icon" href="${resource(dir: 'images', file: 'favicon.ico')}" type="image/x-icon">
		<link rel="apple-touch-icon" href="${resource(dir: 'images', file: 'apple-touch-icon.png')}">
		<link rel="apple-touch-icon" sizes="114x114" href="${resource(dir: 'images', file: 'apple-touch-icon-retina.png')}">
		<link rel="stylesheet" href="${resource(dir: 'css', file: 'main.css')}" type="text/css">
		<link rel="stylesheet" href="${resource(dir: 'css', file: 'mobile.css')}" type="text/css">
		<title><g:layoutTitle default = "Cloud Commerce" /> </title>
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel = "stylesheet" type="text/css" href="${createLinkTo(dir:'css',file:'style.css')}" />
<link rel = "stylesheet" type="text/css" href="${createLinkTo(dir:'css',file:'form.css')}" />
<link rel = "stylesheet" type="text/css" href="${createLinkTo(dir:'css',file:'megamenu.css')}" />

<link href='http://fonts.googleapis.com/css?family=Exo+2' rel='stylesheet' type='text/css'>

<g:javascript src = "jquery1.min.js"></g:javascript>
<!-- start menu -->
<g:javascript src = "megamenu.js"></g:javascript>

<script>
$(document).ready(function(){$(".megamenu").megamenu();});
</script>


<!--start slider -->
<link rel = "stylesheet" type="text/css" href="${createLinkTo(dir:'css',file:'fwslider.css')}" />
<g:javascript src = "jquery-ui.min.js"></g:javascript>
 <g:javascript src = "css3-mediaqueries.js"></g:javascript>
<g:javascript src = "fwslider.js"></g:javascript>    
<!--end slider -->
<g:javascript src = "jquery.easydropdown.js"></g:javascript>

		
		<g:layoutHead/>
		<g:javascript library="application"/>		
		<r:layoutResources />
	</head>
	<body>
	<g:render template="templates/headerTop" contextPath = "/"></g:render>
		<g:layoutBody/>
		<g:render template="templates/footer" contextPath = "/"></g:render>
		<r:layoutResources />
	</body>
</html>
