<%@ page import="com.monochromeroad.grails.plugins.mongodbsession.MongoPersistentSession" %>



<div class="fieldcontain ${hasErrors(bean: mongoPersistentSessionInstance, field: 'attributes', 'error')} ">
	<label for="attributes">
		<g:message code="mongoPersistentSession.attributes.label" default="Attributes" />
		
	</label>
	

</div>

<div class="fieldcontain ${hasErrors(bean: mongoPersistentSessionInstance, field: 'creationTime', 'error')} ">
	<label for="creationTime">
		<g:message code="mongoPersistentSession.creationTime.label" default="Creation Time" />
		
	</label>
	<g:field type="number" name="creationTime" value="${mongoPersistentSessionInstance.creationTime}" />

</div>

<div class="fieldcontain ${hasErrors(bean: mongoPersistentSessionInstance, field: 'invalidated', 'error')} ">
	<label for="invalidated">
		<g:message code="mongoPersistentSession.invalidated.label" default="Invalidated" />
		
	</label>
	<g:checkBox name="invalidated" value="${mongoPersistentSessionInstance?.invalidated}" />

</div>

<div class="fieldcontain ${hasErrors(bean: mongoPersistentSessionInstance, field: 'lastAccessedTime', 'error')} ">
	<label for="lastAccessedTime">
		<g:message code="mongoPersistentSession.lastAccessedTime.label" default="Last Accessed Time" />
		
	</label>
	<g:field type="number" name="lastAccessedTime" value="${mongoPersistentSessionInstance.lastAccessedTime}" />

</div>

<div class="fieldcontain ${hasErrors(bean: mongoPersistentSessionInstance, field: 'maxInactiveInterval', 'error')} ">
	<label for="maxInactiveInterval">
		<g:message code="mongoPersistentSession.maxInactiveInterval.label" default="Max Inactive Interval" />
		
	</label>
	<g:field type="number" name="maxInactiveInterval" value="${mongoPersistentSessionInstance.maxInactiveInterval}" />

</div>

