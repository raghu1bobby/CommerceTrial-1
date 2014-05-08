
<%@ page import="commercetrial.Cart" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'cart.label', default: 'Cart')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-cart" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(action:'goto_indexPage', controller:'userAction')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-cart" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list cart">
			
				<g:if test="${cartInstance?.image}">
				<li class="fieldcontain">
					<span id="image-label" class="property-label"><g:message code="cart.image.label" default="Image" /></span>
					
						<span class="property-value" aria-labelledby="image-label"><g:fieldValue bean="${cartInstance}" field="image"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${cartInstance?.price}">
				<li class="fieldcontain">
					<span id="price-label" class="property-label"><g:message code="cart.price.label" default="Price" /></span>
					
						<span class="property-value" aria-labelledby="price-label"><g:fieldValue bean="${cartInstance}" field="price"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${cartInstance?.productName}">
				<li class="fieldcontain">
					<span id="productName-label" class="property-label"><g:message code="cart.productName.label" default="Product Name" /></span>
					
						<span class="property-value" aria-labelledby="productName-label"><g:fieldValue bean="${cartInstance}" field="productName"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${cartInstance?.quantity}">
				<li class="fieldcontain">
					<span id="quantity-label" class="property-label"><g:message code="cart.quantity.label" default="Quantity" /></span>
					
						<span class="property-value" aria-labelledby="quantity-label"><g:fieldValue bean="${cartInstance}" field="quantity"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${cartInstance?.total}">
				<li class="fieldcontain">
					<span id="total-label" class="property-label"><g:message code="cart.total.label" default="Total" /></span>
					
						<span class="property-value" aria-labelledby="total-label"><g:fieldValue bean="${cartInstance}" field="total"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${cartInstance?.user_id}">
				<li class="fieldcontain">
					<span id="user_id-label" class="property-label"><g:message code="cart.user_id.label" default="Userid" /></span>
					
						<span class="property-value" aria-labelledby="user_id-label"><g:link controller="user" action="show" id="${cartInstance?.user_id?.id}">${cartInstance?.user_id?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:cartInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${cartInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
