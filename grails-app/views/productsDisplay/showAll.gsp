<html>
<head>
<title>Laptop Junction</title>
<meta name ="layout" content = "main"/>

<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel = "stylesheet" type="text/css" href="${createLinkTo(dir:'css',file:'laptopShowAll.css')}" />
<link rel = "stylesheet" type="text/css" href="${createLinkTo(dir:'css',file:'styleDelete.css')}" />


</head>

<body>



<g:each in="${products}" var="item">

<div class="col_1_of_3 span_1_of_3"> 
    <g:form >
               <g:link action="details" id="${item.id}" >
                <div class="inner_content clearfix">
                    <div class="product_image">
                        <g:img dir="images" file="${item.image}" width="270" height="200"/>
                    </div>
                      
                    <div class="price">
                       <div class="cart-left">
                            <g:link class="title" controller="laptop" action="details" id="${item.id}" >${item.title}</g:link>
                            <div class="price1">
                              <span class="actual" >$ ${item.price}</span>
                            </div>
                        </div>
                                                <g:link controller="userAction" format="${item.price}" action="addToCart" id="${item.id}" ><div class="cart-right"> </div></g:link>
                        <div class="clear"></div>
                        
                     </div>             
                   </div>
                 </g:link>
                 </g:form>
                </div>
 </g:each>
  
    
  
</body>
</html>
