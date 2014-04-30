<div class="header-bottom">
        <div class="wrap">
            <div class="header-bottom-left">
                <div class="logo">
                    <g:link controller="user" action="index"><g:img dir="images" file="logo.jpg" width="250px" /></g:link>
                </div>
                <div class="menu">
                <ul class="megamenu skyblue">
            <li class="active grid"><g:link view = "/" >Home</g:link></li>
            <li><a class="color4" href="#">Cell Phone</a>
                </li>               
                <li><a class="color5" href="#">Motors</a>
                </li>
                <li><g:link controller="Shoes" action="showAllShoes">Shoes</g:link></li>
                <li><g:link controller="Laptop" action="showAll">Laptops</g:link></li>
            </ul>
            </div>
        </div>
       <div class="header-bottom-right">
         <div class="search">     
                <input type="text" name="s" class="textbox" value="Search" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Search';}">
                <input type="submit" value="Subscribe" id="submit" name="submit">
                <div id="response"> </div>
         </div>
      <div class="tag-list">
        <ul class="icon1 sub-icon1 profile_img">
            <li><a class="active-icon c2" href="#"> </a>
                <ul class="sub-icon1 list">
                    <li><h3>CheckOut</h3><a href=""></a></li>
                </ul>
            </li>
        </ul>
        <ul class="last"><li>
      <g:if test="${session?.user}">
                    <g:link controller="user" action="MyCart">Cart(${session?.user.counter}))</g:link>
                    </g:if>
                    <g:else>
                    <a href="">Cart(0)</a>
                    </g:else> 
                    </li>
                    </ul>
      </div>
    </div>
     <div class="clear"></div>
     </div>
    </div>