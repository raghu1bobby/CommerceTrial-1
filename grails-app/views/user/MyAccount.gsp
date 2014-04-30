<html>

<head>

<meta name = "layout" content = "main">

</head>
<body>
 <div class="tag-list">
        
        <ul class="last"><li><a href="#">Cart(${session?.user.counter})</a></li></ul>
      </div>
    
     <div class="clear"></div>
    
<h4 class="title">My Address</h4>

    <table border="1">      
 
    <fieldset class="input">
                            <p id="register_ccnumber">
                              <label for="ship_username">Name : ${address.name }</label>
                             
                            </p>
                            <p id="register_CVV">
                              <label for="modlgn_passwd">Street : ${address.street }</label>
                              
                            </p>
                            <p id="register_confirm">
                              <label for="modlgn_fullname">City : ${address.city }</label>
                           
                            </p>
                           <p id="register_confirm">
                              <label for="modlgn_fullname">State : ${address.state }</label>
                            
                            </p>
                          </fieldset>
    </table>

  
             <h4 class="title">My Previous Orders</h4>
   
    <table border="1">      
    <g:each in="${previouscart}" var="item">   
    <tr><th><g:img dir="images/laptop" file="${item.Image}" width="270" height="200"/>
                    
    <th><g:link class="title" controller="laptop" action="details" id="${item.id}" >${item.Title}</g:link>
                <br>        $ ${item.Price}
            <div class="clear"></div>       
        </th></tr>  
    </g:each>
    </table>     
    

    


</body>


</html>