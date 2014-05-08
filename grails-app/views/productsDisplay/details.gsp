<html>
<head>

<meta name = "layout" content = "client_main" />
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
   <g:img dir="images" file="${item.image}" width="200" height="200"/>
   <h1> ${item.productName }</h1>
    <h2>${item.title}</h2>
    <h3>${item.price }</h3>
    <p>${item.description }</p>
    
    <g:each in = "${item.extra}" var = "ex">

   <div>${ex.name}: ${ex.value }</div>
   
   </g:each>
    </g:each>
</table>


</body>

</html>