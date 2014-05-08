
<%@ page import="commercetrial.Cart" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'cart.label', default: 'Cart')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-cart" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(action:'goto_indexPage', controller:'userAction')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-cart" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="image" title="${message(code: 'cart.image.label', default: 'Image')}" />
					
						<g:sortableColumn property="price" title="${message(code: 'cart.price.label', default: 'Price')}" />
					
						<g:sortableColumn property="productName" title="${message(code: 'cart.productName.label', default: 'Product Name')}" />
					
						<g:sortableColumn property="quantity" title="${message(code: 'cart.quantity.label', default: 'Quantity')}" />
					
						<g:sortableColumn property="total" title="${message(code: 'cart.total.label', default: 'Total')}" />
					
						<th><g:message code="cart.user_id.label" default="Userid" /></th>
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${cartInstanceList}" status="i" var="cartInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${cartInstance.id}">${fieldValue(bean: cartInstance, field: "image")}</g:link></td>
					
						<td>${fieldValue(bean: cartInstance, field: "price")}</td>
					
						<td>${fieldValue(bean: cartInstance, field: "productName")}</td>
					
						<td>${fieldValue(bean: cartInstance, field: "quantity")}</td>
					
						<td>${fieldValue(bean: cartInstance, field: "total")}</td>
					
						<td>${fieldValue(bean: cartInstance, field: "user_id")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${cartInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
