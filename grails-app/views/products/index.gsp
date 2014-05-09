
<%@ page import="commercetrial.Products" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'products.label', default: 'Products')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-products" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(controller:'userAction', action:'goto_IndexPage')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-products" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<th><g:message code="products.categories.label" default="Categories" /></th>
					
						<g:sortableColumn property="description" title="${message(code: 'products.description.label', default: 'Description')}" />
					
						<g:sortableColumn property="image" title="${message(code: 'products.image.label', default: 'Image')}" />
					
						<g:sortableColumn property="price" title="${message(code: 'products.price.label', default: 'Price')}" />
					
						<g:sortableColumn property="productName" title="${message(code: 'products.productName.label', default: 'Product Name')}" />
					
						<g:sortableColumn property="title" title="${message(code: 'products.title.label', default: 'Title')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${productsInstanceList}" status="i" var="productsInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${productsInstance.id}">${fieldValue(bean: productsInstance, field: "categories")}</g:link></td>
					
						<td>${fieldValue(bean: productsInstance, field: "description")}</td>
					
						<td>${fieldValue(bean: productsInstance, field: "image")}</td>
					
						<td>${fieldValue(bean: productsInstance, field: "price")}</td>
					
						<td>${fieldValue(bean: productsInstance, field: "productName")}</td>
					
						<td>${fieldValue(bean: productsInstance, field: "title")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${productsInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
