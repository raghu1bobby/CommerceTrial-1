<html>
<head>

<meta name = "layout" content = "main" />
<style>
table
{
border-collapse:collapse;
}
table, td, th
{
border:1px solid black;
}
</style>
</head>


<body>

<table border="1">
    <g:each in="${products}" var="item" status ="i" >
    <g:each in = "${item.extra}" var = "ex">
   
<tr><th>${ex.name} </th><td>  ${ex.value }</tr>
   
   </g:each>
    </g:each>
</table>


</body>

</html>