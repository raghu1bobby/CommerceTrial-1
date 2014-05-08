<html>
<head>

<meta name='layout' content='main'>
</head>
<body>

	<div class="login">

		<div class="col_1_of_login span_1_of_login">
			<div class="login-title">
				<h4 class="title">Customer Registration Form</h4>
				<g:hasErrors bean = "${user}" >
                          <g:renderErrors bean="${user}"  />
                    </g:hasErrors>
				<div id="loginbox" class="loginbox">
					<g:form>
						<fieldset class="input">
							<p id="register_username">
								<label for="modlgn_username">User name</label>
								<g:textField type="text" name="username" class="inputbox"
									size="18" width="15px" autocomplete="off" />
									
  
							</p>
							<p id="register_password">
								<label for="modlgn_passwd">Password</label>
								<g:passwordField name="password" class="inputbox" size="18"
									autocomplete="off" />
							</p>
							<p id="register_confirm">
								<label for="modlgn_passwd">Re-type Password</label>
								<g:passwordField name="confirm" class="inputbox" size="18"
									autocomplete="off" />
							</p>
							<p id="register_email">
								<label for="modlgn_passwd">Email</label>
								<g:textField type="email" name="email" class="inputbox"
									size="18" autocomplete="off" />
							</p>
							<div class="remember">

								<g:actionSubmit action="register" value="Sign Up Now!" />
							</div>
						</fieldset>
					</g:form>
					
				</div>
			</div>
		</div>
		<div class="clear"></div>
	</div>


</body>
</html>