<%@ page import="commercetrial.Extras" %>



<div class="fieldcontain ${hasErrors(bean: extrasInstance, field: 'name', 'error')} ">
	<label for="name">
		<g:message code="extras.name.label" default="Name" />
		
	</label>
	<g:textField name="name" value="${extrasInstance?.name}" />

</div>

<div class="fieldcontain ${hasErrors(bean: extrasInstance, field: 'value', 'error')} ">
	<label for="value">
		<g:message code="extras.value.label" default="Value" />
		
	</label>
	<g:textField name="value" value="${extrasInstance?.value}" />

</div>

