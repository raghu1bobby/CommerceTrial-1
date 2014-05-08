<!--A Design by W3layouts
Author: W3layout
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!DOCTYPE HTML>
<html>
<head>

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

</head>

<body>
<g:render template = "templates/headerTop" contextPath = "/"></g:render>
<g:render template = "templates/menuHeader" contextPath = "/"></g:render>
<g:layoutBody/>


<g:render template = "templates/footer" contextPath = "/"></g:render>
</body>


</html>