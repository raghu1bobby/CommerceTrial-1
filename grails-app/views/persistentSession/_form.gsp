<%@ page import="grails.plugin.databasesession.PersistentSession" %>



<div class="fieldcontain ${hasErrors(bean: persistentSessionInstance, field: 'creationTime', 'error')} ">
	<label for="creationTime">
		<g:message code="persistentSession.creationTime.label" default="Creation Time" />
		
	</label>
	<g:field type="number" name="creationTime" value="${persistentSessionInstance.creationTime}" />

</div>

<div class="fieldcontain ${hasErrors(bean: persistentSessionInstance, field: 'invalidated', 'error')} ">
	<label for="invalidated">
		<g:message code="persistentSession.invalidated.label" default="Invalidated" />
		
	</label>
	<g:checkBox name="invalidated" value="${persistentSessionInstance?.invalidated}" />

</div>

<div class="fieldcontain ${hasErrors(bean: persistentSessionInstance, field: 'lastAccessedTime', 'error')} ">
	<label for="lastAccessedTime">
		<g:message code="persistentSession.lastAccessedTime.label" default="Last Accessed Time" />
		
	</label>
	<g:field type="number" name="lastAccessedTime" value="${persistentSessionInstance.lastAccessedTime}" />

</div>

<div class="fieldcontain ${hasErrors(bean: persistentSessionInstance, field: 'maxInactiveInterval', 'error')} ">
	<label for="maxInactiveInterval">
		<g:message code="persistentSession.maxInactiveInterval.label" default="Max Inactive Interval" />
		
	</label>
	<g:field type="number" name="maxInactiveInterval" value="${persistentSessionInstance.maxInactiveInterval}" />

</div>

