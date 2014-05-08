
<%@ page import="com.monochromeroad.grails.plugins.mongodbsession.MongoPersistentSession" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'mongoPersistentSession.label', default: 'MongoPersistentSession')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-mongoPersistentSession" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-mongoPersistentSession" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list mongoPersistentSession">
			
				<g:if test="${mongoPersistentSessionInstance?.attributes}">
				<li class="fieldcontain">
					<span id="attributes-label" class="property-label"><g:message code="mongoPersistentSession.attributes.label" default="Attributes" /></span>
					
						<span class="property-value" aria-labelledby="attributes-label"><g:fieldValue bean="${mongoPersistentSessionInstance}" field="attributes"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${mongoPersistentSessionInstance?.creationTime}">
				<li class="fieldcontain">
					<span id="creationTime-label" class="property-label"><g:message code="mongoPersistentSession.creationTime.label" default="Creation Time" /></span>
					
						<span class="property-value" aria-labelledby="creationTime-label"><g:fieldValue bean="${mongoPersistentSessionInstance}" field="creationTime"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${mongoPersistentSessionInstance?.invalidated}">
				<li class="fieldcontain">
					<span id="invalidated-label" class="property-label"><g:message code="mongoPersistentSession.invalidated.label" default="Invalidated" /></span>
					
						<span class="property-value" aria-labelledby="invalidated-label"><g:formatBoolean boolean="${mongoPersistentSessionInstance?.invalidated}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${mongoPersistentSessionInstance?.lastAccessedTime}">
				<li class="fieldcontain">
					<span id="lastAccessedTime-label" class="property-label"><g:message code="mongoPersistentSession.lastAccessedTime.label" default="Last Accessed Time" /></span>
					
						<span class="property-value" aria-labelledby="lastAccessedTime-label"><g:fieldValue bean="${mongoPersistentSessionInstance}" field="lastAccessedTime"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${mongoPersistentSessionInstance?.maxInactiveInterval}">
				<li class="fieldcontain">
					<span id="maxInactiveInterval-label" class="property-label"><g:message code="mongoPersistentSession.maxInactiveInterval.label" default="Max Inactive Interval" /></span>
					
						<span class="property-value" aria-labelledby="maxInactiveInterval-label"><g:fieldValue bean="${mongoPersistentSessionInstance}" field="maxInactiveInterval"/></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:mongoPersistentSessionInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${mongoPersistentSessionInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
