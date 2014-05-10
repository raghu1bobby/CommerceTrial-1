<html>
<head>
<title>HoochiPoochi</title>
<meta name ="layout" content = "client_main"/>

</head>

<body>



<g:each in="${products}" var="item">

<div class="col_1_of_3 span_1_of_3"> 
    <g:form >
               <g:link action="details" id="${item.id}" >
                <div class="inner_content clearfix">
                    <div class="product_image">
                    <g:hiddenField name='name' value = "${item.productName }"/>
                 
                        <g:img dir="images" file="${item.image}" name = "image" width="270" height="200"/>
                    </div>
                      
                                          <div class="price">
                       <div class="cart-left">
                            <g:link class="title" action="details" id="${item.id}" >${item.title}</g:link>
                            <div class="price1">
                              <span class="actual" >$ ${item.price}</span>
                            </div>
                        </div>
                         <g:hiddenField name='name' value = "${item.price}"/>
                                                <g:link controller="userAction" format="${item.price}" action="addToCart" id="${item.id}" params="[categoryName: params.categoryName]" ><div class="cart-right"> </div></g:link>
                        <div class="clear"></div>
                        
                     </div>             
                   </div>
                 </g:link>
                 </g:form>
                </div>
 </g:each>
  
    <div class="clear"></div>
  
</body>

<div class="clear"></div>
</html>
