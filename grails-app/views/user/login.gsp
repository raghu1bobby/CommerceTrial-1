
<html>
<head>
<meta name= 'layout' content = 'main'/>
</head>


<body>
 <div class="col_1_of_login span_1_of_login">
                <div class="login-title">
                    <h4 class="title">Registered Customers</h4>
                    <div id="loginbox" class="loginbox">
                        
                        <g:form >
                          <fieldset class="xinput">
                            <p id="login-form-username">
                              <label >User Name</label>
                              <g:textField  type="text" name="username" class="inputbox" size="18" autocomplete="off" />
                              
                            </p>
                            <p id="login-form-password">
                              <label >Password</label>
                              <g:passwordField name="password" class="inputbox" size="18" autocomplete="off" />
                            </p>
                            <div class="remember">
                                <p id="login-form-remember">
                                  <label for="modlgn_remember"><a href="#">Forget Your Password ? </a></label>
                               </p>
                               
                               <g:actionSubmit value = "Submit"/><div class="clear"></div>
                             </div>
                          </fieldset>
                         </g:form>
                    </div>
                </div>
                </div>
                <div class="clear"></div>
          
  

</body>

</html>
