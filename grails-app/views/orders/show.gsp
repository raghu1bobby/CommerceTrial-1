
<%@ page import="commercetrial.Orders" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'orders.label', default: 'Orders')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-orders" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(controller:'userAction', action:'goto_IndexPage')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-orders" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list orders">
			
				<g:if test="${ordersInstance?.orderDate}">
				<li class="fieldcontain">
					<span id="orderDate-label" class="property-label"><g:message code="orders.orderDate.label" default="Order Date" /></span>
					
						<span class="property-value" aria-labelledby="orderDate-label"><g:formatDate date="${ordersInstance?.orderDate}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${ordersInstance?.order_status}">
				<li class="fieldcontain">
					<span id="order_status-label" class="property-label"><g:message code="orders.order_status.label" default="Orderstatus" /></span>
					
						<span class="property-value" aria-labelledby="order_status-label"><g:fieldValue bean="${ordersInstance}" field="order_status"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${ordersInstance?.total}">
				<li class="fieldcontain">
					<span id="total-label" class="property-label"><g:message code="orders.total.label" default="Total" /></span>
					
						<span class="property-value" aria-labelledby="total-label"><g:fieldValue bean="${ordersInstance}" field="total"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${ordersInstance?.user_id}">
				<li class="fieldcontain">
					<span id="user_id-label" class="property-label"><g:message code="orders.user_id.label" default="Userid" /></span>
					
						<span class="property-value" aria-labelledby="user_id-label"><g:link controller="user" action="show" id="${ordersInstance?.user_id?.id}">${ordersInstance?.user_id?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:ordersInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${ordersInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
