
<%@ page import="com.monochromeroad.grails.plugins.mongodbsession.MongoPersistentSession" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'mongoPersistentSession.label', default: 'MongoPersistentSession')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-mongoPersistentSession" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-mongoPersistentSession" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="attributes" title="${message(code: 'mongoPersistentSession.attributes.label', default: 'Attributes')}" />
					
						<g:sortableColumn property="creationTime" title="${message(code: 'mongoPersistentSession.creationTime.label', default: 'Creation Time')}" />
					
						<g:sortableColumn property="invalidated" title="${message(code: 'mongoPersistentSession.invalidated.label', default: 'Invalidated')}" />
					
						<g:sortableColumn property="lastAccessedTime" title="${message(code: 'mongoPersistentSession.lastAccessedTime.label', default: 'Last Accessed Time')}" />
					
						<g:sortableColumn property="maxInactiveInterval" title="${message(code: 'mongoPersistentSession.maxInactiveInterval.label', default: 'Max Inactive Interval')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${mongoPersistentSessionInstanceList}" status="i" var="mongoPersistentSessionInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${mongoPersistentSessionInstance.id}">${fieldValue(bean: mongoPersistentSessionInstance, field: "attributes")}</g:link></td>
					
						<td>${fieldValue(bean: mongoPersistentSessionInstance, field: "creationTime")}</td>
					
						<td><g:formatBoolean boolean="${mongoPersistentSessionInstance.invalidated}" /></td>
					
						<td>${fieldValue(bean: mongoPersistentSessionInstance, field: "lastAccessedTime")}</td>
					
						<td>${fieldValue(bean: mongoPersistentSessionInstance, field: "maxInactiveInterval")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${mongoPersistentSessionInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
