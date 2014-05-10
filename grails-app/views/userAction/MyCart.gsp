<html>
<head>
<meta name = 'layout' content = 'client_main'/>

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
  
         
             <h4 class="title">Shopping cart</h4>
        <g:set var="total" value="${0l}" />     
<g:form url="[controller:'userAction',action:'MyAccount']">
    <table border="1">      
            <g:each in="${cart}" var="item">
                

               
    <tr><th><g:img dir="images" file="${item.image}" width="270" height="200"/>
                    
    <th><g:link class="title" controller="laptop" action="details" id="${item.id}" >${item.Title}</g:link>
                <br>        $ ${item.price}
    <g:set var="total" value="${total+item.price}" />
                        <div class="clear"></div>       
     <g:link value="Remove" id="${item.id}" controller="userAction" action="removeFromCart">Remove</g:link>
        </th></tr>  
    </g:each>
    </table>        
            
    <h4 class="title"> TOTAL $  ${total } : Click<g:link controller="userAction" action="checkout" id="${total}"> here</g:link> to Check Out<br></h4>     
            
 
 <h4 class="title"> Shipping details </h4>
                          <fieldset class="input">
                            <p id="register_ccnumber">
                              <label for="ship_username">Name</label>
                              <g:textField  type="text" name="shipName"  size="18" width="15px" />
                            </p>
                            <p id="register_CVV">
                              <label for="modlgn_passwd">Street</label>
                              <g:textField  name="street"  size="18" autocomplete="on"/>
                            </p>
                            <p id="register_confirm">
                              <label for="modlgn_fullname">City</label>
                              <g:textField  name="city"  size="18" autocomplete="on"/>
                            </p>
                           <p id="register_confirm">
                              <label for="modlgn_fullname">State</label>
                              <g:textField  name="state"  size="18" autocomplete="on"/>
                            </p>
                          </fieldset>
 <br>
           
    <h4 class="title"> Payment details </h4>
                          <fieldset class="input">
                            <p id="register_ccnumber">
                              <label for="modlgn_username">Credit Card Number</label>
                              <g:textField  type="text" name="ccnumber"  size="18" width="15px" />
                            </p>
                            <p id="register_CVV">
                              <label for="modlgn_passwd">CVV</label>
                              <g:textField  name="CVV"  size="18" autocomplete="on"/>
                            </p>
                            <p id="register_confirm">
                              <label for="modlgn_fullname">Full Name</label>
                              <g:textField  name="fullname"  size="18" autocomplete="on"/>
                            </p>
                            <p id="register_email">
                              <label for="modlgn_passwd">Total : ${total }</label>
                            </p>
                            <g:submitButton value="Submit Payment" name="submitButton"/>
                         
                          </fieldset>
</g:form>
    
    
    
    
    
</body>
</html>