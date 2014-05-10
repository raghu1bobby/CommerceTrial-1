<html>

<head>

<meta name = "layout" content = "client_main">

</head>
<body>
 <div class="tag-list">
        
        <ul class="last"><li><a href="#">Cart(${session?.user.counter})</a></li></ul>
      </div>
    
     <div class="clear"></div>
    
   
    <table border="1">      
    <g:each in="${cart}" var="item">   
    <tr><th><g:img dir="images" file="${item.image}" width="270" height="200"/>
                    
    <th><g:link class="title" controller="laptop" action="details" id="${item.id}" >${item.title}</g:link>
                <br>        $ ${item.price}
            <div class="clear"></div>       
        </th></tr>  
    </g:each>
    </table>     
    

    


</body>


</html>