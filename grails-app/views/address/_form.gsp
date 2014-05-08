<%@ page import="commercetrial.Address" %>



<div class="fieldcontain ${hasErrors(bean: addressInstance, field: 'apartment', 'error')} ">
	<label for="apartment">
		<g:message code="address.apartment.label" default="Apartment" />
		
	</label>
	<g:textField name="apartment" value="${addressInstance?.apartment}" />

</div>

<div class="fieldcontain ${hasErrors(bean: addressInstance, field: 'city', 'error')} ">
	<label for="city">
		<g:message code="address.city.label" default="City" />
		
	</label>
	<g:textField name="city" value="${addressInstance?.city}" />

</div>

<div class="fieldcontain ${hasErrors(bean: addressInstance, field: 'country', 'error')} ">
	<label for="country">
		<g:message code="address.country.label" default="Country" />
		
	</label>
	<g:textField name="country" value="${addressInstance?.country}" />

</div>

<div class="fieldcontain ${hasErrors(bean: addressInstance, field: 'pinCode', 'error')} ">
	<label for="pinCode">
		<g:message code="address.pinCode.label" default="Pin Code" />
		
	</label>
	<g:textField name="pinCode" value="${addressInstance?.pinCode}" />

</div>

<div class="fieldcontain ${hasErrors(bean: addressInstance, field: 'state', 'error')} ">
	<label for="state">
		<g:message code="address.state.label" default="State" />
		
	</label>
	<g:textField name="state" value="${addressInstance?.state}" />

</div>

<div class="fieldcontain ${hasErrors(bean: addressInstance, field: 'street', 'error')} ">
	<label for="street">
		<g:message code="address.street.label" default="Street" />
		
	</label>
	<g:textField name="street" value="${addressInstance?.street}" />

</div>

<div class="fieldcontain ${hasErrors(bean: addressInstance, field: 'user_id', 'error')} ">
	<label for="user_id">
		<g:message code="address.user_id.label" default="Userid" />
		
	</label>
	<g:select id="user_id" name="user_id.id" from="${commercetrial.User.list()}" optionKey="id" required="" value="${addressInstance?.user_id?.id}" class="many-to-one"/>

</div>

