<%@ page import="commercetrial.User" %>



<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'confirm_password', 'error')} ">
	<label for="confirm_password">
		<g:message code="user.confirm_password.label" default="Confirmpassword" />
		
	</label>
	<g:textField name="confirm_password" value="${userInstance?.confirm_password}" />

</div>

<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'counter', 'error')} ">
	<label for="counter">
		<g:message code="user.counter.label" default="Counter" />
		
	</label>
	<g:field type="number" name="counter" value="${userInstance.counter}" />

</div>

<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'email', 'error')} ">
	<label for="email">
		<g:message code="user.email.label" default="Email" />
		
	</label>
	<g:textField name="email" value="${userInstance?.email}" />

</div>

<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'mobile', 'error')} ">
	<label for="mobile">
		<g:message code="user.mobile.label" default="Mobile" />
		
	</label>
	<g:textField name="mobile" value="${userInstance?.mobile}" />

</div>

<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'password', 'error')} ">
	<label for="password">
		<g:message code="user.password.label" default="Password" />
		
	</label>
	<g:textField name="password" value="${userInstance?.password}" />

</div>

<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'username', 'error')} ">
	<label for="username">
		<g:message code="user.username.label" default="Username" />
		
	</label>
	<g:textField name="username" value="${userInstance?.username}" />

</div>

