 <div class="header-top">
       <div class="wrap"> 
              <div class="header-top-left">
                   
                    
                    <div class="clear"></div>
             </div>
             <div class="cssmenu">
                <ul>
                    <li class="active"><a href="#">My Account</a></li> 
                    
                    <g:if test="${session?.user}">
                   Hi, ${session?.user.username}
                    <li><g:link controller="userAction" action="logout">logout</g:link></li>
                    </g:if>
                    <g:else>
                     <g:link controller="userAction" action="login" params = "[previousUri: (request.forwardURI - request.contextPath) ]">Login</g:link>
                     <g:link controller="userAction" action="register">Sign up now!</g:link>
                    </g:else>
                </ul>
            </div>
            <div class="clear"></div>
        </div>
    </div>